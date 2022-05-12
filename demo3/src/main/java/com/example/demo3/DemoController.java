package com.example.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String generateSentence(Model model) {
        String[] sentence = {
                "Logic will get you from A to B. Imagination will take you everywhere.",
                "There are 10 kinds of people. Those who know binary and those who don't.",
                "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
                "It's not that I'm so smart, it's just that I stay with problems longer.",
                "It is pitch dark. You are likely to be eaten by a grue."
        };
        Random random=new Random();
        int randomNumber=random.nextInt(sentence.length);
        String randomSentence=(sentence[randomNumber]);

        model.addAttribute("sentence", randomSentence);
        model.addAttribute("repolink", "https://github.com/yongxiuuu/myrepo-workshop01.git");
        return "welcome";
    }
}
