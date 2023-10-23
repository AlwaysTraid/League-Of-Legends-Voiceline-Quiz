package com.example.leagueoflegendsvoicelinesquiz

object Constants{

    fun getQuestions(): ArrayList<Voiceline>{
        val voicelineList = ArrayList<Voiceline>()

        val que1 = Voiceline(1, "Who's voiceline is this?",
            "\"Betrayal stings like salt on a wound.\"",
            "Aatrox",
            "Galio",
            "Ezreal",
            "Gangplank",
            4
        )
        voicelineList.add(que1)

        val que2 = Voiceline(2, "Who's voiceline is this?",
            "\"There is no salvation from the dark, for the dark is me.\"",
            "Kayn",
            "Viego",
            "Lucian",
            "Nocturne",
            2
        )
        voicelineList.add(que2)

        val que3 = Voiceline(3, "Who's voiceline is this?",
            "\"Fear is the first of many foes.\"",
            "Aurelion sol",
            "Fiddlesticks",
            "Garen",
            "Evelynn",
            3
        )
        voicelineList.add(que3)

        val que4 = Voiceline(4, "Who's voiceline is this?",
            "\"I like your smile. Makes a nice target.\"",
            "Caitlyn",
            "Jinx",
            "Vi",
            "Vex",
            3
        )
        voicelineList.add(que4)

        return voicelineList
    }
    fun randomCorrect(): Int{
        return (Math.random() * (5 - 1 + 1)).toInt() + 1
    }
}