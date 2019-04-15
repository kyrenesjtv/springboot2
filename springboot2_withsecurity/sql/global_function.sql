/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : blackbox2

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-04-15 18:06:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for global_function
-- ----------------------------
DROP TABLE IF EXISTS `global_function`;
CREATE TABLE `global_function` (
  `id` varchar(32) NOT NULL COMMENT '功能ID,NOT NULL,PRIMARY KEY',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `createUId` varchar(32) DEFAULT NULL COMMENT '创建人ID,UUID',
  `createName` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `address` varchar(100) DEFAULT NULL COMMENT '链接地址',
  `icon` varchar(100) DEFAULT NULL COMMENT '功能图标',
  `name` varchar(50) DEFAULT NULL COMMENT '功能名称',
  `remarks` varchar(1000) DEFAULT NULL COMMENT '备注说明',
  `parentId` varchar(32) DEFAULT NULL COMMENT '父亲节点,UUID',
  `sort` decimal(10,0) DEFAULT NULL COMMENT '排序',
  `state` decimal(10,0) DEFAULT NULL COMMENT '是否启用,0:禁用  1:开放',
  `type` decimal(10,0) DEFAULT NULL COMMENT '功能类型,0:权限  1:模块2:链接 3:事件',
  `visibility` decimal(10,0) DEFAULT NULL COMMENT '可见性,0:不可见 1：可见',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of global_function
-- ----------------------------
INSERT INTO `global_function` VALUES ('0f89cd376d4845a09f7105fa6afc9a7c', '2019-04-10 14:24:20', null, null, '/user/userLogin', null, '事件1', null, 'df3f90a106dc45f785c51f2f602f1d42', '3', '1', '3', '1');
INSERT INTO `global_function` VALUES ('2a6d2ab07690426f8e8acd11c12ec7b4', '2019-04-12 10:25:19', null, null, '/common/index', null, '浏览首页', null, '366d2c4d38e64dcc8497d4236b0effaf', '2', '1', '2', '1');
INSERT INTO `global_function` VALUES ('2babc4ee128a455cbb4f067771667ee2', '2019-04-09 18:40:34', null, '', '/common/init', '', '权限1', null, 'df3f90a106dc45f785c51f2f602f1d42', '1', '1', '0', '1');
INSERT INTO `global_function` VALUES ('2cca5d86bb6441a3ad6bcd511ba036fc', '2019-04-10 16:44:30', null, null, '/role/updateRoleById', null, '编辑', null, '5b951fe932a64ad995765dda32b1bf98', '4', '1', '3', '1');
INSERT INTO `global_function` VALUES ('2d90e67fef3749ccba79be9c1676bbc2', '2019-04-10 19:08:21', null, null, 'aaaa/aaaa', null, 'aaaaa', null, 'a9eb4bfd33944fdc9dfa842d089ecbf6', '1', '1', '0', '1');
INSERT INTO `global_function` VALUES ('2ffe25a965674197a215e15774d666b3', '2019-04-10 16:36:22', null, null, '/function/deleteFunctionByIds', null, '删除', null, '492f8356ff60412eb0248fb891ff5013', '3', '1', '3', '1');
INSERT INTO `global_function` VALUES ('304efc8c879a42ab89850cf299492dd2', '2019-04-10 16:39:33', null, null, '/constant/updateConstant', null, '修改', null, 'f6435acced1d43069d4d127ceb77a77e', '5', '1', '3', '1');
INSERT INTO `global_function` VALUES ('312a7c10e1d442c9a8f4f7a10f42c542', '2019-04-10 16:31:28', null, null, '/department/insertDepartment', null, '新增', null, '4e11a06ac61249bc9ab27691e0375fa1', '2', '1', '3', '1');
INSERT INTO `global_function` VALUES ('320c7c5ffed849d99a046367221e04a9', '2019-04-10 16:36:48', null, null, '/function/updateFunction', null, '编辑', null, '492f8356ff60412eb0248fb891ff5013', '4', '1', '3', '1');
INSERT INTO `global_function` VALUES ('340a102d09ab4307a329a8d5f3ef49e6', '2019-04-10 16:44:09', null, '', '/role/deleteRolesByIds', '', '删除', null, '5b951fe932a64ad995765dda32b1bf98', '3', '1', '3', '1');
INSERT INTO `global_function` VALUES ('366d2c4d38e64dcc8497d4236b0effaf', '2019-04-10 16:26:39', null, '', null, '', '首页', null, 'fc7799e9ef2047e391bdd3887e950643', '3', '1', '1', '1');
INSERT INTO `global_function` VALUES ('3bd6e6c6e4ec4237b11aa132170f9210', '2019-04-10 16:28:04', null, null, null, null, '系统日志', null, 'fc7799e9ef2047e391bdd3887e950643', '9', '1', '1', '1');
INSERT INTO `global_function` VALUES ('3eebfce8baa2403ba76837f822f19407', '2019-04-10 16:31:54', null, null, '/department/deleteDepartmentByIds', null, '删除', null, '4e11a06ac61249bc9ab27691e0375fa1', '3', '1', '3', '1');
INSERT INTO `global_function` VALUES ('45ca901f55d4439a83d554d87fd3bfca', '2019-04-10 16:32:51', null, null, '/department/updateDepartment', null, '编辑', null, '4e11a06ac61249bc9ab27691e0375fa1', '4', '1', '3', '1');
INSERT INTO `global_function` VALUES ('492f8356ff60412eb0248fb891ff5013', '2019-04-10 16:26:51', null, null, null, null, '模块管理', null, 'fc7799e9ef2047e391bdd3887e950643', '5', '1', '1', '1');
INSERT INTO `global_function` VALUES ('49f83acccbde42acad155cf466b1813c', '2019-04-10 16:40:49', null, null, '/user/insertUser', null, '新增', null, 'da5315e1ccc643159be78bc484c3c0c8', '2', '1', '3', '1');
INSERT INTO `global_function` VALUES ('4e11a06ac61249bc9ab27691e0375fa1', '2019-04-10 16:26:21', null, '', null, '', '部门管理', null, 'fc7799e9ef2047e391bdd3887e950643', '4', '1', '1', '1');
INSERT INTO `global_function` VALUES ('541b73935a5b48ad99a61768f4c3fb29', '2019-04-10 16:35:27', null, null, '/function/insertFunction', null, '新增', null, '492f8356ff60412eb0248fb891ff5013', '2', '1', '3', '1');
INSERT INTO `global_function` VALUES ('5b951fe932a64ad995765dda32b1bf98', '2019-04-10 16:27:43', null, null, null, null, '角色管理', null, 'fc7799e9ef2047e391bdd3887e950643', '8', '1', '1', '1');
INSERT INTO `global_function` VALUES ('5cd2f86b70b04eff9f4680bf7c7c56fd', '2019-04-10 16:45:11', null, null, '/role/insertRoleUser', null, '成员', null, '5b951fe932a64ad995765dda32b1bf98', '5', '1', '3', '1');
INSERT INTO `global_function` VALUES ('5ce1be5d92f743bfabf092b7dac2f758', '2019-04-10 16:42:13', null, null, '/user/updatePasswordById', null, '修改密码', null, 'da5315e1ccc643159be78bc484c3c0c8', '6', '1', '3', '1');
INSERT INTO `global_function` VALUES ('5f89e3651d3c4933a2d8e0a7a06ded1b', '2019-04-10 16:33:21', null, '', '/common/init', '', '首页', null, '366d2c4d38e64dcc8497d4236b0effaf', '1', '1', '2', '1');
INSERT INTO `global_function` VALUES ('715ec80e96ac47539f7a2ebc34478cad', '2019-04-10 16:43:51', null, '', '/role/insertSingleRole', '', '新增', null, '5b951fe932a64ad995765dda32b1bf98', '2', '1', '3', '1');
INSERT INTO `global_function` VALUES ('732510a1fc0f46e7ad3585debe5d2058', '2019-04-10 16:38:14', null, null, '/constant/insertConstant', null, '新增', null, 'f6435acced1d43069d4d127ceb77a77e', '2', '1', '3', '1');
INSERT INTO `global_function` VALUES ('893548f12d2b40dabaaa00b6e603f0cf', '2019-04-10 16:41:54', null, null, '/user/insertUserRole', null, '角色', null, 'da5315e1ccc643159be78bc484c3c0c8', '5', '1', '3', '1');
INSERT INTO `global_function` VALUES ('8b0dac3a317a48bc8c2c6634252aec4b', '2019-04-10 16:41:07', null, null, '/user/deleteUsersByIds', null, '删除', null, 'da5315e1ccc643159be78bc484c3c0c8', '3', '1', '3', '1');
INSERT INTO `global_function` VALUES ('8b58478ba50c4a179cca4943e810309e', '2019-04-10 16:40:08', null, null, '/viewUser/init', null, '首页', null, 'da5315e1ccc643159be78bc484c3c0c8', '1', '1', '2', '1');
INSERT INTO `global_function` VALUES ('8f786f114db546329853c99e6a18ddcf', '2019-04-10 14:20:16', null, null, '/common/index', null, '链接1', null, 'df3f90a106dc45f785c51f2f602f1d42', '2', '1', '2', '1');
INSERT INTO `global_function` VALUES ('8fb62581ebc9438187c5b31047764c52', '2019-04-10 16:38:34', null, null, '/constant/listInsertConstant', null, '批量新增', null, 'f6435acced1d43069d4d127ceb77a77e', '3', '1', '3', '1');
INSERT INTO `global_function` VALUES ('9455f3bbbb2f458eb0242d6f0b38d443', '2019-04-10 16:41:24', null, null, '/user/updateUser', null, '编辑', null, 'da5315e1ccc643159be78bc484c3c0c8', '4', '1', '3', '1');
INSERT INTO `global_function` VALUES ('a9eb4bfd33944fdc9dfa842d089ecbf6', '2019-04-10 19:07:11', null, null, null, null, 'aaaaaaa', null, '93a476e7950446588b43a48810823a0f', '1', '1', '1', '1');
INSERT INTO `global_function` VALUES ('b32896faf5fa4eb58f15767fab184adb', '2019-04-10 16:45:31', null, '', '/role/insertRoleFunction', '', '权限', null, '5b951fe932a64ad995765dda32b1bf98', '6', '1', '3', '1');
INSERT INTO `global_function` VALUES ('b444215c9cc24c4e86f2fef35c12eaec', '2019-04-10 16:39:16', null, null, '/constant/deleteConstantByIds', null, '删除', null, 'f6435acced1d43069d4d127ceb77a77e', '4', '1', '3', '1');
INSERT INTO `global_function` VALUES ('b610db4bb319483ab632c690749f7539', '2019-04-10 16:46:19', null, null, '/systemLog/systemOperationLog', null, '首页', null, '3bd6e6c6e4ec4237b11aa132170f9210', '1', '1', '2', '1');
INSERT INTO `global_function` VALUES ('c4974bf19fe94fdbaf9523dbfe392e4d', '2019-04-10 16:34:54', null, null, '/viewFunction/function', null, '首页', null, '492f8356ff60412eb0248fb891ff5013', '1', '1', '2', '1');
INSERT INTO `global_function` VALUES ('da5315e1ccc643159be78bc484c3c0c8', '2019-04-10 16:27:35', null, null, null, null, '用户管理', null, 'fc7799e9ef2047e391bdd3887e950643', '7', '1', '1', '1');
INSERT INTO `global_function` VALUES ('dc0156d4c61d46d9982c5f13da125544', '2019-04-10 16:14:37', null, null, '/viewDepartment/initDepartmemtList', null, 'initDepartmemtList', null, 'df3f90a106dc45f785c51f2f602f1d42', '4', '1', '3', '1');
INSERT INTO `global_function` VALUES ('e1c652693eb04ce3bbaedbb9fa2965b2', '2019-04-10 19:07:34', null, null, null, null, 'vvvvv', null, '93a476e7950446588b43a48810823a0f', '2', '1', '1', '1');
INSERT INTO `global_function` VALUES ('e7956b6f875c447181c4232e12d1df04', '2019-04-10 16:43:10', null, null, '/viewRole/init', null, '首页', null, '5b951fe932a64ad995765dda32b1bf98', '1', '1', '2', '1');
INSERT INTO `global_function` VALUES ('e7a263c14c9f4e7c81bc3f62660d3d4a', '2019-04-10 16:37:24', null, null, '/viewConstant/constant', null, '首页', null, 'f6435acced1d43069d4d127ceb77a77e', '1', '1', '2', '1');
INSERT INTO `global_function` VALUES ('e87c7fda07a44438aff176e6959487c7', '2019-04-10 16:47:20', null, null, '/systemLog/deleteSystemLogByIds', null, '删除', null, '3bd6e6c6e4ec4237b11aa132170f9210', '2', '1', '3', '1');
INSERT INTO `global_function` VALUES ('f6435acced1d43069d4d127ceb77a77e', '2019-04-10 16:27:02', null, null, null, null, '字典管理', null, 'fc7799e9ef2047e391bdd3887e950643', '6', '1', '1', '1');
INSERT INTO `global_function` VALUES ('fc7799e9ef2047e391bdd3887e950643', '2019-04-11 10:17:38', '', '', '', '', '模块设置', '信息', '', '1', '0', '1', '0');
INSERT INTO `global_function` VALUES ('fe22a2e9e93945eca7f4a9a10ef3249e', '2019-04-10 16:30:15', null, null, '/init', null, '首页', null, '4e11a06ac61249bc9ab27691e0375fa1', '1', '1', '2', '1');
