package com.example.myquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS: String="correct_answer"
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "Which country does this flag belongs to?",
            R.drawable.bosnia,
            "Turkiye",
            "Czechoslovakia",
            "Bosnia and Herzegovina",
            "Croatia",
            3
        )


        val que2 = Question(
            2, "What is the name of following actress who took the role of El in Stranger Things ?",
            R.drawable.millie,
            "Deepanshu Singhal",
            "Ayush Chauhan",
            "Millie Bobby Brown",
            "Emma Watson",
            3
        )
        val que3 = Question(
            3, "Which spell was used to levitate objects in the Harry Potter series?",
            R.drawable.harry,
            "Lumos",
            "Andi Mandi Sandi",
            "Expelliarmus",
            "Wingardium Leviosa",
            4
        )
        val que4 = Question(
            4, "Who said the legendary words: Aapne Ghabrana nahi hai?",
            R.drawable.imran,
            "Imran Khan",
            "Modi ji",
            "Sachin tendulkar",
            "Nawaj Sharif",
            1
        )
        val que5 = Question(
            5, "Where is this place probably located?",
            R.drawable.dal,
            "Darjeeling",
            "Switzerland",
            "Deepanshu ke ghar ka bageecha",
            "Dalhousie",
            4
        )
        val que6 = Question(
            6, "Where will you probably find this monument?",
            R.drawable.bibi,
            "Aurangabaad",
            "Agra",
            "Karachi",
            "Guwahati",
            1
        )
        val que7 = Question(
            7, "What is the name of following alien in Ben 10?",
            R.drawable.heat,
            "HeatBlast",
            "HeatStreak",
            "HotExplode",
            "Aag vala alien",
            1
        )
        val que8 = Question(
            8, "What is the name of following bhaukali Car?",
            R.drawable.fortuner,
            "Scorpio",
            "Kaali Fortuner",
            "Kaali Santro",
            "Thar",
            2
        )
        val que9 = Question(
            9, "Which company's logo is this?",
            R.drawable.logo3,
            "Audi",
            "Tata",
            "Maybach",
            "Mercedez",
            4
        )
        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)




        return questionList
    }
}