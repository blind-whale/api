package me.kaohongshu.tuicool.entity.relation;

import me.kaohongshu.tuicool.entity.Bean;

/**
 * Created by shichunxiang on 2017/6/6 0006.
 */
public class CategoryArticle extends Bean{
    private long id;
    private long article_id;
    private long category_id;

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

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }
}
