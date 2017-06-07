package me.kaohongshu.tuicool.controller;

import me.kaohongshu.tuicool.entity.bean.Article;
import me.kaohongshu.tuicool.entity.Result;
import me.kaohongshu.tuicool.entity.bean.Category;
import me.kaohongshu.tuicool.entity.bean.Tag;
import me.kaohongshu.tuicool.entity.bean.Website;
import me.kaohongshu.tuicool.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.rowset.CachedRowSet;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@RestController
public class ArticleController {
    @Resource
    public ArticleService articleService;

    @RequestMapping("/getArticles")
    public Result getArticles(@RequestParam(name = "page", required = true, defaultValue = "1") int page) {
        System.out.print("***********************************page=" + page + "**************************************");
        Result result = new Result();
        if (page <= 0) page = 1;
        List<Article> list = articleService.getArticles((page - 1) * 20);
        if (list == null) {
            result.setStatus(0);
            result.setErrorCode(100001);
            result.setErrorInfo("服务器异常，获取数据失败！");
        } else {
            result.setStatus(1);
            result.setData(list);
        }
        return result;
    }

    @RequestMapping("/getArticlesByCategory")
    public Result getArticlesByCategory(@RequestParam(name = "page", defaultValue = "1") int page,
                                        @RequestParam(name = "category", defaultValue = "科技") String category) {
        Result result = new Result();
        if (page <= 0) page = 1;
        List<Article> list = articleService.getArticlesByCategory((page-1) * 20, category);
        if (list == null) {
            result.setStatus(0);
            result.setErrorCode(100001);
            result.setErrorInfo("服务器异常，获取数据失败！");
        } else {
            result.setStatus(1);
            result.setData(list);
        }
        return result;
    }

    @RequestMapping("/getTags")
    public Result getAllTags(@RequestParam(defaultValue = "0",name = "isAll") int isAll){
        Result result=new Result();
        List<Tag> list=articleService.getAllTags(isAll);
        if (list == null) {
            result.setStatus(0);
            result.setErrorCode(100001);
            result.setErrorInfo("服务器异常，获取数据失败！");
        } else {
            result.setStatus(1);
            result.setData(list);
        }
        return result;
    }

    @RequestMapping("/getCategory")
    public Result getAllCategories(){
        List<Category> list=articleService.getAllCategories();
        Result result=new Result();
        if (list == null) {
            result.setStatus(0);
            result.setErrorCode(100001);
            result.setErrorInfo("服务器异常，获取数据失败！");
        } else {
            result.setStatus(1);
            result.setData(list);
        }
        return result;
    }

    @RequestMapping("/getWebsite")
    public Result getAllWebsites(@RequestParam(name = "page",defaultValue = "1") int page){
        if(page<=0)page=1;
        List<Website> list=articleService.getAllWebsites((page-1)*20);
        Result result=new Result();
        if (list == null) {
            result.setStatus(0);
            result.setErrorCode(100001);
            result.setErrorInfo("服务器异常，获取数据失败！");
        } else {
            result.setStatus(1);
            result.setData(list);
        }
        return result;
    }
}
