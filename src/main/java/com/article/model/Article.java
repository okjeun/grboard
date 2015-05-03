package com.article.model;

/**
 * Created by okjeun on 15. 5. 2.
 */
public class Article {
    private int articleId;
    private String title;
    private String content;
    private int v_count;
    private int r_count;
    private String reg_date;
    private String writer;

    public Article(){

    }

    public Article(int articleId, String title) {
        this.articleId = articleId;
        this.title = title;
    }

    public Article(int articleId, String title, int v_count, int r_count, String reg_date, String writer) {
        this.articleId = articleId;
        this.title = title;
        this.v_count = v_count;
        this.r_count = r_count;
        this.reg_date = reg_date;
        this.writer = writer;
    }

    public Article(int articleId, String title, String content, int v_count, int r_count, String reg_date, String writer) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.v_count = v_count;
        this.r_count = r_count;
        this.reg_date = reg_date;
        this.writer = writer;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getV_count() {
        return v_count;
    }

    public void setV_count(int v_count) {
        this.v_count = v_count;
    }

    public int getR_count() {
        return r_count;
    }

    public void setR_count(int r_count) {
        this.r_count = r_count;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
