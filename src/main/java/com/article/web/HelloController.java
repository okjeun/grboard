package com.article.web;

import com.article.dao.ArticleDAO;
import com.article.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by okjeun on 15. 4. 11.
 */
@Controller
public class HelloController {

    @Autowired
    private ArticleDAO articleDAO;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public Object hello(){
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("time", new Date());
        model.put("message", "welcome");
        model.put("title", articleDAO.getTest());
        return model;
    }

    @RequestMapping(value = "/index")
    public String index(Map<String, Object> model){
        model.put("list", articleDAO.getArticleList());
        return "index";
    }
}
