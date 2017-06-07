package me.kaohongshu.tuicool.entity.bean;

import me.kaohongshu.tuicool.entity.Bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@XmlRootElement(name="article")
public class Article extends Bean {
    private int article_id;
    private String title;
    private String created_at;
    private String thumb_image;
    private String category;
    private String is_hot;
    private String tag;
    private String body;
    private String web_name;
    private String origin_url;
    private String des;


    public Article(){}

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getThumb_image() {
        return thumb_image;
    }

    public void setThumb_image(String thumb_image) {
        this.thumb_image = thumb_image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(String is_hot) {
        this.is_hot = is_hot;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWeb_name() {
        return web_name;
    }

    public void setWeb_name(String web_name) {
        this.web_name = web_name;
    }

    public String getOrigin_url() {
        return origin_url;
    }

    public void setOrigin_url(String origin_url) {
        this.origin_url = origin_url;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
