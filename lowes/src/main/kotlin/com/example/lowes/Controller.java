package com.example.lowes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

public class Controller {

    Controller() {

    }

    public ArrayList<Quiz> getQuizList() {
        HttpURLConnection conn;
        ArrayList<Quiz> returnQuizList = new ArrayList<Quiz>();
        try {
            URL url = new URL("https://opentdb.com/api.php?amount=5&category=11");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() == 200) {
                Scanner scan = new Scanner(url.openStream());
                JSONParser parse = new JSONParser(url.openStream());
                while (scan.hasNext()) {
                    try {
                        JSONObject jsonObject = (JSONObject) parse.parse();
                        JSONArray jsonArray = (JSONArray) jsonObject.get("results");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject input = (JSONObject) jsonArray.get(i);
                            Quiz quiz = new Quiz();
                            Results result = new Results();

                            Quiz.setCategory((String) input.get("category"));
                            result.setType((String) input.get("type"));
                            result.setDifficulty((String) input.get("difficulty"));
                            result.setQuestion((String) input.get("question"));
                            result.setCorrect_answer((String) input.get("correct_answer"));
                            JSONArray resultArray = (JSONArray) input.get("incorrect_answers");
                            ArrayList<String> questions = new ArrayList<String>();

                            if (resultArray != null) {
                                for (int j = 0; j < questions.size(); j++) {
                                    questions.add(resultArray.get(j).toString());
                                }
                            }

                            result.setIncorrect_answers(questions);
                            quiz.setResults(result);
                            returnQuizList.add(quiz);
                        }
                        conn.disconnect();

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnQuizList;
    }
}
