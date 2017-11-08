package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TEAM_A_SCORE = "TEAM_A_SCORE"
    val TEAM_B_SCORE = "TEAM_B_SCORE"
    val TEAM_A_FINES = "TEAM_A_FINES"
    val TEAM_B_FINES = "TEAM_B_FINES"

    var firstTeamScore = 0
    var secondTeamScore = 0
    var firstTeamFines = 0
    var secondTeamFines = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt(TEAM_A_SCORE, firstTeamScore)
        outState?.putInt(TEAM_A_FINES, firstTeamFines)
        outState?.putInt(TEAM_B_SCORE, secondTeamScore)
        outState?.putInt(TEAM_B_FINES, secondTeamFines)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        //restore first team
        score_teamA_textView.text = savedInstanceState?.getInt(TEAM_A_SCORE).toString()
        firstTeamScore = savedInstanceState?.getInt(TEAM_A_SCORE)!!
        amount_fines_teamA_textView.text = savedInstanceState.getInt(TEAM_A_FINES).toString()
        firstTeamFines = savedInstanceState.getInt(TEAM_A_FINES)

        //restore second team
        score_teamB_textView.text = savedInstanceState.getInt(TEAM_B_SCORE).toString()
        secondTeamScore = savedInstanceState.getInt(TEAM_B_SCORE)
        amount_fines_teamB_textView.text = savedInstanceState.getInt(TEAM_B_FINES).toString()
        secondTeamFines = savedInstanceState.getInt(TEAM_B_FINES)

    }

    //Three Points
    fun addThreeForTeamA(view: View){
        firstTeamScore += 3
        score_teamA_textView.text = firstTeamScore.toString()
    }

    fun addThreeForTeamB(view: View){
        secondTeamScore += 3
        score_teamB_textView.text = secondTeamScore.toString()
    }

    //Two Points
    fun addTwoForTeamA(view: View){
        firstTeamScore += 2
        score_teamA_textView.text = firstTeamScore.toString()
    }

    fun addTwoForTeamB(view: View){
        secondTeamScore += 2
        score_teamB_textView.text = secondTeamScore.toString()
    }

    //One Points
    fun addOneForTeamA(view: View){
        firstTeamScore++
        score_teamA_textView.text = firstTeamScore.toString()
    }

    fun addOneForTeamB(view: View){
        secondTeamScore++
        score_teamB_textView.text = secondTeamScore.toString()
    }

    //Fines
    fun addFinesForTeamA(view: View){
        firstTeamFines++
        amount_fines_teamA_textView.text = firstTeamFines.toString()
    }

    fun addFinesForTeamB(view: View){
        secondTeamFines++
        amount_fines_teamB_textView.text = secondTeamFines.toString()
    }

    fun resetAllPoints(view: View){
        firstTeamScore = 0
        firstTeamFines = 0
        secondTeamScore = 0
        secondTeamFines = 0
        score_teamA_textView.text = firstTeamScore.toString()
        amount_fines_teamA_textView.text = firstTeamFines.toString()
        score_teamB_textView.text = secondTeamScore.toString()
        amount_fines_teamB_textView.text = secondTeamFines.toString()

    }
}
