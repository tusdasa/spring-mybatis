# 如何配置运行
---

## 环境要求

开发使用了最新版的MySQL JDBC驱动 `mysql-connector-java-8.0.15`  Oracle 推荐的版本
如使用其他版本请使用对应的JDBC驱动包替换，并修改`jdbc.driver`对应的类

[MySQL文档](https://dev.mysql.com/doc/)

### 数据库

> MySQL 版本应当大于等于5.7

```

mysql> select VERSION(); 
+-----------+
| VERSION() |
+-----------+
| 5.7.24    |
+-----------+
1 row in set (0.00 sec) 

```

### JDK

> JDK 版本为8

```

C:\>java -version
java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)

C:\>javac -version
javac 1.8.0_201

```


### tomcat

```

D:\apache-tomcat-9.0.17\bin>version.bat
Using CATALINA_BASE:   "D:\apache-tomcat-9.0.17"
Using CATALINA_HOME:   "D:\apache-tomcat-9.0.17"
Using CATALINA_TMPDIR: "D:\apache-tomcat-9.0.17\temp"
Using JRE_HOME:        "C:\Program Files\Java\jdk1.8.0_201"
Using CLASSPATH:       "D:\apache-tomcat-9.0.17\bin\bootstrap.jar;D:\apache-tomcat-9.0.17\bin\tomcat-juli.jar"
Server version: Apache Tomcat/9.0.17
Server built:   Mar 13 2019 15:55:27 UTC
Server number:  9.0.17.0
OS Name:        Windows 10
OS Version:     10.0
Architecture:   amd64
JVM Version:    1.8.0_201-b09
JVM Vendor:     Oracle Corporation


```

## 配置MySQL

> 创建表 

>> 如修改表名请修改src下mapper对应xml

```

CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`uid`)
)

```

> 插入一条数据

```

INSERT INTO `user` VALUES ('测试', '123456', '1');

```

> 修改jdbc.properties

```

#修改为你的数据库
jdbc.url=jdbc:mysql://127.0.0.1:3306/数据库?useUnicode=true&characterEncoding=UTF8&useSSL=false

jdbc.driver=com.mysql.cj.jdbc.Driver
# 用户名
jdbc.username=root
# 密码
jdbc.password=root

```

# 屏幕截图

![](https://github.com/tusdasa/spring-mybatis/blob/master/screenshot.png?raw=true)