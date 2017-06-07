package me.kaohongshu.tuicool.entity.bean;

import me.kaohongshu.tuicool.entity.Bean;

/**
 * Created by shichunxiang on 2017/6/6 0006.
 */
public class Category extends Bean {
    private long id;
    private String name;
    private long article_count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getArticle_count() {
        return article_count;
    }

    public void setArticle_count(long article_count) {
        this.article_count = article_count;
    }
}
