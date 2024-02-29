package com.example.goinggoinggonequizapp.utils

import com.example.goinggoinggonequizapp.R
import com.example.goinggoinggonequizapp.model.Question

object Constants {

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()
        val question1 = Question(
            1,
            "What country is this?",
            R.drawable.us,
            "Italy",
            "United States",
            "Russia",
            "Brazil",
            2
        )
        questions.add(question1)

        val question2 = Question(
            2,
            "What country is this?",
            R.drawable.china,
            "China",
            "Brazil",
            "Ireland",
            "Canada",
            1
        )
        questions.add(question2)

        val question3 = Question(
            3,
            "What country is this?",
            R.drawable.uk,
            "Sweden",
            "Canada",
            "Mexico",
            "United Kingdom",
            4
        )
        questions.add(question3)

        val question4 = Question(
            4,
            "What country is this?",
            R.drawable.india,
            "China",
            "Malaysia",
            "India",
            "Australia",
            3
        )
        questions.add(question4)

        val question5 = Question(
            5,
            "What country is this?",
            R.drawable.russia,
            "Russia",
            "Finland",
            "Japan",
            "Switzerland",
            1
        )
        questions.add(question5)
        return questions
    }

}