package com.alienesyorulmaz.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alienesyorulmaz.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



    }

    fun Topla(view: View){
        number1 = binding.editTextBirinciSayi.text.toString().toDoubleOrNull()
        number2 = binding.editTextIkinciSayi.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = number1!! + number2!!
            binding.textView.text ="Sonuç: ${result}"
        }
        else{
            binding.textView.text = "Lütfen Numara Giriniz"
            
        }
    }

    fun Cikar(view: View){
        number1 = binding.editTextBirinciSayi.text.toString().toDoubleOrNull()
        number2 = binding.editTextIkinciSayi.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = number1!! - number2!!
            binding.textView.text ="Sonuç: ${result}"
        }
        else{
            binding.textView.text = "Lütfen Numara Giriniz"
        }
    }

    fun Carp(view: View){
        number1 = binding.editTextBirinciSayi.text.toString().toDoubleOrNull()
        number2 = binding.editTextIkinciSayi.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = number1!! * number2!!
            binding.textView.text ="Sonuç: ${result}"
        }
        else{
            binding.textView.text = "Lütfen Numara Giriniz"
        }
    }

    fun Bol(view: View){
        number1 = binding.editTextBirinciSayi.text.toString().toDoubleOrNull()
        number2 = binding.editTextIkinciSayi.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = number1!! / number2!!
            binding.textView.text ="Sonuç: ${result}"
        }
        else{
            binding.textView.text = "Lütfen Numara Giriniz"
        }
    }
}