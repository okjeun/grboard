package com.article.dao;

import com.article.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by okjeun on 15. 4. 11.
 */
public interface ArticleDAO {
    String getTest();

    List<Article> getArticleList();

    Article getArticle(int articleId);

    void addArticle(Article article);
}
