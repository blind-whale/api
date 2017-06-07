package me.kaohongshu.tuicool.entity.bean;

import me.kaohongshu.tuicool.entity.Bean;

/**
 * Created by shichunxiang on 2017/6/6 0006.
 */
public class Website extends Bean {
    private long id;
    private String name;
    private String logo;
    private String slogan;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public long getArticle_count() {
        return article_count;
    }

    public void setArticle_count(long article_count) {
        this.article_count = article_count;
    }
}
