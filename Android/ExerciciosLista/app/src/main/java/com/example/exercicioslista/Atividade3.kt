package com.example.exercicioslista

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslista.databinding.ActivityAtividade3Binding

class Atividade3 : AppCompatActivity() {
    private val binding by lazy{
        ActivityAtividade3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        val listaAlunos = ArrayList<Aluno>()

        listaAlunos.add(Aluno("Amanda", "Rua 123, Vila Nova de Gaia", "amanda@amanda.pt"))
        listaAlunos.add(Aluno("Adilson", "Rua 456, Vila Nova de Gaia", "adilson@adilson.pt"))
        listaAlunos.add(Aluno("Bianca", "Rua 789, Vila Nova de Gaia", "bianca@bianca.pt"))
        listaAlunos.add(Aluno("Aurélio", "Rua 1011, Vila Nova de Gaia", "aurelio@aurelio.pt"))
        listaAlunos.add(Aluno("Andrea", "Rua 1012, Vila Nova de Gaia", "andrea@andrea.pt"))

        val arrayAdapter = ArrayAdapter(this, R.layout.simple_list_item_1, listaAlunos)
        binding.listaNomeDosAlunos.adapter = arrayAdapter

        binding.listaNomeDosAlunos.setOnItemClickListener {parent, view, position, id ->
            val i: Intent = Intent(this, Atividade3Dados::class.java)
            i.putExtra("nome_aluno", listaAlunos.get(position).nome)
            i.putExtra("morada_aluno", listaAlunos.get(position).morada)
            i.putExtra("email_aluno", listaAlunos.get(position).email)

            startActivity(i)
        }
    }
}