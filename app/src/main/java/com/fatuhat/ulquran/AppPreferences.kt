package com.fatuhat.ulquran

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager

class AppPreferences(context: Context) {
    private val prefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    fun toggleFavorite(surahId: Int) {
        val key = "favorite_surah_$surahId"
        val current = prefs.getBoolean(key, false)
        prefs.edit().putBoolean(key, !current).apply()
    }

    fun isFavorite(surahId: Int): Boolean = prefs.getBoolean("favorite_surah_$surahId", false)

    fun getFavoriteIds(): Set<String> = prefs.all.keys.filter { it.startsWith("favorite_surah_") && prefs.getBoolean(it, false) }.toSet()
}
