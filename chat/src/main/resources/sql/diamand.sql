-- 创建数据库 diamand
CREATE DATABASE IF NOT EXISTS `diamand` ;

USE `diamand`;

-- 创建表格 primary_user
CREATE TABLE `primary_user`
(`pri_usr_id` VARCHAR(255) NOT NULL UNIQUE,
 `phone` CHAR(11) NOT NULL,
 `password` VARCHAR(255) NOT NULL,
 `gender` BIT NOT NULL,
 `create_time` DATETIME NOT NULL,
 `last_modified_time` DATETIME NOT NULL,
 `avatar_img_url` VARCHAR(255) NOT NULL,
 PRIMARY KEY (`pri_usr_id`));

-- 往 primary_user 中插入数据
INSERT INTO `primary_user` VALUES
('9b846625-705e-4dda-b09d-9ddc4e06ccb8', 
'13988888888',
'123456', 
TRUE, 
NOW(), 
NOW(), 
'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed/img/avatar/20210205220241.svg');


-- 创建表格 subuser
CREATE TABLE `subuser`
(`subuser_id` VARCHAR(255) NOT NULL UNIQUE,
 `username` VARCHAR(255) NOT NULL,
 `password` VARCHAR(255) NOT NULL,
`create_time` DATETIME NOT NULL,
`last_modified_time` DATETIME NOT NULL,
 PRIMARY KEY (`subuser_id`));

-- 插入匿名聊天身份
INSERT INTO `subuser` VALUES 
('b31fd837-3087-4c04-94af-577d6d5afb75', '赵一',  '123456', NOW(), NOW()),
('01d40aa4-c80d-432e-baf2-fe18a8005944', '钱二',  '123456', NOW(), NOW()),
('96a98c56-83f1-4b36-89c4-77257cd76868', '孙三',  '123456', NOW(), NOW()),
('3721c793-3abd-49af-aaf7-c4d7cb4c3f6a', '李四',  '123456', NOW(), NOW()),
('28410131-1a03-4882-9a5a-6c0c9250622d', '周五',  '123456', NOW(), NOW()),
('21f2305c-9f30-49ec-8823-e8193fba0935', '吴六',  '123456', NOW(), NOW()),
('2e07f7fe-cc02-4823-b2ff-8d753a9e41a0', '郑七',  '123456', NOW(), NOW()),
('cbb958fd-7ef7-44a1-bcf5-4a0feec76628', '王八',  '123456', NOW(), NOW()),
('8f17ab98-db0f-4433-8a42-856f61e3a6d0', '冯九',  '123456', NOW(), NOW()),
('7ee7ce18-d31c-45ec-8f89-7632da1ef7bb', '陈十',  '123456', NOW(), NOW());


 -- 创建表格 avatar
 CREATE TABLE `avatar`
 (`ava_id` VARCHAR(255) NOT NULL UNIQUE,
  `ava_name` VARCHAR(255) NOT NULL,
  `gender` BIT NOT NULL,
  `avatar_img_url` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `create_time` DATETIME NOT NULL,
  `last_modified_time` DATETIME NOT NULL,
  PRIMARY KEY (`ava_id`));

-- 插入匿名聊天身份
  INSERT INTO `avatar` VALUES
  ('6155bcbf-86e6-4366-bb1e-9865e584ffe8', '宋江', TRUE, 'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed@master/img/avatar/avatar_001.svg', '天魁星, 呼保义', NOW(), NOW()),
  ('7beaefe5-2a19-4b0f-94f9-952d0cfb172d', '卢俊义', TRUE, 'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed@master/img/avatar/avatar_002.svg', '天罡星, 玉麒麟', NOW(), NOW()),
  ('cbf67f40-f276-4202-b799-5685cb410dcc', '吴用', TRUE, 'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed@master/img/avatar/avatar_003.svg', '天机星, 智多星', NOW(), NOW()),
  ('b9a39a4d-a55e-456d-a948-3baa266be2cf', '公孙胜', TRUE, 'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed@master/img/avatar/avatar_004.svg', '天闲星, 入云龙', NOW(), NOW()),
  ('8d55b6f7-3e2f-441a-ab33-41c7b4595dd1', '关胜', TRUE, 'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed@master/img/avatar/avatar_005.svg', '天勇星, 大刀', NOW(), NOW()),
  ('ca6bb65b-d4e1-4fc4-a982-2785ca10bcf3', '林冲', TRUE, 'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed@master/img/avatar/avatar_006.svg', '天雄星, 豹子头', NOW(), NOW()),
  ('0c48a387-4fa0-4556-9d5a-b3a9f43e824e', '秦明', TRUE, 'https://cdn.jsdelivr.net/gh/a-layfolk/FigureBed@master/img/avatar/avatar_007.svg', '天猛星, 霹雳火', NOW(), NOW());

