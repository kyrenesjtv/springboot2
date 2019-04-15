/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : blackbox2

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-04-15 18:06:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for global_role
-- ----------------------------
DROP TABLE IF EXISTS `global_role`;
CREATE TABLE `global_role` (
  `id` varchar(32) NOT NULL COMMENT '角色ID,UUID,NOT NULL,PRIMARY KEY',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `createId` varchar(32) DEFAULT NULL COMMENT '创建人标识,UUID',
  `createrName` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `remarks` varchar(1000) DEFAULT NULL COMMENT '备注说明',
  `sort` decimal(10,0) DEFAULT NULL COMMENT '排序',
  `state` decimal(10,0) DEFAULT NULL COMMENT '状态,0：开放 1：禁止',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of global_role
-- ----------------------------
INSERT INTO `global_role` VALUES ('9ef64a3545fe4afe96d6fd37020a10ed', '2019-04-10 17:53:45', null, null, '超级管理员', null, '1', '0');
