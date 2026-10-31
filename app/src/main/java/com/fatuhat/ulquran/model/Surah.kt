package com.fatuhat.ulquran

import android.content.Context

data class Ayah(
    val number: Int,
    val arabic: String,
    val translation: String
)

data class Surah(
    val id: Int,
    val nameArabic: String,
    val nameEnglish: String,
    val transliteration: String,
    val place: String,
    val verses: List<Ayah>
)

class QuranRepository(private val context: Context) {
    fun getSurahs(): List<Surah> = listOf(
        Surah(
            id = 1,
            nameArabic = "الفاتحة",
            nameEnglish = "Al-Fatihah",
            transliteration = "Al-Fatihah",
            place = "Makkah",
            verses = listOf(
                Ayah(1, "بِسْمِ ٱللّٰهِ ٱلرَّحْمٰنِ ٱلرَّحِيمِ", "In the name of Allah, the Most Gracious, the Most Merciful."),
                Ayah(2, "ٱلْحَمْدُ لِلّٰهِ رَبِّ ٱلْعٰلَمِين", "All praise is due to Allah, the Lord of all worlds."),
                Ayah(3, "ٱلرَّحْمٰنِ ٱلرَّحِيمِ", "The Most Gracious, the Most Merciful."),
                Ayah(4, "مٰلِكِ يَوْمِ ٱلدِّينِ", "Master of the Day of Judgment."),
                Ayah(5, "إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ", "You alone we worship, and You alone we ask for help."),
                Ayah(6, "ٱهْدِنَا ٱلصِّرٰطَ ٱلْمُسْتَقِيمَ", "Guide us to the straight path."),
                Ayah(7, "صِرٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ", "The path of those upon whom You have bestowed favor."),
                Ayah(8, "غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ", "Not of those who have evoked Your anger or went astray.")
            )
        ),
        Surah(
            id = 2,
            nameArabic = "البقرة",
            nameEnglish = "Al-Baqarah",
            transliteration = "Al-Baqarah",
            place = "Madinah",
            verses = listOf(
                Ayah(1, "الم", "Alif, Lam, Meem."),
                Ayah(2, "ذَٰلِكَ ٱلْكِتٰبُ لَا رَيْبَ فِيهِ", "This is the Book about which there is no doubt."),
                Ayah(3, "هُدًى لِّلْمُتَّقِينَ", "A guidance for the righteous."),
                Ayah(4, "ٱلَّذِينَ يُؤْمِنُونَ بِٱلْغَيْبِ", "Who believe in the unseen."),
                Ayah(5, "وَيُقِيمُونَ ٱلصَّلَوٰةَ", "And establish prayer."),
                Ayah(6, "وَمِنَ ٱلنَّاسِ مَن يَقُولُ", "And among the people are those who say..."),
                Ayah(7, "أُو۟لَٰٓئِكَ عَلَىٰ هُدًى", "Those are [truly] upon guidance."),
                Ayah(8, "وَمَا يَذَّكَّرُ إِلَّآ أُو۟لُوا۟ ٱلْأَلْبَابِ", "But only the people of understanding are reminded.")
            )
        ),
        Surah(
            id = 3,
            nameArabic = "آل عمران",
            nameEnglish = "Ali 'Imran",
            transliteration = "Ali 'Imran",
            place = "Madinah",
            verses = listOf(
                Ayah(1, "الم", "Alif, Lam, Meem."),
                Ayah(2, "ٱللّٰهِ لَآ إِلٰهَ إِلَّا هُوَ", "Allah—there is no deity except Him."),
                Ayah(3, "ٱلْحَىُّ ٱلْقَيُّومُ", "The Ever-Living, the Sustainer of all."),
                Ayah(4, "نَزَّلَ عَلَيْكَ ٱلْكِتَٰبَ", "He sent down to you the Book."),
                Ayah(5, "وَأُو۟لَٰٓئِكَ هُمُ ٱلْمُفْلِحُونَ", "And it is those who are successful."),
                Ayah(6, "إِنَّ فِى خَلْقِ ٱلسَّمَٰوَٰتِ", "Indeed in the creation of the heavens and earth..."),
                Ayah(7, "وَعِندَهُۥ مَفَاتِحُ ٱلْغَيْبِ", "With Him are the keys of the unseen."),
                Ayah(8, "هُوَ ٱللّٰهُ رَبُّكُمْ", "He is Allah, your Lord.")
            )
        ),
        Surah(
            id = 4,
            nameArabic = "النساء",
            nameEnglish = "An-Nisa",
            transliteration = "An-Nisa",
            place = "Madinah",
            verses = listOf(
                Ayah(1, "يَٰٓأَيُّهَا ٱلنَّاسُ ٱتَّقُوا۟ رَبَّكُمُ", "O mankind, fear your Lord."),
                Ayah(2, "إِنَّ ٱللّٰهَ كَانَ بِٱلنَّاسِ رَحِيمًا", "Indeed, Allah is kind and merciful to people."),
                Ayah(3, "وَإِنْ خِفْتُمْ عَيْلَةً", "And if you fear poverty..."),
                Ayah(4, "وَلَا تَقْرَبُوا۟ ٱلْفَوَٰحِشَ", "And do not approach immorality."),
                Ayah(5, "وَٱللّٰهُ يَعْلَمُ مَا تَفْعَلُونَ", "Allah knows what you do."),
                Ayah(6, "وَإِنْ كَانَ ذُو عُسْرَةٍ", "And if someone is in hardship..."),
                Ayah(7, "إِنَّ ٱللّٰهَ لَغَفُورٌ رَّحِيمٌ", "Indeed, Allah is Forgiving and Merciful."),
                Ayah(8, "فَمَن يُرِدِ ٱللّٰهُ أَن يَهْدِيَهُۥ", "Whomever Allah wills to guide..." )
            )
        ),
        Surah(
            id = 5,
            nameArabic = "المائدة",
            nameEnglish = "Al-Ma'idah",
            transliteration = "Al-Ma'idah",
            place = "Madinah",
            verses = listOf(
                Ayah(1, "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟", "O you who believe."),
                Ayah(2, "أَوْفُوا۟ بِٱلْعُقُودِ", "Fulfill the contracts."),
                Ayah(3, "حُرِّمَتْ عَلَيْكُمُ ٱلْمَيْتَةُ", "Forbidden to you is carrion."),
                Ayah(4, "كُلٌّ مِّنْ أَصْلِهَا", "Each from its origin."),
                Ayah(5, "وَٱللّٰهُ عَلِيمٌ حَكِيمٌ", "Allah is All-Knowing, All-Wise."),
                Ayah(6, "وَلَا تَقْتُلُوا۟ ٱلنَّفْسَ", "And do not kill yourselves."),
                Ayah(7, "فَإِنَّ ٱللّٰهَ غَفُورٌ رَّحِيمٌ", "Indeed, Allah is Forgiving and Merciful."),
                Ayah(8, "إِنَّ ٱللّٰهَ خَيْرُ ٱلرَّٰزِقِينَ", "Indeed, Allah is the best of providers.")
            )
        )
    )

    fun getById(id: Int): Surah? = getSurahs().firstOrNull { it.id == id }
}
