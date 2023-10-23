package com.example.leagueoflegendsvoicelinesquiz

data class Voiceline (

    val id: Int,
    val question: String,
    val voiceline: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int,

    )
