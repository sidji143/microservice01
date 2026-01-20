package com.quiz01.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz01.QuestionDao.Question;
import com.quiz01.Service.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("category/{category}")
   public List<Question> getQuestionByCategory(@PathVariable String category){

    return questionService.getQuestionByCategory(category);

    }

    @PostMapping("addQuestion")
    public String addQuestion(@RequestBody Question question){
        System.out.println(question.toString());
        return questionService.addQuestion(question);
    }
        
    @PutMapping("deleteQuestion/{deleteCategory}")
    public String deleteQuestion(@PathVariable String deleteCategory){

        return questionService.deleteQuestion(deleteCategory);
    }

    @PutMapping("updateById/{updateById}")
    public String updatebyId(@PathVariable Integer updateById){
        
        return questionService.updateById(updateById);
    }
    
}
