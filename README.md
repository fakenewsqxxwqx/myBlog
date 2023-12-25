# Blog系统介绍
## 配置和运行
后端：springboot  mybatis  
数据库：mysql  
前端：thymeleaf

clone后运行resource文件夹下的sql文件来初始化数据库。然后启动运行，浏览器输出localhost::8080。

## 模块介绍：
1. 系统表结构：
   ![image](https://github.com/fakenewsqxxwqx/myBlog/assets/132748283/78e17bf2-338a-44bf-8ec3-62de1766fd33)
2. 用户界面：
   为用户分页展示博客、分类别查看、分标签查看、按发表时间排序。
   展示博客：![image](https://github.com/fakenewsqxxwqx/myBlog/assets/132748283/b771ebdd-e67f-4e01-a814-fead21ea5a33)
   分类别查看：![image](https://github.com/fakenewsqxxwqx/myBlog/assets/132748283/808994b9-0548-4cda-8966-679bd618a528)
   分标签查看：![image](https://github.com/fakenewsqxxwqx/myBlog/assets/132748283/5d438afe-4f71-46cc-963f-8c05f314a632)
   按发表时间排序查看：![image](https://github.com/fakenewsqxxwqx/myBlog/assets/132748283/ea9cda02-de8d-4bd1-8991-b62209af9142)
3. 管理员界面：
   输入localhost::8080/admin进入管理员登录页面：![image](https://github.com/fakenewsqxxwqx/myBlog/assets/132748283/9cd34a67-40f6-46d4-8d37-582efab67cf5)
   有查看、编辑博客功能、编辑类别和标签功能。

4. 日志纪录功能：
   系统能将每日的系统运行纪录存放在log文件夹下。

5. 页面小精灵：引用了https://github.com/stevenjoezhang/live2d-widget.git的页面小精灵。


    





   
