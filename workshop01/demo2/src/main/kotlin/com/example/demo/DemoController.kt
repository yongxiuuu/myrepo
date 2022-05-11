package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import java.util.*
import org.springframework.web.bind.annotation.GetMapping


@Controller
class DemoController {
    @GetMapping("/")
    fun randomGenerate(model: Model): String {
        val listofSentence = arrayOf(
            "Logic will get you from A to B. Imagination will take you everywhere.",
            "There are 10 kinds of people. Those who know binary and those who don't.",
            "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
            "It's not that I'm so smart, it's just that I stay with problems longer.",
            "It is pitch dark. You are likely to be eaten by a grue."
        )

        val random = Random().nextInt(listofSentence.size)
        val sentence = listofSentence[random]
        model.addAttribute("sentence", sentence)
        model.addAttribute("repolink", "https://github.com/yongxiuuu/myrepo-workshop01.git")
        return "welcome"
    }
}