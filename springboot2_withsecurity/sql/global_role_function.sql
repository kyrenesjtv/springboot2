/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : blackbox2

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-04-15 18:06:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for global_role_function
-- ----------------------------
DROP TABLE IF EXISTS `global_role_function`;
CREATE TABLE `global_role_function` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `roleId` varchar(32) DEFAULT NULL COMMENT '角色id',
  `functionId` varchar(32) DEFAULT NULL COMMENT '模块id(权限id)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of global_role_function
-- ----------------------------
INSERT INTO `global_role_function` VALUES ('00515b3be008433e801e81da1ff7d55c', '9ef64a3545fe4afe96d6fd37020a10ed', 'e7956b6f875c447181c4232e12d1df04');
INSERT INTO `global_role_function` VALUES ('14a6d4e7babc46a087580dc4bdc85882', '9ef64a3545fe4afe96d6fd37020a10ed', '320c7c5ffed849d99a046367221e04a9');
INSERT INTO `global_role_function` VALUES ('18831a038a264b888886b5818f159191', '9ef64a3545fe4afe96d6fd37020a10ed', '304efc8c879a42ab89850cf299492dd2');
INSERT INTO `global_role_function` VALUES ('18a6969e30c6489b8468e421ff21febe', '9ef64a3545fe4afe96d6fd37020a10ed', '2ffe25a965674197a215e15774d666b3');
INSERT INTO `global_role_function` VALUES ('1ec28d2ab7ea43f7990fa2d2bdfb3b79', '9ef64a3545fe4afe96d6fd37020a10ed', '5f89e3651d3c4933a2d8e0a7a06ded1b');
INSERT INTO `global_role_function` VALUES ('2ac4204efa3d4b459780cbdc3b64c123', '9ef64a3545fe4afe96d6fd37020a10ed', '340a102d09ab4307a329a8d5f3ef49e6');
INSERT INTO `global_role_function` VALUES ('461281c09fbd4aa0bfcc1f4dd6bf9b84', '9ef64a3545fe4afe96d6fd37020a10ed', 'c4974bf19fe94fdbaf9523dbfe392e4d');
INSERT INTO `global_role_function` VALUES ('4f0a4e6ac01f4949bef5141f6792d606', '9ef64a3545fe4afe96d6fd37020a10ed', '9455f3bbbb2f458eb0242d6f0b38d443');
INSERT INTO `global_role_function` VALUES ('5398b942c159497bb92867d0f9e4bc3b', '9ef64a3545fe4afe96d6fd37020a10ed', '0f89cd376d4845a09f7105fa6afc9a7c');
INSERT INTO `global_role_function` VALUES ('56ffa5138d214be98466b00090942acd', '9ef64a3545fe4afe96d6fd37020a10ed', 'fe22a2e9e93945eca7f4a9a10ef3249e');
INSERT INTO `global_role_function` VALUES ('5af00024a60c447284b42f38514f8d70', '9ef64a3545fe4afe96d6fd37020a10ed', '2a6d2ab07690426f8e8acd11c12ec7b4');
INSERT INTO `global_role_function` VALUES ('5c18550c7aa84e5ca8fa5c232132f7b3', '9ef64a3545fe4afe96d6fd37020a10ed', '5ce1be5d92f743bfabf092b7dac2f758');
INSERT INTO `global_role_function` VALUES ('660ef524f7194b6c9494d7db5b7eacd8', '9ef64a3545fe4afe96d6fd37020a10ed', '8b0dac3a317a48bc8c2c6634252aec4b');
INSERT INTO `global_role_function` VALUES ('69b2004fae2b46e7a81ff77072322b3b', '9ef64a3545fe4afe96d6fd37020a10ed', '8f786f114db546329853c99e6a18ddcf');
INSERT INTO `global_role_function` VALUES ('6b373e923d2246aab61b4ab6b9ad869c', '9ef64a3545fe4afe96d6fd37020a10ed', 'b32896faf5fa4eb58f15767fab184adb');
INSERT INTO `global_role_function` VALUES ('7530ae273e3843899bbbe3e24dde24e8', '9ef64a3545fe4afe96d6fd37020a10ed', '312a7c10e1d442c9a8f4f7a10f42c542');
INSERT INTO `global_role_function` VALUES ('755cf33c039949b89a15eaebcad4c167', '9ef64a3545fe4afe96d6fd37020a10ed', '715ec80e96ac47539f7a2ebc34478cad');
INSERT INTO `global_role_function` VALUES ('7741a6498bdd4fedb136ebe81fd7e4eb', '9ef64a3545fe4afe96d6fd37020a10ed', '8b58478ba50c4a179cca4943e810309e');
INSERT INTO `global_role_function` VALUES ('797e35039e964966aadf139e15cee75b', '9ef64a3545fe4afe96d6fd37020a10ed', '45ca901f55d4439a83d554d87fd3bfca');
INSERT INTO `global_role_function` VALUES ('7afd655536e443658674b42a6a27c975', '9ef64a3545fe4afe96d6fd37020a10ed', '893548f12d2b40dabaaa00b6e603f0cf');
INSERT INTO `global_role_function` VALUES ('82c0fccea19243dc9097f11264e18ae7', '9ef64a3545fe4afe96d6fd37020a10ed', 'e87c7fda07a44438aff176e6959487c7');
INSERT INTO `global_role_function` VALUES ('863b9398d2b0449080295bad944ee38b', '9ef64a3545fe4afe96d6fd37020a10ed', 'b444215c9cc24c4e86f2fef35c12eaec');
INSERT INTO `global_role_function` VALUES ('883fdcfd014045579f3f1a12d747aa1f', '9ef64a3545fe4afe96d6fd37020a10ed', 'dc0156d4c61d46d9982c5f13da125544');
INSERT INTO `global_role_function` VALUES ('88c0525628e34d79832b182a8181445c', '9ef64a3545fe4afe96d6fd37020a10ed', '8fb62581ebc9438187c5b31047764c52');
INSERT INTO `global_role_function` VALUES ('950b1d5277af40a5a80347eae3ae861e', '9ef64a3545fe4afe96d6fd37020a10ed', 'b610db4bb319483ab632c690749f7539');
INSERT INTO `global_role_function` VALUES ('9f0cf8f2e2bb451abbd018beeea48037', '9ef64a3545fe4afe96d6fd37020a10ed', '732510a1fc0f46e7ad3585debe5d2058');
INSERT INTO `global_role_function` VALUES ('a7aacc05b5f8454687347d5a7b2cd02d', '9ef64a3545fe4afe96d6fd37020a10ed', '5cd2f86b70b04eff9f4680bf7c7c56fd');
INSERT INTO `global_role_function` VALUES ('aa237e8ac34c4505959407e2f4defbc0', '9ef64a3545fe4afe96d6fd37020a10ed', '49f83acccbde42acad155cf466b1813c');
INSERT INTO `global_role_function` VALUES ('ab8c481eca604f3d86cd0e3c60924059', '9ef64a3545fe4afe96d6fd37020a10ed', '2cca5d86bb6441a3ad6bcd511ba036fc');
INSERT INTO `global_role_function` VALUES ('c592abb7a4bc4e8e8072b05bf5493f9d', '9ef64a3545fe4afe96d6fd37020a10ed', '541b73935a5b48ad99a61768f4c3fb29');
INSERT INTO `global_role_function` VALUES ('d8d6696045d2494bbb3befcdd83e17ab', '9ef64a3545fe4afe96d6fd37020a10ed', '2babc4ee128a455cbb4f067771667ee2');
INSERT INTO `global_role_function` VALUES ('f25ec7158d59447b809ee659a7ed951e', '9ef64a3545fe4afe96d6fd37020a10ed', '3eebfce8baa2403ba76837f822f19407');
INSERT INTO `global_role_function` VALUES ('fc1bf919f78c44ab8bd3b260601a1d79', '9ef64a3545fe4afe96d6fd37020a10ed', 'e7a263c14c9f4e7c81bc3f62660d3d4a');
