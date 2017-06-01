package me.kaohongshu.tuicool.controller;

import groovy.util.logging.Log4j;
import me.kaohongshu.tuicool.entity.Article;
import me.kaohongshu.tuicool.entity.Result;
import me.kaohongshu.tuicool.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@RestController
public class ArticleController {
    @Resource
    public ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getArticles(){
        return articleService.getArticles(0);
    }

    @RequestMapping("/result")
    public Result getResult(@RequestParam(name = "page",required = true,defaultValue = "1") int page){
        System.out.print("***********************************page="+page+"**************************************");
        Result result=new Result();
        if(page<=0)page=1;
        List<Article> list=articleService.getArticles((page-1)*20);
        if(list==null){
            result.setStatus(0);
            result.setErrorCode(100001);
            result.setErrorInfo("服务器异常，获取数据失败！");
        }else{
            result.setStatus(1);
            result.setData(list);
        }
        return result;
    }
}
