package com.quiz01.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz01.QuestionDao.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
   public List<Question> findByCategory(String category);
}
