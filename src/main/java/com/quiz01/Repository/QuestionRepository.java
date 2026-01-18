package com.quiz01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz01.QuestionDao.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
