package com.example.lowes

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LowesApplication {

	fun main(args: Array<String>) {
		var controller : Controller = Controller()
		var quizList : ArrayList<Quiz> = controller.getQuizList()
		runApplication<LowesApplication>(*args)
	}

}

