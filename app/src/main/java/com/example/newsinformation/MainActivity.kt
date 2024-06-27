package com.example.newsinformation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsinformation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.rvinformation.layoutManager = LinearLayoutManager(this)
        displayAuthors()

    }
    fun displayAuthors(){
        val author1 = Author("","Maureen", "Born","20,june,2024","this book explains more about the ","link","","readMore")
        val author2 = Author("","Maureen", "Born","20,june,2024","this book explains more about the ","link","","readMore")
        val author3 = Author("","Maureen", "Born","20,june,2024","this book explains more about the ","link","","readMore")
        val author = listOf(author1,author2,author3)
        val postAdapter = Adapter(author)
        binding.rvinformation.adapter=postAdapter



    }

}
