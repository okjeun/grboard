package com.article.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by okjeun on 15. 5. 2.
 */
public class ArticleMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Article article = new Article();
        article.setArticleId(new Integer(rs.getString("articleId")));
        article.setTitle(new String(rs.getString("title")));
        article.setContent(new String(rs.getString("content")));
        article.setR_count(new Integer(rs.getString("r_count")));
        article.setV_count(new Integer(rs.getString("v_count")));
        article.setWriter(new String(rs.getString("writer")));
        article.setReg_date(new String(rs.getString("reg_date")));
        return article;
    }
}
