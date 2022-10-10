package com.example.quiz;

public class Question {
    public int questionId;
    public boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer){
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }
}
