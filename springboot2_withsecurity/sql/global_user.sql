/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : blackbox2

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-04-15 18:06:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for global_user
-- ----------------------------
DROP TABLE IF EXISTS `global_user`;
CREATE TABLE `global_user` (
  `id` varchar(32) NOT NULL COMMENT 'ID,UUID,NOT NULL,PRIMARY KEY',
  `address` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `birthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '出生年月',
  `idCard` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱地址',
  `fax` varchar(15) DEFAULT NULL COMMENT '传真',
  `ip` varchar(15) DEFAULT NULL COMMENT '注册IP地址',
  `post` decimal(10,0) DEFAULT NULL COMMENT '职务或岗位',
  `loginCount` decimal(10,0) DEFAULT NULL COMMENT '登录次数',
  `loginName` varchar(50) DEFAULT NULL COMMENT '登录名称',
  `loginTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '最后登录时间',
  `mobile` varchar(15) DEFAULT NULL COMMENT '手机号码',
  `name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `nick` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `remarks` varchar(1000) DEFAULT NULL COMMENT '备注说明',
  `password` varchar(32) DEFAULT NULL COMMENT '登录密码',
  `picture` varchar(200) DEFAULT NULL COMMENT '个人头像路径',
  `zipCode` varchar(10) DEFAULT NULL COMMENT '邮编',
  `regdate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '注册日期',
  `sex` decimal(10,0) DEFAULT NULL COMMENT '性别,0：未知性别1：男性 2：女性',
  `shortString` varchar(20) DEFAULT NULL COMMENT '短号',
  `sort` decimal(10,0) DEFAULT NULL COMMENT '排序',
  `state` decimal(10,0) DEFAULT NULL COMMENT '用户状态,1：有效、0：注销',
  `telephone` varchar(15) DEFAULT NULL COMMENT '电话号码',
  `departId` varchar(32) DEFAULT NULL COMMENT '部门ID,UUID,FOREIGN KEY',
  `createDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建日期',
  `createId` varchar(32) DEFAULT NULL COMMENT '创建人标识,UUID',
  `createName` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of global_user
-- ----------------------------
INSERT INTO `global_user` VALUES ('1c122e9f37f24c93b5451c0220f1b548', null, '2019-04-10 16:55:37', null, null, null, null, null, null, 'admin', '0000-00-00 00:00:00', '15336692852', '超级管理员', 'admin', null, '8ac1cbf290b0fe98ff1142acf94e7351', null, null, '0000-00-00 00:00:00', '0', null, '2', '2', null, 'a6fc7b69f30546beb7cd49d8afc55dd2', '2019-04-10 16:55:37', null, null);
