package com.example.lowes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scorex.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuizModel {
    @JsonProperty("<results>")
    ArrayList<Quiz> quiz = null;

    public ArrayList<Quiz> getQuizList() {
        return quiz;
    }

    public void setQuizList(ArrayList<Quiz> quizList) {
        quiz = quizList;
    }

}
