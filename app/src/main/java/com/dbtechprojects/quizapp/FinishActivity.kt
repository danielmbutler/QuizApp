package com.dbtechprojects.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username

        val totalquestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0 ) // if INT is missing use 0
        val correctanswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctanswers out of $totalquestions"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}