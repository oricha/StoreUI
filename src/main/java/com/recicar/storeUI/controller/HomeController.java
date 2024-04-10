package com.recicar.storeUI.controller;

import com.recicar.storeUI.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView displayArticle(Map<String, Object> model) {

        List<Article> articles = IntStream.range(0, 10)
                .mapToObj(i -> generateArticle("Article Title " + i))
                .collect(Collectors.toList());

        model.put("articles", articles);
        return new ModelAndView("index", model);
    }

    private Article generateArticle(String s) {
        Article article = new Article();
        article.setTitle(s);
        article.setBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        article.setAuthor("John Doe");
        article.setPublishDate("2020-01-01");
        return article;
    }
}
