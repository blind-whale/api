package me.kaohongshu.tuicool.dao;

import me.kaohongshu.tuicool.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Repository
public interface IArticleDao {
    List<Article> getArticles(int offset);
    int deleteArticle(int id);
}
