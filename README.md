# 一 、home_server_proj

- Horn 官网后台服务：SpringBoot + Mybatis + MySQL

![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/img-func.jpg)

# 二、功能

## 2.1 前端
- 静态 html 
- 访问 localhost:8067
- ......

![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/web-4.png)
![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/web-3.png)
![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/web-1.png)
![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/web-2.png)


## 2.2 后端

- SpringBoot
- MyBatis
- MySQL
- 接口测试，如查询所有用户信息：localhost:8067/user/user/index
- ......

## 2.3 关于 SQL

![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/sql-2.png)
![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/sql-2.png)
![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/sql-2.png)

- sql 语句与表结构

```sql
DROP DATABASE IF EXISTS testMyBatisPlus;

CREATE DATABASE testMyBatisPlus;

USE testMyBatisPlus;

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id BIGINT(20) NOT NULL COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT(11) NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

INSERT INTO user (id, name, age, email) VALUES
(1, 'Jone', 18, 'test1@baomidou.com'),
(2, 'Jack', 20, 'test2@baomidou.com'),
(3, 'Tom', 28, 'test3@baomidou.com'),
(4, 'Sandy', 21, 'test4@baomidou.com'),
(5, 'Billie', 24, 'test5@baomidou.com');/* 2021-04-05 23:11:57 [14 ms] */ CREATE TABLE user (     id BIGINT(20) NOT NULL COMMENT '主键ID',     name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',     age INT(11) NULL DEFAULT NULL COMMENT '年龄',     email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',     PRIMARY KEY (id) )
/* 2021-04-05 23:12:41 [14 ms] */ INSERT INTO user (id, name, age, email) VALUES (1, 'Jone', 18, 'test1@baomidou.com'), (2, 'Jack', 20, 'test2@baomidou.com'), (3, 'Tom', 28, 'test3@baomidou.com'), (4, 'Sandy', 21, 'test4@baomidou.com'), (5, 'Billie', 24, 'test5@baomidou.com')

```

# 三、环境

# 3.1开发工具
- VSCode

# 3.2插件版本

> 注意 VSCode 插件版本与我对其，否则可能因为冲突无法运行

![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/img-1.png)
![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/img-2.png)
![](https://github.com/yuanhao-1999/home_server_proj/blob/main/images/img-3.png)


# 四、MIT License

Copyright (c) 2021 FishInWater-1999

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
