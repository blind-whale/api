package me.kaohongshu.tuicool.service;

import me.kaohongshu.tuicool.dao.IArticleDao;
import me.kaohongshu.tuicool.entity.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Service
public class ArticleService {
    @Resource
    public IArticleDao articleDao;

    public List<Article> getArticles(int offset){
        List<Article> articles=articleDao.getArticles(offset);
        if(articles!=null){
            for (int i=articles.size()-1;i>=0;i--){
                Article article=articles.get(i);
                if(article.getCreated_at()==null||article.getCreated_at().isEmpty()){
                    articles.remove(i);
                    articleDao.deleteArticle(article.getArticle_id());
                }
            }
        }
        return articles;
    }
}
