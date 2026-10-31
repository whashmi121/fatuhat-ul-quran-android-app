package com.fatuhat.ulquran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SurahAdapter(
    private val allSurahs: List<Surah>,
    private val onItemClick: (Surah) -> Unit
) : RecyclerView.Adapter<SurahAdapter.SurahViewHolder>() {

    private var filteredSurahs: List<Surah> = allSurahs

    fun filter(query: String) {
        filteredSurahs = if (query.isBlank()) {
            allSurahs
        } else {
            allSurahs.filter {
                it.name.contains(query, ignoreCase = true) ||
                    it.transliteration.contains(query, ignoreCase = true) ||
                    it.englishName.contains(query, ignoreCase = true)
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
        holder.bind(surah)
        holder.itemView.setOnClickListener {
            onItemClick(surah)
        }
    }

    override fun getItemCount(): Int = filteredSurahs.size

    class SurahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.surahTitleText)
        private val detailTextView: TextView = itemView.findViewById(R.id.surahDetailText)

        fun bind(surah: Surah) {
            titleTextView.text = "${surah.number}. ${surah.name}"
            detailTextView.text = "${surah.transliteration} • ${surah.englishName}"
        }
    }
}
