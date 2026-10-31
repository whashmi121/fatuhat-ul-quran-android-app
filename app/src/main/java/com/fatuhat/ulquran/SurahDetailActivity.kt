package com.fatuhat.ulquran

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SurahDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surah_detail)

        val repository = QuranRepository(this)
        val surahId = intent.getIntExtra("SURAH_ID", 1)
        val surah = repository.getById(surahId) ?: repository.getSurahs().first()

        val titleView = findViewById<TextView>(R.id.detailTitle)
        val subTitleView = findViewById<TextView>(R.id.detailSubtitle)
        val verseContainer = findViewById<LinearLayout>(R.id.verseContainer)

        titleView.text = "${surah.nameArabic} • ${surah.nameEnglish}"
        subTitleView.text = "${surah.transliteration} • ${surah.place}"

        title = surah.nameEnglish

        for (ayah in surah.verses) {
            val textView = TextView(this).apply {
                text = "${ayah.number}. ${ayah.arabic}\n${ayah.translation}"
                setPadding(24, 18, 24, 18)
                textSize = 17f
                setLineSpacing(10f, 1.2f)
            }
            verseContainer.addView(textView)
        }
    }
}
