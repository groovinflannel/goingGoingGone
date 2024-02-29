package com.example.goinggoinggonequizapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.goinggoinggonequizapp.R
import com.example.goinggoinggonequizapp.utils.Constants

class QuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionsList = Constants.getQuestions()
        Log.d("QuestionsListSize", "${questionsList.size}")
    }
}