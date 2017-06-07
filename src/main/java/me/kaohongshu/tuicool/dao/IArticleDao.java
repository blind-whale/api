package me.kaohongshu.tuicool.dao;

import me.kaohongshu.tuicool.entity.bean.Article;
import me.kaohongshu.tuicool.entity.bean.Category;
import me.kaohongshu.tuicool.entity.bean.Tag;
import me.kaohongshu.tuicool.entity.bean.Website;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Repository
public interface IArticleDao {
    /**
     * 获取全部文章，按时间倒序
     * @param offset
     * @return
     */
    List<Article> getArticles(int offset);

    /**
     * 根据id删除文章数据
     * @param id
     * @return
     */
    int deleteArticle(int id);

    /**
     * 获取所有的标签
     * @param state 如果值为0，则只取排名前100；否则获取全部的标签
     * @return
     */
    List<Tag> getAllTags(int state);

    /**
     * 获取所有的分类
     * @return
     */
    List<Category> getAllCategories();

    /**
     * 获取所有的文章网站
     * @return
     */
    List<Website> getAllWebsites(int offset);

    /**
     * 根据分类、标签、网站获取文章
     * @param category
     * @param offset 偏移量
     * @return
     */
    List<Article> getArticlesByCategory(String category,int offset);

    /**
     * 根据分类、标签、网站获取文章
     * @param tag
     * @return
     */
    List<Article> getArticlesByTag(String tag,int offset);

    /**
     * 根据分类、标签、网站获取文章
     * @param webid
     * @return
     */
    List<Article> getArticlesByWebsite(long webid,int offset);

    /**
     * 根据分类、标签、网站获取文章
     * @param category
     * @param tag
     * @param webid
     * @return
     */
    List<Article> getArticles(String category,String tag,long webid,int offset);
}
