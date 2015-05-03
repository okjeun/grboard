package com.article.dao;

import com.article.model.Article;
import com.article.model.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by okjeun on 15. 4. 11.
 */
@Repository
public class ArticleDAOImpl implements ArticleDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getTest() {
        String title = jdbcTemplate.queryForObject("select title from article where articleId = ?", new Object[]{"1"}, String.class);
        return title;
    }

    @Override
    public ArrayList<Article> getArticleList() {
        ArrayList<Article> list = (ArrayList<Article>)jdbcTemplate.query("select * from article", new ArticleMapper());
        return list;
    }

    @Override
    public Article getArticle(int articleId) {
        Article article = (Article)jdbcTemplate.queryForObject("select * from article where articleId=?", new Object[]{articleId}, new ArticleMapper());
        return article;
    }

    @Override
    public void addArticle(Article article) {

    }

}
