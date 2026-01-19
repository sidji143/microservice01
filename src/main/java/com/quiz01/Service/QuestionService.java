package com.quiz01.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz01.QuestionDao.Question;
import com.quiz01.Repository.QuestionRepository;

import jakarta.transaction.Transactional;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    public List<Question> getQuestionByCategory(String category){
        return questionRepository.findByCategory(category);
    }

    public String addQuestion(Question question){
        questionRepository.save(question);
        return "Question added successfully";
    }

    @Transactional
    public String deleteQuestion(String deleteCategory){

        questionRepository.deleteByCategory(deleteCategory);
        return "Question Deleted successfully";
    }

    @Transactional
    public String updateById(Integer updateById){

        Optional<Question> existingQuestionAl = questionRepository.findById(updateById);

        if(existingQuestionAl.isPresent()){

            Question exitingQuestion = existingQuestionAl.get();

            exitingQuestion.setCategory("kotlin");

            questionRepository.save(exitingQuestion);
        }
        

        return "Record update Successfully";

    }
}
