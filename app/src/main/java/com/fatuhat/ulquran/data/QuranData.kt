package com.fatuhat.ulquran

object QuranData {
    fun getSurahs(): List<Surah> {
        return listOf(
            Surah(
                number = 1,
                name = "الفاتحة",
                transliteration = "Al-Fatihah",
                englishName = "The Opening",
                verses = listOf(
                    Verse(1, "بِسْمِ ٱللّٰهِ ٱلرَّحْمٰنِ ٱلرَّحِيمِ", "In the name of Allah, the Most Gracious, the Most Merciful."),
                    Verse(2, "ٱلْحَمْدُ لِلّٰهِ رَبِّ ٱلْعٰلَمِين", "All praise is for Allah, Lord of all worlds."),
                    Verse(3, "ٱلرَّحْمٰنِ ٱلرَّحِيمِ", "The Most Gracious, the Most Merciful."),
                    Verse(4, "مٰلِكِ يَوْمِ ٱلدِّينِ", "Master of the Day of Judgment."),
                    Verse(5, "إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ", "You alone we worship, and You alone we ask for help."),
                    Verse(6, "ٱهْدِنَا ٱلصِّرٰطَ ٱلْمُسْتَقِيمَ", "Guide us on the straight path."),
                    Verse(7, "صِرٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ", "The path of those You have blessed."),
                    Verse(8, "غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ", "Not the path of those who earned Your anger or went astray.")
                )
            ),
            Surah(
                number = 2,
                name = "البقرة",
                transliteration = "Al-Baqarah",
                englishName = "The Cow",
                verses = listOf(
                    Verse(1, "الم", "Alif, Lam, Meem."),
                    Verse(2, "ذَٰلِكَ ٱلْكِتٰبُ لَا رَيْبَ فِيهِ", "This is the Book about which there is no doubt."),
                    Verse(3, "هُدًى لِّلْمُتَّقِينَ", "A guide for the righteous."),
                    Verse(4, "ٱلَّذِينَ يُؤْمِنُونَ بِٱلْغَيْبِ", "Who believe in the unseen."),
                    Verse(5, "وَيُقِيمُونَ ٱلصَّلَوٰةَ", "And establish prayer."),
                    Verse(6, "وَمِنَ ٱلنَّاسِ مَن يَقُولُ", "And among people there are those who say...")
                )
            ),
            Surah(
                number = 3,
                name = "آل عمران",
                transliteration = "Ali 'Imran",
                englishName = "Family of Imran",
                verses = listOf(
                    Verse(1, "الم", "Alif, Lam, Meem."),
                    Verse(2, "ٱللّٰهِ لَا إِلٰهَ إِلَّا هُوَ", "Allah—there is no deity except Him."),
                    Verse(3, "ٱلْحَيُّ ٱلْقَيُّومُ", "The Ever-Living, the Sustainer of all."),
                    Verse(4, "نَزَّلَ عَلَيْكَ ٱلْكِتٰبَ", "He sent down the Book to you."),
                    Verse(5, "قُلْ إِنَّ ٱللّٰهَ يَدْعُو", "Say: Indeed, Allah calls."),
                    Verse(6, "وَٱللّٰهُ خَيْرُ ٱلرِّزِقِينَ", "And Allah is the best of providers.")
                )
            ),
            Surah(
                number = 4,
                name = "النساء",
                transliteration = "An-Nisa",
                englishName = "The Women",
                verses = listOf(
                    Verse(1, "يٰٓأَيُّهَا ٱلنَّاسُ ٱتَّقُوا۟ رَبَّكُمُ", "O mankind, fear your Lord."),
                    Verse(2, "إِنَّ ٱللّٰهَ كَانَ بِٱلنَّاسِ رَحِيمًا", "Indeed, Allah is Most Merciful to people."),
                    Verse(3, "وَأَتِمُّوا۟ ٱلْحَجَّ وَٱلْعُمْرَةَ", "Complete the pilgrimage and Umrah."),
                    Verse(4, "وَإِنْ خِفْتُمْ عَيْلَةً", "If you fear poverty."),
                    Verse(5, "فَإِنْ أَحْصَنَّ ٱلْأَخْرَجَ", "If they are modest."),
                    Verse(6, "وَٱللّٰهُ يَعْلَمُ مَا تَفْعَلُونَ", "Allah knows what you do.")
                )
            ),
            Surah(
                number = 5,
                name = "المائدة",
                transliteration = "Al-Ma'idah",
                englishName = "The Table Spread",
                verses = listOf(
                    Verse(1, "يٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟", "O you who have believed."),
                    Verse(2, "أَوْفُوا۟ بِٱلْعُقُودِ", "Fulfill all contracts."),
                    Verse(3, "حُرِّمَتْ عَلَيْكُمُ ٱلْمَيْتَةُ", "Forbidden to you are carrion."),
                    Verse(4, "وَٱللّٰهُ عَلِيمٌ حَكِيمٌ", "Allah is All-Knowing, All-Wise."),
                    Verse(5, "وَلَا تَقْتُلُوا۟ ٱلنَّفْسَ", "Do not kill yourselves."),
                    Verse(6, "إِنَّ ٱللّٰهَ كَانَ غَفُورًا رَّحِيمًا", "Indeed, Allah is Forgiving and Merciful.")
                )
            )
        )
    }
}
