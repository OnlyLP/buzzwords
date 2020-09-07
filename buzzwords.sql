/*
Navicat MySQL Data Transfer

Source Server         : 119.23.241.23
Source Server Version : 50724
Source Host           : 119.23.241.23:3306
Source Database       : buzzwords

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2020-09-07 16:50:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for searchrecords
-- ----------------------------
DROP TABLE IF EXISTS `searchrecords`;
CREATE TABLE `searchrecords` (
  `lot_id` int(11) NOT NULL AUTO_INCREMENT,
  `lot_words` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`lot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of searchrecords
-- ----------------------------
INSERT INTO `searchrecords` VALUES ('1', '啦啦啦', '2020-09-07 14:07:16');
INSERT INTO `searchrecords` VALUES ('2', '啦啦啦', '2020-09-07 14:07:42');
INSERT INTO `searchrecords` VALUES ('3', '啦啦啦来', '2020-09-07 14:07:47');
INSERT INTO `searchrecords` VALUES ('4', '啦啦啦来', '2020-09-07 14:07:58');
INSERT INTO `searchrecords` VALUES ('5', '啦啦啦来', '2020-09-07 14:08:00');
INSERT INTO `searchrecords` VALUES ('6', '搜索', '2020-09-07 14:48:35');
INSERT INTO `searchrecords` VALUES ('7', '搜索测试', '2020-09-07 14:48:44');
INSERT INTO `searchrecords` VALUES ('8', '搜索测试', '2020-09-07 14:49:02');
INSERT INTO `searchrecords` VALUES ('9', '搜索测试', '2020-09-07 14:49:05');
INSERT INTO `searchrecords` VALUES ('10', '搜索测试', '2020-09-07 14:49:08');
INSERT INTO `searchrecords` VALUES ('11', '搜索', '2020-09-07 14:50:45');
INSERT INTO `searchrecords` VALUES ('12', '搜索', '2020-09-07 14:50:48');
INSERT INTO `searchrecords` VALUES ('13', '啦啦啦啦', '2020-09-07 16:11:09');

-- ----------------------------
-- Table structure for setwords
-- ----------------------------
DROP TABLE IF EXISTS `setwords`;
CREATE TABLE `setwords` (
  `set_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `set_words` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`set_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of setwords
-- ----------------------------
INSERT INTO `setwords` VALUES ('2', '自定义热词', '2');
INSERT INTO `setwords` VALUES ('3', '排序', '1');

-- ----------------------------
-- Table structure for sys_param
-- ----------------------------
DROP TABLE IF EXISTS `sys_param`;
CREATE TABLE `sys_param` (
  `param_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `value` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `remark` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`param_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_param
-- ----------------------------
INSERT INTO `sys_param` VALUES ('1', 'numbers', '10', '获取numbers数量的热词');
INSERT INTO `sys_param` VALUES ('5', 'hours', '12', '获取hours小时内的热词');
