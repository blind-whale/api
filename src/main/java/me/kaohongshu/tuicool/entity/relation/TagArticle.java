package me.kaohongshu.tuicool.entity.relation;

import me.kaohongshu.tuicool.entity.Bean;

/**
 * Created by shichunxiang on 2017/6/6 0006.
 */
public class TagArticle extends Bean {
    private long id;
    private long article_id;
    private long tag_id;

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

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }
}
