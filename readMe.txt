1.user模块是使用老的方法，即实现Dao层，然后在Dao通过sqlSessionFactory
    拿到session调用对应配置文件里的方法
2.classs模块通过配置扫描mapper文件（在applicationContext文件中）不在用去实现Dao

3.user分页方式也有两种第一种是查询出所有结果后然后再对结果分页，不太推荐

4.第二种分页通过插件实现即在查询之前根据指定的数据库类别组织出分页的查询sql，相关实现都在common
   下的persistence下 Pagexxinteceptor类最为重要拦截查询请求组织分页sql，其配置在mybatsi配置文件中