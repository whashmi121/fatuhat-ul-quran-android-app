package com.fatuhat.ulquran

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SurahDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surah_detail)

        val surahNumber = intent.getIntExtra("SURAH_NUMBER", 1)
        val surah = QuranData.getSurahs().firstOrNull { it.number == surahNumber }
            ?: QuranData.getSurahs().first()

        val headerTitle = findViewById<TextView>(R.id.surahHeaderTitle)
        val verseContainer = findViewById<LinearLayout>(R.id.verseContainer)

        headerTitle.text = getString(
            R.string.surah_header,
            surah.name,
            surah.transliteration,
            surah.englishName
        )

        title = surah.name

        for (verse in surah.verses) {
            val verseView = TextView(this).apply {
                text = "${verse.number}. ${verse.arabic}\n${verse.translation}"
                setPadding(24, 16, 24, 16)
                textSize = 18f
                setLineSpacing(8f, 1.2f)
            }
            verseContainer.addView(verseView)
        }
    }
}
