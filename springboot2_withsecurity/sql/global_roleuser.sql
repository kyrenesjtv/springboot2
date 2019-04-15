/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : blackbox2

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-04-15 18:06:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for global_roleuser
-- ----------------------------
DROP TABLE IF EXISTS `global_roleuser`;
CREATE TABLE `global_roleuser` (
  `id` varchar(32) NOT NULL COMMENT '主键ID,UUID,NOT NULL,PRIMARY KEY',
  `roleId` varchar(32) NOT NULL COMMENT '角色ID,UUID,NOT NULL,PRIMARY KEY',
  `userId` varchar(32) NOT NULL COMMENT '成员ID,UUID,NOT NULL,PRIMARY KEY',
  PRIMARY KEY (`id`,`roleId`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of global_roleuser
-- ----------------------------
INSERT INTO `global_roleuser` VALUES ('c6737355b560430caf7168ec7df2a92b', '9ef64a3545fe4afe96d6fd37020a10ed', '1c122e9f37f24c93b5451c0220f1b548');
