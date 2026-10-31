package com.fatuhat.ulquran

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: SurahAdapter
    private val allSurahs = QuranData.getSurahs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.surahRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = SurahAdapter(allSurahs) { surah ->
            val intent = Intent(this, SurahDetailActivity::class.java)
            intent.putExtra("SURAH_NUMBER", surah.number)
            startActivity(intent)
        }
        recyclerView.adapter = adapter

        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapter.filter(s.toString())
            }
            override fun afterTextChanged(s: Editable?) = Unit
        })
    }
}
