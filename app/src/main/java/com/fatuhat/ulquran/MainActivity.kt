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

    private lateinit var repository: QuranRepository
    private lateinit var adapter: SurahAdapter
    private lateinit var prefs: AppPreferences
    private var allSurahs: List<Surah> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repository = QuranRepository(this)
        prefs = AppPreferences(this)
        allSurahs = repository.getSurahs()

        val recyclerView = findViewById<RecyclerView>(R.id.surahRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = SurahAdapter(allSurahs, prefs) { surah ->
            val intent = Intent(this, SurahDetailActivity::class.java)
            intent.putExtra("SURAH_ID", surah.id)
            startActivity(intent)
        }
        recyclerView.adapter = adapter

        findViewById<EditText>(R.id.searchEditText).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s.toString()
                adapter.filter(query)
            }
            override fun afterTextChanged(s: Editable?) = Unit
        })
    }
}
