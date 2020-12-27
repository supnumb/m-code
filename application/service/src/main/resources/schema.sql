
# create database `Application` character set  'utf8' collate 'utf8_general_ci';

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for applications
-- ----------------------------
DROP TABLE IF EXISTS `applications`;
CREATE TABLE `applications`  (
                                 `ID` int(11) NOT NULL AUTO_INCREMENT,
                                 `AppCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                 `Secret` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                 `Name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                 `CompanyID` int(11) NOT NULL,
                                 `Description` varchar(3096) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                 `Status` int(11) NOT NULL DEFAULT 0,
                                 `Flag` int(11) NOT NULL DEFAULT 0,
                                 `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                 `UpdateTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
                                 PRIMARY KEY (`ID`) USING BTREE,
                                 INDEX `IXFK_Applications_Companies`(`CompanyID`) USING BTREE,
                                 CONSTRAINT `FK_CompanyID` FOREIGN KEY (`CompanyID`) REFERENCES `companies` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '实体企业下注册的应用程序列表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for companies
-- ----------------------------
DROP TABLE IF EXISTS `companies`;
CREATE TABLE `companies`  (
                              `ID` int(11) NOT NULL AUTO_INCREMENT,
                              `Name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                              `Contact` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                              `Telephone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                              `IsInside` bit(1) NOT NULL DEFAULT b'1',
                              `Status` int(11) NOT NULL DEFAULT 0,
                              `Flag` int(11) NOT NULL DEFAULT 0,
                              `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                              `UpdateTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
                              PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '注册到中台的实体企业表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

