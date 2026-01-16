package com.quiz01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("question")
public class QuestionController {

    @GetMapping("allQuestions")
    public String getAllQuestion(){
        return "Hi here you will get all the question";
    }
}
