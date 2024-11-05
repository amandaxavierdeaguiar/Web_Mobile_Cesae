package com.example.inputuser

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.inputuser.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /* EXERCICIO 1 */

        binding.sayHello.setOnClickListener {
            val txtName : String = binding.inputFirstName.text.toString()
            val txtLastName: String = binding.inputLastName.text.toString()
            if(txtName.isNullOrEmpty() || txtLastName.isNullOrEmpty()){
                    binding.textComplet.text = "Campos não Inseridos! "
            } else {
                binding.textComplet.text = "Olá $txtName $txtLastName "
            }
        }

        /* EXERCICIO 2 */
        /*binding.sayHello.setOnClickListener {
            val txtName : String = binding.inputFirstName.text.toString()
            val txtLastName: String = binding.inputLastName.text.toString()*/
        /*TOAST É TIPO UM ALERT*/
            //Toast.makeText(applicationContext, "Olá ${txtName} ${txtLastName}", Toast.LENGTH_SHORT).show()
        //}


    }


}