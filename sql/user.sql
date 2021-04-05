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
