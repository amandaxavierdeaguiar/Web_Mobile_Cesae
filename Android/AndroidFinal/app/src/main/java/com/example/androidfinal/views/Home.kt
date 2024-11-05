package com.example.androidfinal.views

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidfinal.R
import com.example.androidfinal.adapter.ProdutoListAdapter
import com.example.androidfinal.data.ProdutoMock
import com.example.androidfinal.databinding.ActivityHomeBinding
import com.example.androidfinal.model.Produto
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class Home : AppCompatActivity() {

    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    private val auth by lazy {
        FirebaseAuth.getInstance()
    }

    private val db by lazy {
        FirebaseFirestore.getInstance()
    }

    private val carrinho = ArrayList<Produto>() // Lista para armazenar produtos do carrinho

    /* Colocando a tela tamanho fullScreen*/
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        /* Impedirá que a tela apague com o bloqueio automatico */

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        /* Puxando conteúdo para aparecer a lista de produtos */

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val mock = ProdutoMock()
        binding.recyclerView.adapter = ProdutoListAdapter(mock.listaProdutos){ produto ->
            adicionarAoCarrinho(produto) // Adiciona o produto ao carrinho
        }

        binding.imgCart.setOnClickListener {
            mostrarCarrinho() // Chama a função para mostrar o carrinho
        }


        /* Adicionando a Bateria com imagens */

        val bateria: BroadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                if (intent != null) {
                    val nivel: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0)
                    val escala: Int = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 100)
                    val nivelPorcentagem = (nivel * 100) / escala // Calcula o nível de bateria em porcentagem

                    // Atualiza a imagem da bateria com base no nível
                    when {
                        nivelPorcentagem <= 20 -> binding.imageBateria.setImageResource(R.drawable.battery_20)
                        nivelPorcentagem in 21..40 -> binding.imageBateria.setImageResource(R.drawable.battery_40)
                        nivelPorcentagem in 41..60 -> binding.imageBateria.setImageResource(R.drawable.battery_60)
                        nivelPorcentagem in 61..80 -> binding.imageBateria.setImageResource(R.drawable.battery_80)
                        else -> binding.imageBateria.setImageResource(R.drawable.battery_full)
                    }
                }
            }
        }

        // Registrar o receiver para receber atualizações de bateria
        registerReceiver(bateria, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }


    private fun adicionarAoCarrinho(produto: Produto) {
        carrinho.add(produto)

        // Quando clicar em comprar, vai para a BD e para o carrinho do Utilizador

        if (auth.currentUser != null) {
            db.collection("carrinho").document(auth.currentUser!!.uid.toString())
                .collection("produtos")
                .document(produto.modelo.replace(" ", ""))
                .set(produto)
            Toast.makeText(this, "${produto.modelo} adicionado ao carrinho!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun mostrarCarrinho() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_carrinho)

        val textCarrinho: TextView = dialog.findViewById(R.id.text_carrinho)
        val textTotal: TextView = dialog.findViewById(R.id.text_total)
        val buttonFechar: Button = dialog.findViewById(R.id.button_fechar)

        // Exibir os produtos do carrinho com índice
        val produtosCarrinho = carrinho.mapIndexed { index, produto ->
            "${index + 1}. ${produto.modelo} - R$ ${produto.preco}"
        }.joinToString("\n")
        // Exibir os produtos do carrinho
        // val produtosCarrinho = carrinho.joinToString("\n") { "${it.modelo} - R$ ${it.preco}" }
        textCarrinho.text = if (produtosCarrinho.isNotEmpty()) produtosCarrinho else "Carrinho vazio"

        // Calcular a soma total
        val total = carrinho.sumOf { it.preco }
        textTotal.text = "Total: R$ ${"%.2f".format(total)}" // Formatação para duas casas decimais

        // Adicionar funcionalidade de remoção
        val inputRemover: EditText = dialog.findViewById(R.id.input_remover) // Adicione um EditText no layout para entrada do índice
        val buttonRemover: Button = dialog.findViewById(R.id.button_remover) // Adicione um botão para remover o produto

        buttonRemover.setOnClickListener {
            val indexToRemove = inputRemover.text.toString().toIntOrNull()
            if (indexToRemove != null && indexToRemove in 1..carrinho.size) {
                /* Excluir do BD */
                var indexProduto = carrinho.get(indexToRemove-1)

                println("Passou"+indexProduto.toString())

                if (auth.currentUser != null) {
                    db.collection("carrinho").document(auth.currentUser!!.uid.toString())
                        .collection("produtos")
                        .document(indexProduto.modelo.replace(" ", ""))
                        .delete()
                    Toast.makeText(this, "${indexProduto.modelo} removido do carrinho!", Toast.LENGTH_SHORT).show()
                }

                carrinho.removeAt(indexToRemove - 1) // Remove o produto pelo índice
                Toast.makeText(this, "Produto removido!", Toast.LENGTH_SHORT).show()
                mostrarCarrinho() // Atualiza a exibição do carrinho
            } else {
                Toast.makeText(this, "Índice inválido!", Toast.LENGTH_SHORT).show()
            }
        }

        buttonFechar.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}