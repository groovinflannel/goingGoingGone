package com.example.goinggoinggonequizapp.ui

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.goinggoinggonequizapp.R
import com.example.goinggoinggonequizapp.model.Question
import com.example.goinggoinggonequizapp.utils.Constants

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var textViewQuestion: TextView
    private lateinit var countryOutline: ImageView
    private lateinit var textViewOption1: TextView
    private lateinit var textViewOption2: TextView
    private lateinit var textViewOption3: TextView
    private lateinit var textViewOption4: TextView

    private lateinit var checkButton: Button

    private val currentQuestion = 1
    private lateinit var questionsList: MutableList<Question>
    private val selectedOptionPosition = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        textViewQuestion = findViewById(R.id.question_text_view)
        countryOutline = findViewById(R.id.image_country)
        textViewOption1 = findViewById(R.id.text_view_option_1)
        textViewOption2 = findViewById(R.id.text_view_option_2)
        textViewOption3 = findViewById(R.id.text_view_option_3)
        textViewOption4 = findViewById(R.id.text_view_option_4)
        checkButton = findViewById(R.id.check_answer_button)


        questionsList = Constants.getQuestions()
        Log.d("QuestionsListSize", "${questionsList.size}")

        setQuestion()
    }

    private fun setQuestion() {
        val question = questionsList[currentQuestion - 1]
        countryOutline.setImageResource(question.image)
        textViewQuestion.text = question.question
        textViewOption1.text = question.choiceOne
        textViewOption2.text = question.choiceTwo
        textViewOption3.text = question.choiceThree
        textViewOption4.text = question.choiceFour

        if (currentQuestion == questionsList.size) {
            checkButton.text = "Finish Quiz"
        } else {
            checkButton.text = "Submit"
        }
    }

    private fun resetAnswers() {
        val answers = mutableListOf<TextView>()
        answers.add(textViewOption1)
        answers.add(textViewOption2)
        answers.add(textViewOption3)
        answers.add(textViewOption4)

        for (answer in answers) {
            answer.setTextColor(Color.parseColor("#7A8089"))
            answer.typeface = Typeface.DEFAULT
            answer.background = ContextCompat.getDrawable(
                this,
                R.drawable.option_border_bg
            )
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {

        }
    }
}