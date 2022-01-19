package com.example.simplequizapp

object setData {

    fun getQuestion(): ArrayList<QuestionData>? {
        var que:ArrayList<QuestionData>?= arrayListOf()
        var question1=QuestionData(
            1,
            "What is the capital of India",
            "Uttar Pradesh",
            "Madhya Pradesh",
            "Delhi",
            "Lucknow",
            3
        )
        var question2 = QuestionData(
            2,
            "Who is the first women went in Space ?",
            "Kalpana Chawla",
            "Sunita Williams",
            "Kokira Mann",
            "None of the Above",
            1
        )
        var question3 = QuestionData(
            2,
            "Who wrote the Indian National Anthem ?",
            "Bankim Chandra Chatterji",
            "Rabindranath Tagore",
            "Swami Vivekanand",
            "None of the Above",
            2
        )
        var question4 = QuestionData(
            4,
            "Who was the first President of India ?",
            "Abdul Kalam",
            "Lal Bahadur Shahtri",
            "Dr. Rajendra Prasad",
            "Zakir Hussain",
            3
        )
        var question5 = QuestionData(
            5,
            "Who build the Jama Masjid",
            "Jahangir",
            "Akbar",
            "Imam Bukhari",
            "Shah Jahah",
            4
        )
        if (que != null) {
            que.add(question1)
        }
        if (que != null) {
            que.add(question2)
        }
        if (que != null) {
            que.add(question3)
        }
        if (que != null) {
            que.add(question4)
        }
        if (que != null) {
            que.add(question5)
        }
       return que
    }
}