package me.kaohongshu.tuicool.entity.relation;

import me.kaohongshu.tuicool.entity.Bean;

/**
 * Created by shichunxiang on 2017/6/6 0006.
 */
public class WebsiteArticle extends Bean{
    private long id;
    private long article_id;
    private long website_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(long article_id) {
        this.article_id = article_id;
    }

    public long getWebsite_id() {
        return website_id;
    }

    public void setWebsite_id(long website_id) {
        this.website_id = website_id;
    }
}
