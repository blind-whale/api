# api
使用spring-boot + mybatis 搭建一个api服务。
## 接口列表
#### /getArticles?page=2
获取文章列表，列表按文章创建时间，倒序排列，
参数page为可选项，默认值为1，每页20条数据
#### /getTags?isAll=1
获取所有的文章标签，列表按照每个标签拥有的文章数目，倒序排列
参数isAll为可选项，默认为0，表示只取排名前100的标签；否则，取全部标签
#### /getCategory
获取所有的分类列表
#### /getWebsite?page=1
获取所有的网站
#### /getArticlesByCategory?page=1&category=科技
根据分类获取文章列表
参数page为可选项，默认值为1
参数category为可选项，默认值为“科技”