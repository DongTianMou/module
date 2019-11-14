# mysql_module
springboot 2.0 整合mysql 8.1.18的模板

因为版本的不同，所以在配置文件中的spring.datasource.url 和 spring.datasource.driver-class-name 会有所不同

例如：我连接的是虚拟机上的mysql,版本号为8.1.18

这里有一个坑：如果mysql密码为纯数字的话，会出现以下错误

连接出错com.alibaba.druid.pool.DruidDataSource   : create connection SQLException, url:xxx,ERROR 1045 (28000)

这是因为版本问题，所以我建议不要用纯数字做为数据库密码，google其他人的解决方法是：在纯数字密码上家单引号。

