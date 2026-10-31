package com.fatuhat.ulquran

data class Surah(
    val number: Int,
    val name: String,
    val transliteration: String,
    val englishName: String,
    val verses: List<Verse>
)

data class Verse(
    val number: Int,
    val arabic: String,
    val translation: String
)
