package com.example.lowes;

import java.util.ArrayList;

public class Results {

    private String type;
    private String difficulty;
    private String question;
    private String correct_answer;
    private ArrayList<String> incorrect_answers = new ArrayList<String>();

    Results() {
        type = "";
        difficulty = "";
        correct_answer = "";
        incorrect_answers = new ArrayList<String>();
    }

    private String getType() {
        return type;
    }

    private String getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    private String getCorrectAnswer() {
        return correct_answer;
    }

    private ArrayList<String> getAllAnswers() {
        return incorrect_answers;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public void setIncorrect_answers(ArrayList<String> questions) {
        this.incorrect_answers = questions;
    }

}
