# 如何配置运行
---

## MySQL

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

## 导入以下SQL脚本

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
