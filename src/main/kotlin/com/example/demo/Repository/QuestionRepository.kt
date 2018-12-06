package com.example.demo.Repository

import com.example.demo.Model.Question
import org.springframework.data.repository.CrudRepository

interface QuestionRepository : CrudRepository<Question, Long> {

    fun findByDescriptionEquals(text: String): List<Question>

}