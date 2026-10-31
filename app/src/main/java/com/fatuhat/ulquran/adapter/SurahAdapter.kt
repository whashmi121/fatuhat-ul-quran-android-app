package com.fatuhat.ulquran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SurahAdapter(
    private val allSurahs: List<Surah>,
    private val prefs: AppPreferences,
    private val onItemClick: (Surah) -> Unit
) : RecyclerView.Adapter<SurahAdapter.SurahViewHolder>() {

    private var filteredSurahs: List<Surah> = allSurahs

    fun filter(query: String) {
        filteredSurahs = if (query.isBlank()) {
            allSurahs
        } else {
            allSurahs.filter {
                it.nameArabic.contains(query, ignoreCase = true) ||
                    it.nameEnglish.contains(query, ignoreCase = true) ||
                    it.transliteration.contains(query, ignoreCase = true)
            }
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurahViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_surah, parent, false)
        return SurahViewHolder(view)
    }

    override fun onBindViewHolder(holder: SurahViewHolder, position: Int) {
        val surah = filteredSurahs[position]
        holder.bind(surah, prefs)

        holder.itemView.setOnClickListener {
            onItemClick(surah)
        }

        holder.favoriteButton.setOnClickListener {
            prefs.toggleFavorite(surah.id)
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int = filteredSurahs.size

    class SurahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val favoriteButton: ImageButton = itemView.findViewById(R.id.favoriteButton)
        private val titleTextView: TextView = itemView.findViewById(R.id.surahTitleText)
        private val detailTextView: TextView = itemView.findViewById(R.id.surahDetailText)

        fun bind(surah: Surah, prefs: AppPreferences) {
            titleTextView.text = "${surah.id}. ${surah.nameArabic}"
            detailTextView.text = "${surah.transliteration} • ${surah.nameEnglish}"
            favoriteButton.setImageResource(
                if (prefs.isFavorite(surah.id)) android.R.drawable.star_big_on else android.R.drawable.star_big_off
            )
        }
    }
}
