package com.example.demo.Controller

import com.example.demo.Model.Question
import com.example.demo.Repository.QuestionRepository
import csv.Leitor
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import sun.security.x509.OIDMap.addAttribute
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.beans.factory.annotation.Autowired


@Controller
class SimpleController {
    @Value("\${spring.application.name}")
    lateinit var appName: String

    @Autowired
    private lateinit var questionRepository: QuestionRepository

    @GetMapping("/")
    fun homePage(model: Model): String {
        model.addAttribute("appName", appName)
//        questionRepository.save(Question(1,"TTTTTTTT"))


        Leitor.ler()

        model.addAttribute("appName",questionRepository.findByDescriptionEquals("TTTTTTTT")[0].description)

        model.addAttribute("rowNumber", questionRepository.count())
        return "home"
    }


}