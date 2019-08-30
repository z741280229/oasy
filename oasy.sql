/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.33 : Database - oasy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`oasy` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `oasy`;

/*Table structure for table `approval_list` */

DROP TABLE IF EXISTS `approval_list`;

CREATE TABLE `approval_list` (
  `al_id` int(4) NOT NULL AUTO_INCREMENT,
  `al_title` varchar(64) DEFAULT NULL COMMENT '名称',
  `al_img` varchar(64) DEFAULT NULL COMMENT '图标',
  `al_link` varchar(128) DEFAULT NULL COMMENT '链接',
  `al_type` int(4) DEFAULT NULL COMMENT '申请类型ID',
  `al_parent` int(2) DEFAULT NULL COMMENT '父类ID',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`al_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `approval_list` */

insert  into `approval_list`(`al_id`,`al_title`,`al_img`,`al_link`,`al_type`,`al_parent`,`data_status`) values (1,'考勤申请','',NULL,NULL,0,1),(2,'补录考勤','imgs/01.png','approval/attence',NULL,1,1),(3,'请假','imgs/02.png','approval/leave',NULL,1,1),(4,'出差申请','imgs/03.png','approval/travel',NULL,1,1),(5,'人事申请',NULL,NULL,NULL,0,1),(6,'入职申请单','imgs/04.png','approval/entry',1,5,1),(7,'离职申请单','imgs/05.png','approval/quit',NULL,5,1),(8,'转正申请单','imgs/06.png','approval/toWorker',NULL,5,1),(9,'费用报销',NULL,NULL,NULL,0,1),(10,'差旅费用报销单','imgs/07.png','approval/cost',NULL,9,1);

/*Table structure for table `attence` */

DROP TABLE IF EXISTS `attence`;

CREATE TABLE `attence` (
  `att_id` varchar(32) NOT NULL,
  `staff_id` varchar(32) DEFAULT NULL COMMENT '员工ID',
  `staff_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `staff_num` varchar(32) DEFAULT NULL COMMENT '工号',
  `staff_depart` varchar(32) DEFAULT NULL COMMENT '部门ID',
  `start_work_time` varchar(32) DEFAULT NULL COMMENT '上班时间',
  `check_in_time` varchar(32) DEFAULT NULL COMMENT '签到时间',
  `end_work_time` varchar(32) DEFAULT NULL COMMENT '下班时间',
  `signing_time` varchar(32) DEFAULT NULL COMMENT '签退时间',
  `check_in_status` int(2) DEFAULT NULL COMMENT '签到状态',
  `signing_status` int(2) DEFAULT NULL COMMENT '签退状态',
  `holiday` int(2) DEFAULT NULL COMMENT '假期类别',
  `other` varchar(256) DEFAULT NULL COMMENT '其他',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`att_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `attence` */

insert  into `attence`(`att_id`,`staff_id`,`staff_name`,`staff_num`,`staff_depart`,`start_work_time`,`check_in_time`,`end_work_time`,`signing_time`,`check_in_status`,`signing_status`,`holiday`,`other`,`data_status`) values ('1b20bc4bf0e9499cbec5f0f4bfe45bd7','786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001','5e9a14365bc3454e95b908527682addf','2019-05-05 08:00:00','2019-05-05 08:59:00','2019-05-05 17:00:00','2019-05-05 17:01:00',0,1,NULL,NULL,1),('2246b53872624adc949e4be293f302cd','786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001','5e9a14365bc3454e95b908527682addf','2019-04-04 08:00:00','2019-04-04 07:59:00','2019-04-04 17:00:00','2019-04-04 17:01:00',1,1,NULL,NULL,1),('24f5d86a9e084ae6b03f26c6b7cf5968','786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001','5e9a14365bc3454e95b908527682addf','2019-04-06 08:00:00','2019-04-06 08:59:00','2019-04-06 17:00:00','2019-04-06 16:59:00',0,0,NULL,NULL,1),('53e0cd357424470b8924da5bdf65303b','014e60ea2b9b41d6b93dedc38d465ad8','李思成','F00005','773b96b2320948048d8a1fa71e74dc51','2019-05-07 08:00:00','2019-05-07 08:59:00','2019-05-07 17:00:00','2019-05-07 17:30:00',0,1,NULL,NULL,1),('60a329d7a17041988c2cf4d8b0326420','014e60ea2b9b41d6b93dedc38d465ad8','李思成','F00005','773b96b2320948048d8a1fa71e74dc51','2019-05-06 08:00:00','2019-05-06 08:59:00','2019-05-06 17:00:00','2019-05-06 17:10:00',0,1,NULL,NULL,1),('78dd2b7ac8784ff6b1c578e87ed70db6','014e60ea2b9b41d6b93dedc38d465ad8','李思成','F00005','773b96b2320948048d8a1fa71e74dc51','2019-05-08 08:00:00','2019-05-08 07:59:00','2019-05-08 17:00:00','2019-05-08 17:20:00',1,1,NULL,NULL,1),('808074755b4444f9a1f67ffc86355b12','786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001','5e9a14365bc3454e95b908527682addf','2019-05-01 08:00:00','2019-05-01 07:59:00','2019-05-01 17:00:00','2019-05-01 16:00:00',1,0,NULL,NULL,1),('85b48b560fbc434494cfb4675dc63e23','014e60ea2b9b41d6b93dedc38d465ad8','李思成','F00005','773b96b2320948048d8a1fa71e74dc51','2019-05-08 08:00:00','2019-05-08 08:59:00','2019-05-08 17:00:00','2019-05-08 17:01:00',0,1,NULL,NULL,1),('c6fea9fac1fa46109ff10f4d09b0892f','786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001','5e9a14365bc3454e95b908527682addf','2019-05-02 08:00:00','2019-05-02 07:59:00','2019-05-02 17:00:00','2019-05-02 17:00:00',1,1,NULL,NULL,1),('f9920c2fe0e241318f54a98366ca0730','786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001','5e9a14365bc3454e95b908527682addf','2019-04-03 08:00:00','2019-04-03 07:59:00','2019-04-03 17:00:00','2019-04-03 17:00:00',1,1,NULL,NULL,1),('f9920c2fe0e241318f54a98366ca0731','786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001','5e9a14365bc3454e95b908527682addf','2019-05-08 08:00:00','2019-05-08 07:30:00','2019-05-08 17:00:00','2019-05-08 17:02:00',1,1,NULL,NULL,1);

/*Table structure for table `boardroom` */

DROP TABLE IF EXISTS `boardroom`;

CREATE TABLE `boardroom` (
  `bd_id` int(8) NOT NULL AUTO_INCREMENT,
  `bd_name` varchar(64) DEFAULT NULL COMMENT '会议室名',
  `bd_space` int(32) DEFAULT NULL COMMENT '可容纳人数',
  `bd_place` varchar(128) DEFAULT NULL COMMENT '会议室地点',
  `create_time` varchar(64) DEFAULT NULL COMMENT '创建时间',
  `close_time` varchar(64) DEFAULT NULL COMMENT '关闭时间',
  `create_pel` varchar(64) DEFAULT NULL COMMENT '创建人',
  `data_status` tinyint(2) DEFAULT '1',
  PRIMARY KEY (`bd_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `boardroom` */

insert  into `boardroom`(`bd_id`,`bd_name`,`bd_space`,`bd_place`,`create_time`,`close_time`,`create_pel`,`data_status`) values (1,'大会议室',32,'一楼',NULL,NULL,NULL,1),(2,'小会议室',20,'三楼',NULL,NULL,NULL,1),(3,'第一会议室',45,'一楼',NULL,NULL,NULL,1),(4,'第二会议室',45,'二楼',NULL,NULL,NULL,1),(5,'第三会议室',46,'五楼',NULL,NULL,NULL,1);

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `car_id` varchar(32) NOT NULL,
  `car_number` varchar(64) DEFAULT NULL COMMENT '车牌号',
  `car_brand` varchar(64) DEFAULT NULL COMMENT '汽车品牌',
  `car_type` int(2) DEFAULT NULL COMMENT '车型',
  `car_space` int(32) DEFAULT NULL COMMENT '载客人数',
  `car_driver_id` varchar(32) DEFAULT NULL COMMENT '司机',
  `car_driver_name` varchar(64) DEFAULT NULL COMMENT '司机名',
  `car_driver_tel` varchar(32) DEFAULT NULL COMMENT '司机联系方式',
  `car_limits` int(2) DEFAULT '1' COMMENT '使用权限',
  `car_date_safe` varchar(64) DEFAULT NULL COMMENT '年检日期',
  `car_status` int(2) DEFAULT '1' COMMENT '状态',
  `car_mileage` int(32) DEFAULT '0' COMMENT '里程数',
  `c_oil_mass` decimal(18,2) DEFAULT '0.00' COMMENT '使用油量',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`car_id`,`car_number`,`car_brand`,`car_type`,`car_space`,`car_driver_id`,`car_driver_name`,`car_driver_tel`,`car_limits`,`car_date_safe`,`car_status`,`car_mileage`,`c_oil_mass`,`data_status`) values ('19592e635b144f529eb5c0eea4b7fe4e','运A1111','大众',76,4,NULL,'张三','15038884999',2,'2019-04-11',0,0,'0.00',1),('23c1d8a8e4c14859ad69c48ccf376f53','运A5555','格力汽车',79,12,NULL,'张洲','15024446999',1,'2019-04-03',0,0,'0.00',1),('6c3d4d5f852547cbb0924ddc3b1e2ab0','运A7777','奥迪',76,4,NULL,'凯晨','13698884555',1,'2019-04-03',1,0,'0.00',1),('7ff03ca0305c48a6a71b924ebeacca9b','运A4444','红旗',77,4,NULL,'王五','15036669555',3,'2019-04-03',1,0,'0.00',1),('99695e1a08b04826b9402e9038375a5c','运A2222','大众',75,4,NULL,'李四','15036664999',1,'2019-04-03',1,0,'0.00',1),('ef6207b6258646f39ee820113ac406e2','运A6666','丰田',75,4,NULL,'风成','15026667999',1,'2019-04-03',0,0,'0.00',1),('fc91407d64a64824a2b1386e7bec4d17','运A3333','大众辉腾',77,4,NULL,'王某','15023334333',2,'2019-04-03',1,0,'0.00',1);

/*Table structure for table `car_application` */

DROP TABLE IF EXISTS `car_application`;

CREATE TABLE `car_application` (
  `car_app_id` varchar(32) NOT NULL,
  `car_app_user_id` varchar(32) DEFAULT NULL COMMENT '使用者ID',
  `car_app_user_name` varchar(64) DEFAULT NULL COMMENT '使用者姓名',
  `car_app_user_tel` varchar(32) DEFAULT NULL COMMENT '使用者电话号码',
  `car_id` varchar(64) DEFAULT NULL COMMENT '汽车ID',
  `car_name` varchar(32) DEFAULT NULL COMMENT '车品牌',
  `car_num` varchar(32) DEFAULT NULL COMMENT '车牌号',
  `driver_id` varchar(64) DEFAULT NULL COMMENT '汽车配用司机',
  `driver_name` varchar(64) DEFAULT NULL COMMENT '汽车司机名',
  `driver_tel` varchar(32) DEFAULT NULL COMMENT '司机电话号码',
  `nature` int(2) DEFAULT NULL COMMENT '使用性质（公用、私用）',
  `start_time` varchar(64) DEFAULT NULL COMMENT '开始时间',
  `end_time` varchar(64) DEFAULT NULL COMMENT '结束时间',
  `pre_run` int(32) DEFAULT NULL COMMENT '预计行程',
  `fact_run` int(32) DEFAULT NULL COMMENT '实际行程',
  `start_part` varchar(64) DEFAULT NULL COMMENT '出发地',
  `end_part` varchar(64) DEFAULT NULL COMMENT '目的地',
  `use_reason` text COMMENT '使用原因',
  `car_app_status` int(2) DEFAULT NULL COMMENT '申请状态',
  `to_staff` varchar(32) DEFAULT NULL COMMENT '向谁申请',
  `return_date` varchar(32) DEFAULT NULL COMMENT '归还日期',
  `app_car_time` varchar(32) DEFAULT NULL COMMENT '申请时间',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`car_app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `car_application` */

insert  into `car_application`(`car_app_id`,`car_app_user_id`,`car_app_user_name`,`car_app_user_tel`,`car_id`,`car_name`,`car_num`,`driver_id`,`driver_name`,`driver_tel`,`nature`,`start_time`,`end_time`,`pre_run`,`fact_run`,`start_part`,`end_part`,`use_reason`,`car_app_status`,`to_staff`,`return_date`,`app_car_time`,`data_status`) values ('30301c651285432aaddf92ff7421b78a','786a3701b1ef47fc9eb1f694c081c27d','李懂','15082380000','23c1d8a8e4c14859ad69c48ccf376f53','格力汽车','运A5555',NULL,'李懂','15082380000',1,'2019-05-02 01:00','2019-06-03 01:00',2300,NULL,'成都','上海','出差',1,'786a3701b1ef47fc9eb1f694c081c27d',NULL,'2019-05-01 12:29:32',1),('329e10e070b74360ae76ff4fbedad20b','786a3701b1ef47fc9eb1f694c081c27d','李懂','15082380000','ef6207b6258646f39ee820113ac406e2','丰田','运A6666',NULL,'李懂','15082380000',1,'2019-05-01','2019-05-01 02:00',20,NULL,'成都金牛区','成都双流区','接待客人',1,'786a3701b1ef47fc9eb1f694c081c27d',NULL,'2019-05-06 09:02:13',1),('f1903e0ebe134555be2c80e831b8e7ad','786a3701b1ef47fc9eb1f694c081c27d','李懂','15082380000','19592e635b144f529eb5c0eea4b7fe4e','大众','运A1111',NULL,'李懂','15082380000',1,'2019-05-02 01:00','2019-05-02 01:00',700,NULL,'攀枝花市','成都市','出差',1,'786a3701b1ef47fc9eb1f694c081c27d',NULL,'2019-05-01 11:04:06',1);

/*Table structure for table `catalog` */

DROP TABLE IF EXISTS `catalog`;

CREATE TABLE `catalog` (
  `cat_id` int(4) NOT NULL AUTO_INCREMENT,
  `parent_id` int(4) DEFAULT NULL COMMENT '父目录id',
  `catalog_name` varchar(64) DEFAULT NULL COMMENT '名称',
  `catalog_url` varchar(64) DEFAULT NULL COMMENT '映射路径',
  `is_show` int(2) DEFAULT NULL COMMENT '是否为show',
  `distinguish` int(2) DEFAULT NULL COMMENT '区分知识和下载',
  `data_status` int(2) DEFAULT '1' COMMENT '逻辑删除',
  PRIMARY KEY (`cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `catalog` */

insert  into `catalog`(`cat_id`,`parent_id`,`catalog_name`,`catalog_url`,`is_show`,`distinguish`,`data_status`) values (1,0,'技术天地','',0,0,1),(2,0,'公司知识',NULL,0,0,1),(3,0,'公司文件',NULL,0,0,1),(4,0,'会议资料',NULL,0,0,1),(5,0,'版本文件',NULL,0,0,1),(6,0,'宣传资料',NULL,0,0,1),(7,0,'辅助工具',NULL,0,1,1),(8,0,'软件下载',NULL,0,1,1),(11,0,'资源共享',NULL,0,1,1),(12,0,'采购文档',NULL,0,1,1),(13,0,'财务流程',NULL,0,1,1),(14,0,'办公室管理',NULL,0,1,1),(15,0,'电子图书',NULL,0,1,1),(22,0,'财务类目',NULL,0,2,1),(23,0,'人事类目',NULL,0,2,1),(24,0,'其他类目',NULL,0,2,1),(26,NULL,'测试',NULL,NULL,2,0);

/*Table structure for table `conference` */

DROP TABLE IF EXISTS `conference`;

CREATE TABLE `conference` (
  `con_id` varchar(64) NOT NULL,
  `con_theme` varchar(256) DEFAULT NULL COMMENT '会议主题',
  `con_type` int(2) DEFAULT NULL COMMENT '会议类型',
  `con_compere_name` varchar(64) DEFAULT NULL COMMENT '主持人姓名',
  `con_compere` varchar(64) DEFAULT NULL COMMENT '主持人',
  `con_sponsor_dapart_name` varchar(64) DEFAULT NULL COMMENT '主办方名(部门)',
  `con_sponsor_dapart` varchar(64) DEFAULT NULL COMMENT '主办方(部门)',
  `con_linkman` varchar(64) DEFAULT NULL COMMENT '会议联系人',
  `con_linkman_name` varchar(64) DEFAULT NULL COMMENT '联系人姓名',
  `con_linkman_tel` varchar(64) DEFAULT NULL COMMENT '会议联系人联系方式',
  `con_place_id` int(8) DEFAULT NULL COMMENT '会议地点ID',
  `con_place_name` varchar(126) DEFAULT NULL COMMENT '会议室名称',
  `con_model` int(4) DEFAULT NULL COMMENT '会议模式',
  `con_recorder` varchar(64) DEFAULT NULL COMMENT '纪要人员',
  `con_recorder_name` varchar(64) DEFAULT NULL COMMENT '纪要人员姓名',
  `con_record` text COMMENT '会议记录',
  `con_resource` text COMMENT '会议资源',
  `con_end_date` varchar(64) DEFAULT NULL COMMENT '会议结束时间',
  `con_start_date` varchar(64) DEFAULT NULL COMMENT '会议开始时间',
  `con_status` int(2) DEFAULT NULL COMMENT '会议状态',
  `con_ok_time` varchar(64) DEFAULT NULL COMMENT '会议申请成功时间',
  `con_app_time` varchar(64) DEFAULT NULL COMMENT '会议申请时间',
  `to_staff` varchar(64) DEFAULT NULL COMMENT '向谁申请',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `conference` */

insert  into `conference`(`con_id`,`con_theme`,`con_type`,`con_compere_name`,`con_compere`,`con_sponsor_dapart_name`,`con_sponsor_dapart`,`con_linkman`,`con_linkman_name`,`con_linkman_tel`,`con_place_id`,`con_place_name`,`con_model`,`con_recorder`,`con_recorder_name`,`con_record`,`con_resource`,`con_end_date`,`con_start_date`,`con_status`,`con_ok_time`,`con_app_time`,`to_staff`,`data_status`) values ('3d61fe904c2e401d824210516182fd7e','开发研究',64,'李懂','786a3701b1ef47fc9eb1f694c081c27d','综合资财部','5e9a14365bc3454e95b908527682addf','786a3701b1ef47fc9eb1f694c081c27d','李懂','15082380000',1,'大会议室',1,'786a3701b1ef47fc9eb1f694c081c27d','李懂','<p>这是一个新建的会议纪要</p>','办公文件',NULL,'2019-05-01 01:00',3,NULL,'2019-05-15 11:09:02','786a3701b1ef47fc9eb1f694c081c27d',1),('d699c46946414faa8c4ff0142bf8db66','测试申请会议',64,'李思成','014e60ea2b9b41d6b93dedc38d465ad8','营销事业部','119c7cb2481e4c959a2cd64ecfd145d1','014e60ea2b9b41d6b93dedc38d465ad8','李思成','15082385555',1,'大会议室',1,'786a3701b1ef47fc9eb1f694c081c27d','李懂','<p>这是在测试添加纪要</p><table><tbody><tr class=\"firstRow\"><td width=\"199\" valign=\"top\" style=\"word-break: break-all;\">1</td><td width=\"199\" valign=\"top\" style=\"word-break: break-all;\">2</td><td width=\"199\" valign=\"top\" style=\"word-break: break-all;\">4</td></tr><tr><td width=\"199\" valign=\"top\" style=\"word-break: break-all;\">2</td><td width=\"199\" valign=\"top\" style=\"word-break: break-all;\">3</td><td width=\"199\" valign=\"top\" style=\"word-break: break-all;\">3</td></tr></tbody></table><p><br/></p>','电脑 会议室',NULL,'2019-04-04 00:12',3,NULL,'2019-04-23 13:05:13','786a3701b1ef47fc9eb1f694c081c27d',1);

/*Table structure for table `conference_part` */

DROP TABLE IF EXISTS `conference_part`;

CREATE TABLE `conference_part` (
  `conference_id` varchar(32) DEFAULT NULL COMMENT '会议ID',
  `part_name` varchar(64) DEFAULT NULL COMMENT '参与者姓名',
  `part_id` varchar(32) DEFAULT NULL COMMENT '参与者ID',
  `conference_name` varchar(256) DEFAULT NULL COMMENT '会议名称',
  `part_type` int(2) DEFAULT NULL COMMENT '1:实际参加 0：需要参加',
  `con_status` int(2) DEFAULT '0' COMMENT '1:未开始'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `conference_part` */

insert  into `conference_part`(`conference_id`,`part_name`,`part_id`,`conference_name`,`part_type`,`con_status`) values ('d699c46946414faa8c4ff0142bf8db66',NULL,'786a3701b1ef47fc9eb1f694c081c27d','测试申请会议',0,0),('d699c46946414faa8c4ff0142bf8db66',NULL,'a10adf63aa954813b237fca50b182573','测试申请会议',0,0),('d699c46946414faa8c4ff0142bf8db66',NULL,'ddc78c6a59d5426cbca1723e6c5f82f9','测试申请会议',0,0),('d699c46946414faa8c4ff0142bf8db66',NULL,'e5c0c7c54eca49b9bdba6234dbacf4b5','测试申请会议',0,0),('d699c46946414faa8c4ff0142bf8db66',NULL,'6703f7b2134e46418062b688a38b1b37','测试申请会议',0,0),('3d61fe904c2e401d824210516182fd7e',NULL,'786a3701b1ef47fc9eb1f694c081c27d','开发研究',0,0),('3d61fe904c2e401d824210516182fd7e',NULL,'6703f7b2134e46418062b688a38b1b37','开发研究',0,0),('3d61fe904c2e401d824210516182fd7e',NULL,'52d8affc5ed44f3f93a67d8200d3c5f6','开发研究',0,0),('3d61fe904c2e401d824210516182fd7e',NULL,'4fdbfa42577d4d83bc84899f315f015c','开发研究',0,0);

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `depart_id` varchar(64) NOT NULL,
  `depart_num` varchar(32) DEFAULT NULL COMMENT '部门编号',
  `depart_leader` varchar(32) DEFAULT NULL COMMENT '部门领导',
  `depart_name` varchar(64) DEFAULT NULL COMMENT '名称',
  `parent_id` varchar(64) DEFAULT NULL COMMENT '上级部门',
  `sub_sd` varchar(64) DEFAULT NULL COMMENT '子部门',
  `create_date` varchar(64) DEFAULT NULL COMMENT '创建时间',
  `close_date` varchar(64) DEFAULT NULL COMMENT '关闭时间',
  `depart_duty` text COMMENT '部门职责',
  `data_status` tinyint(2) DEFAULT '1' COMMENT '逻辑删除',
  `dapart_type` int(2) DEFAULT NULL COMMENT '部门类型',
  PRIMARY KEY (`depart_id`),
  KEY `dapart_type` (`dapart_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`depart_id`,`depart_num`,`depart_leader`,`depart_name`,`parent_id`,`sub_sd`,`create_date`,`close_date`,`depart_duty`,`data_status`,`dapart_type`) values ('119c7cb2481e4c959a2cd64ecfd145d1','D3000','e5c0c7c54eca49b9bdba6234dbacf4b5','营销事业部','241165f1cf29472dbe417fbef916b3c2',NULL,'2019-03-31 19:05:55',NULL,'促进公司销售',1,1),('19843f6f41d34c52862fbe7bc6b118c3','D4001','06916c6860e5486faf8d56044f202147','研发部','bba4af5cac4c4474bf0e4aa03dadadea',NULL,'2019-03-31 19:17:08',NULL,'研发',1,4),('241165f1cf29472dbe417fbef916b3c2','D0000','786a3701b1ef47fc9eb1f694c081c27d','总经理室','0','','04/11/2019',NULL,'管理部门人员',1,1),('35101a59ff1141338931827d7b99f8e2','D4002','06916c6860e5486faf8d56044f202147','物流部','bba4af5cac4c4474bf0e4aa03dadadea',NULL,'2019-03-31 19:17:34',NULL,'物流',1,4),('5a11cadad23a4ed5a87ba52a49b50fb3','D1001','06916c6860e5486faf8d56044f202147','办公室','e839f40fb3d04778afe0c28e686ba862',NULL,'2019-03-31 19:08:42',NULL,'管理办公等',1,2),('5e9a14365bc3454e95b908527682addf','D2000','1757d5379b114c20b2cf7612a1641bfb','综合资财部','241165f1cf29472dbe417fbef916b3c2',NULL,'2019-03-31 19:04:58',NULL,'管理公司经济',1,1),('773b96b2320948048d8a1fa71e74dc51','D1003','52d8affc5ed44f3f93a67d8200d3c5f6','信息部','e839f40fb3d04778afe0c28e686ba862',NULL,'07/03/2019',NULL,'管理信息和技术',1,5),('7da532ee06ec4caea60ceed852fcc0ae','D40006','014e60ea2b9b41d6b93dedc38d465ad8','开发部','bba4af5cac4c4474bf0e4aa03dadadea',NULL,'2019-04-18',NULL,'开发',1,5),('8690564ccb65413fbb7e62f46feb08f7','D4003','1757d5379b114c20b2cf7612a1641bfb','生产部','bba4af5cac4c4474bf0e4aa03dadadea',NULL,'2019-03-31 19:17:57',NULL,'生产',1,4),('95a67a8fc4ca4bfbae2d15d9d0074707','D1002','1757d5379b114c20b2cf7612a1641bfb','人事部','e839f40fb3d04778afe0c28e686ba862',NULL,'2019-03-31 19:09:28',NULL,'管理部门',1,2),('a8acd7921f0343eba1ae1bd5b370c32e','D2001','a10adf63aa954813b237fca50b182573','财务部','5e9a14365bc3454e95b908527682addf',NULL,'2019-03-31 19:11:20',NULL,'管理公司财务',1,2),('bba4af5cac4c4474bf0e4aa03dadadea','D4000','014e60ea2b9b41d6b93dedc38d465ad8','生产事业部','241165f1cf29472dbe417fbef916b3c2',NULL,'2019-03-31 19:06:18',NULL,'生产',1,1),('c6c48e4200e648ea838e6ab61f347578','D4004','014e60ea2b9b41d6b93dedc38d465ad8','创新部','bba4af5cac4c4474bf0e4aa03dadadea',NULL,'2019-04-02 21:24:07',NULL,'研发新产品',1,5),('e839f40fb3d04778afe0c28e686ba862','D1000','014e60ea2b9b41d6b93dedc38d465ad8','综合行政部','241165f1cf29472dbe417fbef916b3c2',NULL,'2019-03-31 19:02:19',NULL,'维护公司正常运行等',1,1),('f35d6128beaf42a59c504cc260b0d723','D2002','ddc78c6a59d5426cbca1723e6c5f82f9','采购部','5e9a14365bc3454e95b908527682addf',NULL,'2019-03-31 19:11:38',NULL,'采购物品',1,2),('f7510087468848a2bb413aeb24ea221b','D3002','6703f7b2134e46418062b688a38b1b37','市场部','119c7cb2481e4c959a2cd64ecfd145d1',NULL,'2019-03-31 19:13:10',NULL,'市场',1,2),('fdb2905cdc624d6d943222af7f43dbc1','D30011','6703f7b2134e46418062b688a38b1b37','销一','fdb2905cdc624d6d943222af7f43dbc7',NULL,NULL,NULL,NULL,1,3),('fdb2905cdc624d6d943222af7f43dbc7','D3001','6703f7b2134e46418062b688a38b1b37','销售部','119c7cb2481e4c959a2cd64ecfd145d1',NULL,'2019-03-31 19:12:54',NULL,'销售',1,2);

/*Table structure for table `dictionary` */

DROP TABLE IF EXISTS `dictionary`;

CREATE TABLE `dictionary` (
  `dict_id` int(32) NOT NULL AUTO_INCREMENT,
  `dict_type_id` varchar(32) DEFAULT NULL COMMENT '字典类型ID',
  `dict_type_num` varchar(32) DEFAULT NULL COMMENT '类型序号',
  `dict_type_details` varchar(64) DEFAULT NULL COMMENT '类型详情',
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

/*Data for the table `dictionary` */

insert  into `dictionary`(`dict_id`,`dict_type_id`,`dict_type_num`,`dict_type_details`) values (1,'1','1','管理'),(2,'1','2','服务'),(3,'1','3','销售'),(4,'1','4','生产'),(5,'1','5','研发'),(6,'2','1','P5'),(7,'2','2','P6'),(8,'2','3','P7'),(9,'2','4','P8'),(10,'2','5','M1'),(11,'2','6','M2'),(12,'2','7','M3'),(13,'2','8','M4'),(14,'3','1','男'),(15,'3','2','女'),(16,'4','1','在职'),(17,'4','2','离职'),(18,'5','1','已完成'),(19,'5','2','未完成'),(20,'5','3','进行中'),(21,'5','4','暂停'),(22,'6','1','一般'),(23,'6','2','重要'),(24,'6','3','非常重要'),(25,'6','4','紧急'),(26,'7','1','常规工作'),(27,'7','2','市场推广'),(28,'7','3','活动举办'),(29,'7','4','物品采购'),(30,'7','5','培训'),(31,'7','6','人员招聘'),(32,'7','7','其他'),(33,'8','1','实时新闻'),(34,'8','2','公司新闻'),(35,'8','3','财经新闻'),(36,'8','4','军事新闻'),(37,'8','5','体育新闻'),(38,'8','6','娱乐新闻'),(39,'8','7','政府新闻'),(40,'9','1','工作通知'),(41,'9','2','活动通知'),(42,'9','3','其他通知'),(43,'9','4','重要通知'),(44,'10','1','办公用品'),(45,'10','2','纸质类'),(46,'11','1','个'),(47,'11','2','桶'),(48,'11','3','支'),(49,'11','4','把'),(50,'11','5','块'),(51,'11','6','本'),(52,'11','7','卷'),(53,'11','8','盒'),(54,'11','9','张'),(55,'11','10','台'),(56,'11','11','瓶'),(57,'11','12','斤'),(58,'12','1','申请中'),(59,'12','2','驳回申请'),(60,'12','3','待购买'),(61,'12','4','待入库'),(62,'12','5','已入库'),(64,'13','1','生产'),(65,'13','2','策划'),(66,'13','3','人事'),(67,'13','4','学习'),(68,'14','1','2018年公司开支账单'),(69,'14','2','2017年公司开支账单'),(70,'14','3','2016年公司开支账单'),(71,'14','4','2015年公司开支账单'),(72,'14','5','公司职员简历'),(73,'14','6','人事合同档案'),(74,'14','7','其他'),(75,'15','1','手自一体'),(76,'15','2','手动基本型'),(77,'15','3','自动豪华型'),(78,'15','4','自动导航版'),(79,'15','5','前四后八'),(80,'15','6','半挂');

/*Table structure for table `document` */

DROP TABLE IF EXISTS `document`;

CREATE TABLE `document` (
  `docu_id` varchar(64) NOT NULL,
  `docu_name` varchar(64) DEFAULT NULL,
  `docu_size` decimal(18,2) DEFAULT '0.00',
  `docu_download_num` int(32) DEFAULT '0',
  `uploader_name` varchar(64) DEFAULT NULL COMMENT '上传者姓名',
  `uploader` varchar(64) DEFAULT NULL COMMENT '上传者',
  `url` text,
  `docu_real_name` varchar(256) DEFAULT NULL COMMENT '文件真实名称',
  `docu_num_name` varchar(126) DEFAULT NULL COMMENT '文件编码名称',
  `docu_type` varchar(256) DEFAULT NULL COMMENT '文件类型',
  `docu_path` varchar(256) DEFAULT NULL COMMENT '文件路径',
  `catalog` int(8) DEFAULT NULL COMMENT '父目录',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`docu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `document` */

insert  into `document`(`docu_id`,`docu_name`,`docu_size`,`docu_download_num`,`uploader_name`,`uploader`,`url`,`docu_real_name`,`docu_num_name`,`docu_type`,`docu_path`,`catalog`,`data_status`) values ('163c9f27ad184eaa9ed512b377bd4bd2',NULL,'11.00',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'停车场建设项目.docx','89bd4504314a46299c3bd5fb43dfd0fd.docx','application/vnd.openxmlformats-officedocument.wordprocessingml.document','upload\\record\\',3,1),('18245c27e0d641338930f191308f3aef',NULL,'9.14',1,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'resources.sql','d89a25c01ecf45faa8587c839ed879b2.sql','application/octet-stream','upload/record/',1,1),('2dfebed0054f412f94843bb0d71ea9f9',NULL,'3268.00',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'建立git仓库截屏.png','6772b6355a734fa1b1329bcb1d6a8ebf.png','image/png','upload\\record\\',4,1),('454ec0b7c71241909df2988d16d38675',NULL,'180.00',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'commons-io-2.4.jar','0c90845ea49845e5809acf610dba472b.jar','application/octet-stream','upload\\record\\',8,1),('59475a8819e141f792cc7c1b7e91dfcf',NULL,'0.75',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'index.html','fe3370851d9744ffbf65aee0dc5428a9.html','text/html','upload\\record\\',6,1),('6101627c7b414f758828a496ee71cb7e',NULL,'5.25',1,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'01.png','f37e65a9594c4ec5bbcb6b6a280d1a5b.png','image/png','upload/record/',1,1),('67997b206c464dc0b444b70c8e7bfd2b',NULL,'12.00',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'2019030403.xls','f111e807786c434fb47cfabe2deb2127.xls','application/vnd.ms-excel','upload\\record\\',1,1),('8b87f6067e7246cd98dd490413ef123a',NULL,'3268.00',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'建立git仓库截屏.png','07ead2eb92374ffd85c77ff4badfd660.png','image/png','upload\\record\\',4,1),('976c929da13a4e46b99b8c270ff19f77',NULL,'3.93',1,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'welcome.jsp','7f86ea821bd6459285e1f5249ee5c5ab.jsp','application/octet-stream','upload/record/',1,1),('9aec5ab28918423c85321f961777bfc4',NULL,'0.00',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'index.html','ca18f5a9a29a4f5a90665879eb844fcf.html','text/html','upload\\record\\',1,1),('a196e58ef7ec4f66a7cd555e2a263b76',NULL,'0.00',0,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'index11111.html','65a6f0b868bc4f9f917cc8410ac838b4.html','text/html','upload\\record\\',2,1),('b829fd6ad86d4a6faaa30115b2e2c5ba',NULL,'12.50',1,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'2019030403 (1).xls','30100807ebe34c3e9b3eda44404d1cb9.xls','application/vnd.ms-excel','upload\\record\\',7,1),('bd51bc70a96a4e8b8769680f6df86724',NULL,'0.00',1,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'免责声明.txt','48da9a63e075422aa455ccdead4e054d.txt','text/plain','upload\\record\\',11,1),('ca9b6605b1b843d7bbf372924c59dcfe',NULL,'6.21',3,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'07.png','3a9e1e559d394edfbef210d5c7773ee1.png','image/png','upload/record/',6,1),('dded388e759647d9bad31891ec6769c3',NULL,'6.08',1,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'web.xml','53dd75dd48514bb1b56e40d51a084605.xml','text/xml','upload\\record\\',7,0),('f4eb1bd5e37e4c9297785d17e6020581',NULL,'503.00',1,'李懂','786a3701b1ef47fc9eb1f694c081c27d',NULL,'ER.vsd','f1d7bf149f44484ab831cf5c08c40122.vsd','application/vnd.visio','upload/record/',1,1);

/*Table structure for table `entry` */

DROP TABLE IF EXISTS `entry`;

CREATE TABLE `entry` (
  `en_id` varchar(32) NOT NULL,
  `en_num` varchar(32) DEFAULT NULL COMMENT '编号',
  `en_name` varchar(64) DEFAULT '入职申请',
  `staff_name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `staff_id` varchar(32) DEFAULT NULL COMMENT '员工Id',
  `staff_sex` int(2) DEFAULT NULL COMMENT '性别',
  `staff_in_date` varchar(64) DEFAULT NULL COMMENT '入职时间',
  `staff_depart_id` varchar(32) DEFAULT NULL COMMENT '部门ID',
  `staff_posi_id` varchar(32) DEFAULT NULL COMMENT '拟岗ID',
  `staff_type` int(2) DEFAULT NULL COMMENT '员工内行',
  `staff_school` varchar(64) DEFAULT NULL COMMENT '毕业院校',
  `staff_formal` varchar(32) DEFAULT NULL COMMENT '学历',
  `staff_major` varchar(64) DEFAULT NULL COMMENT '专业',
  `staff_gradu_date` varchar(32) DEFAULT NULL COMMENT '毕业时间',
  `staff_internship_start_date` varchar(32) DEFAULT NULL COMMENT '实习开始日',
  `staff_internship_end_date` varchar(32) DEFAULT NULL COMMENT '实习结束日',
  `staff_oringin_part` varchar(128) DEFAULT NULL COMMENT '原单位',
  `staff_residence_part` varchar(256) DEFAULT NULL COMMENT '户口所在地',
  `private_email` varchar(32) DEFAULT NULL COMMENT '私人邮件',
  `office_tel` varchar(32) DEFAULT NULL COMMENT '办公电话',
  `mobile_phone` varchar(32) DEFAULT NULL COMMENT '移动电话',
  `company_email` varchar(32) DEFAULT NULL COMMENT '公司邮件',
  `staff_now_part` varchar(256) DEFAULT NULL COMMENT '现居地址',
  `staff_num` varchar(32) DEFAULT NULL COMMENT '员工工号',
  `oa_num` varchar(32) DEFAULT NULL COMMENT 'OA账号',
  `personal_profile` text COMMENT '个人简介',
  `staff_bank_name` varchar(128) DEFAULT NULL COMMENT '开户行',
  `staff_bank_num` varchar(64) DEFAULT NULL COMMENT '开户行账号',
  `social_insurance_part` varchar(128) DEFAULT NULL COMMENT '社保地',
  `social_insurance_num` varchar(64) DEFAULT NULL COMMENT '社保号',
  `staff_sign_type` int(2) DEFAULT NULL COMMENT '劳工合同签署方式',
  `en_opinion` text COMMENT '审批意见',
  `pr_status` int(2) DEFAULT NULL COMMENT '流转状态',
  `en_date` varchar(64) DEFAULT NULL COMMENT '申请时间',
  `pr_id` int(4) DEFAULT '1' COMMENT '申请流程Id(类型)',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`en_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `entry` */

insert  into `entry`(`en_id`,`en_num`,`en_name`,`staff_name`,`staff_id`,`staff_sex`,`staff_in_date`,`staff_depart_id`,`staff_posi_id`,`staff_type`,`staff_school`,`staff_formal`,`staff_major`,`staff_gradu_date`,`staff_internship_start_date`,`staff_internship_end_date`,`staff_oringin_part`,`staff_residence_part`,`private_email`,`office_tel`,`mobile_phone`,`company_email`,`staff_now_part`,`staff_num`,`oa_num`,`personal_profile`,`staff_bank_name`,`staff_bank_num`,`social_insurance_part`,`social_insurance_num`,`staff_sign_type`,`en_opinion`,`pr_status`,`en_date`,`pr_id`,`data_status`) values ('8d53cd3da49d4a5cb85e5e444999bf10','NO20190503104112','入职申请','李懂','786a3701b1ef47fc9eb1f694c081c27d',1,'2019-05-04','5e9a14365bc3454e95b908527682addf','067b549ab171476285e372214889e8ee',NULL,'攀枝花学院','本科','软件工程','2019-05-03','2019-05-16','2019-05-06','','南充市','2589922@qq.com','15028953366','15028953366','15028953366','攀枝花学院','F00001','F00001','十分优秀','中国邮政','132135464562','成都市','44666644',0,'同意',NULL,'2019-05-03',1,1);

/*Table structure for table `file` */

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
  `file_id` varchar(32) NOT NULL,
  `file_num` varchar(64) DEFAULT NULL COMMENT '档案编号',
  `file_name` varchar(64) DEFAULT NULL COMMENT '档案名称',
  `file_parent` int(2) DEFAULT NULL COMMENT '父目录',
  `file_grade` int(2) DEFAULT '1' COMMENT '档案性质（机密）',
  `file_deadline` int(2) DEFAULT '1' COMMENT '保存期限',
  `file_save_way` int(2) DEFAULT '1' COMMENT '保存方式（电、纸）',
  `file_save_person_name` varchar(64) DEFAULT NULL COMMENT '保存者姓名',
  `file_save_person` varchar(32) DEFAULT NULL COMMENT '保存者',
  `file_save_date` varchar(64) DEFAULT NULL COMMENT '保存日期',
  `file_status` int(2) DEFAULT '1' COMMENT '状态',
  `file_belong_name` varchar(128) DEFAULT NULL COMMENT '类别名',
  `file_belong` int(2) DEFAULT NULL COMMENT '档案所属类别',
  `file_save_place` varchar(64) DEFAULT NULL COMMENT '文件位置',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `file` */

insert  into `file`(`file_id`,`file_num`,`file_name`,`file_parent`,`file_grade`,`file_deadline`,`file_save_way`,`file_save_person_name`,`file_save_person`,`file_save_date`,`file_status`,`file_belong_name`,`file_belong`,`file_save_place`,`data_status`) values ('13fe1196e9704b61be09ce6f5130bc2e','FF33333','公司人员信息表',23,1,2,1,'李懂','786a3701b1ef47fc9eb1f694c081c27d','2019-04-23 18:23:57',0,NULL,74,'档案室',1),('911995cee01d4ed7a83960de803c6373','F0001111','2018下季度财务报表',22,1,1,1,'李懂','786a3701b1ef47fc9eb1f694c081c27d','2019-04-24 15:23:10',0,NULL,68,'档案室',1);

/*Table structure for table `file_borrow` */

DROP TABLE IF EXISTS `file_borrow`;

CREATE TABLE `file_borrow` (
  `file_borrow_id` varchar(32) NOT NULL,
  `file_id` varchar(32) DEFAULT NULL COMMENT '文件ID',
  `file_num` varchar(32) DEFAULT NULL COMMENT '文件编号',
  `file_name` varchar(128) DEFAULT NULL COMMENT '文件名',
  `borrower_name` varchar(64) DEFAULT NULL COMMENT '借阅者名',
  `borrower_num` varchar(32) DEFAULT NULL COMMENT '借阅者工号',
  `borrower_id` varchar(32) DEFAULT NULL COMMENT '借阅者ID',
  `file_borrow_reason` text COMMENT '借阅理由',
  `file_borrow_date` varchar(64) DEFAULT NULL,
  `file_return_date` varchar(64) DEFAULT NULL,
  `file_pre_return_date` varchar(64) DEFAULT NULL COMMENT '预计归还时间',
  `file_borrow_status` int(2) DEFAULT NULL COMMENT '0 以借阅 1 已归还 2超期',
  `deal_borrow_id` varchar(32) DEFAULT NULL COMMENT '处理借阅者ID',
  `deal_borrow_name` varchar(64) DEFAULT NULL COMMENT '处理借阅姓名',
  `deal_return_id` varchar(32) DEFAULT NULL COMMENT '处理归还者ID',
  `deal_return_name` varchar(64) DEFAULT NULL COMMENT '处理归还者姓名',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`file_borrow_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `file_borrow` */

insert  into `file_borrow`(`file_borrow_id`,`file_id`,`file_num`,`file_name`,`borrower_name`,`borrower_num`,`borrower_id`,`file_borrow_reason`,`file_borrow_date`,`file_return_date`,`file_pre_return_date`,`file_borrow_status`,`deal_borrow_id`,`deal_borrow_name`,`deal_return_id`,`deal_return_name`,`data_status`) values ('1d164cb216dd4eccafd48b145ff91588','911995cee01d4ed7a83960de803c6373','F0001111','2018下季度财务报表','李懂','F00001','786a3701b1ef47fc9eb1f694c081c27d','查看','2019-04-24','2019-04-24 18:05:27','2019-05-24',1,'786a3701b1ef47fc9eb1f694c081c27d','李懂','786a3701b1ef47fc9eb1f694c081c27d','李懂',1),('6483ee7fd3a84006bdd26adc49f6d142','13fe1196e9704b61be09ce6f5130bc2e','FF33333','公司人员信息表','李懂','F00001','786a3701b1ef47fc9eb1f694c081c27d','查看','2019-04-24','2019-04-24 18:15:04','2019-05-24',1,'786a3701b1ef47fc9eb1f694c081c27d','李懂','786a3701b1ef47fc9eb1f694c081c27d','李懂',1),('912d45190fef426ea66c3e9a787fd321','911995cee01d4ed7a83960de803c6373','F0001111','2018下季度财务报表','李懂','F00001','786a3701b1ef47fc9eb1f694c081c27d','借阅','2019-04-24',NULL,'2019-05-24',0,'786a3701b1ef47fc9eb1f694c081c27d','李懂',NULL,NULL,1),('d2a4e54855e24b3db34b291b125761b1','13fe1196e9704b61be09ce6f5130bc2e','FF33333','公司人员信息表','李懂','F00001','786a3701b1ef47fc9eb1f694c081c27d','借阅','2019-04-24',NULL,'2019-06-23',3,'786a3701b1ef47fc9eb1f694c081c27d','李懂','786a3701b1ef47fc9eb1f694c081c27d','李懂',1);

/*Table structure for table `job` */

DROP TABLE IF EXISTS `job`;

CREATE TABLE `job` (
  `job_id` varchar(64) NOT NULL,
  `job_leader` varchar(64) DEFAULT NULL COMMENT '负责人',
  `job_title` varchar(64) DEFAULT NULL COMMENT '标题',
  `job_grade` int(4) DEFAULT NULL COMMENT '任务等级',
  `job_type` int(4) DEFAULT NULL COMMENT '类别',
  `job_key_word` varchar(64) DEFAULT NULL COMMENT '关键字',
  `schedule` int(4) unsigned DEFAULT NULL COMMENT '进度',
  `job_content` text COMMENT '内容',
  `job_around_time` int(8) DEFAULT NULL COMMENT '预估时间',
  `job_start_time` varchar(64) DEFAULT NULL COMMENT '开始时间',
  `job_end_time` varchar(64) DEFAULT NULL COMMENT '结束时间',
  `job_file` text COMMENT '文件地址',
  `job_file_number_name` varchar(128) DEFAULT NULL COMMENT '文件编号',
  `job_file_real_name` varchar(512) DEFAULT NULL COMMENT '文件真实名称',
  `job_file_type` varchar(64) DEFAULT NULL COMMENT '文件类型',
  `data_status` tinyint(2) DEFAULT '1',
  `job_menber` text COMMENT '成员（备用）',
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `job` */

insert  into `job`(`job_id`,`job_leader`,`job_title`,`job_grade`,`job_type`,`job_key_word`,`schedule`,`job_content`,`job_around_time`,`job_start_time`,`job_end_time`,`job_file`,`job_file_number_name`,`job_file_real_name`,`job_file_type`,`data_status`,`job_menber`) values ('062601190cc64e7eab97e114a529c37d','786a3701b1ef47fc9eb1f694c081c27d','测试上传文件',22,26,'测试',20,'<p>新建文本测试</p>',1,'05/01/2019','05/01/2019','upload/record/','de34dbd957684b2996e41809e8cd6969.jsp','welcome.jsp','application/octet-stream',1,NULL),('068a5d0a50ae4e3c8ba8e301249621ab','e5c0c7c54eca49b9bdba6234dbacf4b5','测试回显参与人员',23,26,'开发',20,'',1,'04/01/2019','04/01/2019',NULL,NULL,NULL,NULL,1,NULL),('08de3a8594744fe086ceb3bc81b7b8cf','786a3701b1ef47fc9eb1f694c081c27d','大搜车APP',23,26,'开发',20,'',1,'04/01/2019','04/01/2019',NULL,NULL,NULL,NULL,1,NULL),('2cc5b9b4fb8e41169f1944617d012fdf','52d8affc5ed44f3f93a67d8200d3c5f6','来了APP',22,26,'开发',20,'<p><img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190408/1554722310485076971.jpg\" title=\"1554722310485076971.jpg\" alt=\"10.jpg\" width=\"204\" height=\"79\"/></p>',28,'04/02/2019','04/30/2019','upload\\record\\','4763ea5dce254004b57504ed9a616e2d.html','index.html','text/html',1,NULL),('6efebe30767e4e5a939d0eb327e79c25','014e60ea2b9b41d6b93dedc38d465ad8','测试添加人员',22,26,'测试',20,'<p><img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190415/1555305879684090839.jpg\" title=\"1555305879684090839.jpg\" alt=\"10.jpg\" width=\"179\" height=\"161\"/>dasda</p>',1,'04/01/2019','04/01/2019','upload\\record\\','5d4493ed927d45febb985b5add5af718.xls','2019030403 (1).xls','application/vnd.ms-excel',1,NULL),('7c06f273e9c744089438ad0d675420ac','e5c0c7c54eca49b9bdba6234dbacf4b5','测试下载',23,26,'下载',19,'<p>测试</p>',1,'04/02/2019','04/03/2019','upload\\record\\','889fa91b26254400869eb7c148726b5d.jpg','10.jpg','image/jpeg',1,NULL),('95bf2ede19504c26b33319996afb7494','014e60ea2b9b41d6b93dedc38d465ad8','睡了APP',23,26,'开发',20,'<p>测试添加人任务</p>',20,'2019-01-07','2019-01-31',NULL,NULL,NULL,NULL,1,NULL),('9ace3dfbb04049eebc99123c1eb95216','ddc78c6a59d5426cbca1723e6c5f82f9','国安APP',22,26,'开发',20,'<p>测试<br/></p>',12,'04/11/2019','04/18/2019','upload\\record\\','434d250e3dbf480a97219a57b19bbbaa.html','index.html',NULL,1,NULL),('a14b29ae80cc4ba0b930f1e69739d7f0','e5c0c7c54eca49b9bdba6234dbacf4b5','了了APP',22,26,'开发',20,'<p>测试数据<img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190407/1554636430391057871.jpg\" title=\"1554636430391057871.jpg\" alt=\"10.jpg\" width=\"102\" height=\"79\"/></p>',21,'04/17/2019','05/01/2019','upload\\record\\','9bcd6880cc9b4a1d8ad6f5a467f2dd76.sql','Oracle第二天笔记.sql',NULL,1,NULL),('a738453c9b0e4c46b0a54c2b99926102','4fdbfa42577d4d83bc84899f315f015c','招聘',23,26,'招聘',20,'<p>招聘</p>',10,'2019-04-07','2019-04-17',NULL,NULL,NULL,NULL,1,NULL),('b5231bc552a14e20adecce0b50ba04c9','ddc78c6a59d5426cbca1723e6c5f82f9','大风网站',22,26,'开发',20,'',7,'04/01/2019','04/08/2019',NULL,NULL,NULL,NULL,1,NULL),('c8735d10518349ff92c6836e941582f9','014e60ea2b9b41d6b93dedc38d465ad8','测试添加人员',23,26,'测试',20,'<p><img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190415/1555311000713063982.jpg\" title=\"1555311000713063982.jpg\" alt=\"error.jpg\" width=\"187\" height=\"99\"/></p>',1,'04/01/2019','04/01/2019','upload\\record\\','7d2dbf2189b347c99afd603b0c25ba25.jpg','10.jpg','image/jpeg',1,NULL),('d8c226bc5b434dc398d07c99ad8d2028','06916c6860e5486faf8d56044f202147','团建',22,32,'活动',20,'<p>开展公司活动</p>',1,'04/02/2019','04/03/2019','upload\\record\\','ae2c0104ddb44302a994d93336a0ef76.html','index.html','text/html',1,NULL),('e69c191be2f94d8abbdd40a31de59651','52d8affc5ed44f3f93a67d8200d3c5f6','招聘',22,26,'招聘人员',20,'<p>测试任务上传</p>',15,'04/03/2019','04/18/2019','upload\\record\\','20a5492f5fcf4acd961ec485702af0c9.sql','Oracle第二天笔记.sql',NULL,1,NULL),('f58adc663fff4df99320c0bb0f4d16ff','4fdbfa42577d4d83bc84899f315f015c','测试下载3',22,26,'测试下载',19,'',0,'04/02/2019','04/02/2019','upload\\record\\','044d9a8b713b40afa91a641b129f14d5.jpg','10.jpg','image/jpeg',1,NULL);

/*Table structure for table `my_approval` */

DROP TABLE IF EXISTS `my_approval`;

CREATE TABLE `my_approval` (
  `myap_id` int(32) NOT NULL AUTO_INCREMENT,
  `ap_id` varchar(32) DEFAULT NULL COMMENT '审批ID',
  `pr_id` int(4) DEFAULT NULL COMMENT '流程ID',
  `pr_type_id` int(4) DEFAULT NULL COMMENT '流程类型ID',
  `pr_type_name` varchar(64) DEFAULT NULL COMMENT '流程名',
  `pr_number` int(4) DEFAULT NULL COMMENT '流程序号',
  `pr_staff_id` varchar(32) DEFAULT NULL COMMENT '处理者ID',
  `pr_deal_time` varchar(64) DEFAULT NULL COMMENT '处理时间',
  `pr_status` int(2) DEFAULT '0' COMMENT '流程状态',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`myap_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `my_approval` */

insert  into `my_approval`(`myap_id`,`ap_id`,`pr_id`,`pr_type_id`,`pr_type_name`,`pr_number`,`pr_staff_id`,`pr_deal_time`,`pr_status`,`data_status`) values (4,'8d53cd3da49d4a5cb85e5e444999bf10',1,1,'提交入职申请',1,'786a3701b1ef47fc9eb1f694c081c27d','2019-05-04 16:57:08',1,1),(5,'8d53cd3da49d4a5cb85e5e444999bf10',2,1,'部门主管审核',2,'786a3701b1ef47fc9eb1f694c081c27d','2019-05-04 16:57:18',1,1),(6,'8d53cd3da49d4a5cb85e5e444999bf10',3,1,'人事部审核',3,'1757d5379b114c20b2cf7612a1641bfb',NULL,0,1);

/*Table structure for table `notice_and_news` */

DROP TABLE IF EXISTS `notice_and_news`;

CREATE TABLE `notice_and_news` (
  `n_id` varchar(32) NOT NULL,
  `n_title` varchar(256) DEFAULT NULL COMMENT '主题',
  `n_type` int(4) DEFAULT NULL COMMENT '类别',
  `n_sender` varchar(32) DEFAULT NULL COMMENT '发送者',
  `n_sender_name` varchar(32) DEFAULT NULL COMMENT '发送者名',
  `n_send_time` varchar(32) DEFAULT NULL,
  `n_send_content` text,
  `n_file_path` varchar(256) DEFAULT NULL COMMENT '文件路径',
  `n_file_type` varchar(32) DEFAULT NULL COMMENT '文件类型',
  `n_file_num_name` varchar(256) DEFAULT NULL COMMENT '文件编码',
  `n_file_real_name` varchar(256) DEFAULT NULL COMMENT '文件名称',
  `n_grade` tinyint(2) DEFAULT NULL COMMENT '信息等级',
  `data_status` tinyint(2) DEFAULT '1',
  `n_distinguish` tinyint(2) DEFAULT NULL COMMENT '公告和新闻区分',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `notice_and_news` */

insert  into `notice_and_news`(`n_id`,`n_title`,`n_type`,`n_sender`,`n_sender_name`,`n_send_time`,`n_send_content`,`n_file_path`,`n_file_type`,`n_file_num_name`,`n_file_real_name`,`n_grade`,`data_status`,`n_distinguish`) values ('073d0c6312dd49ceb0f5ceb83c0022ab','新闻',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 15:27:44','<p>据国家工商总局网站消息，国家工商总局今天公布了近期查处的部分虚假违法广告典型案例，北京创客互动科技有限公司发布违法广告案、双鸭山广播电视台发布违法广告案等15个案例曝光。 　　一、北京创客互动科技有限公司发布违法广告案 　　当事人利用微信公众号发布的广告内容中含有违背社会良好风尚内容，违反了《广告法》第九条规定。2017年7月，北京市工商局朝阳分局作出行政处罚，责令当事人停止发布违法广告，罚没款合计20.3万元。 　　二、双鸭山广播电视台发布违法广告案 　　当事人在所属新闻综合广播、交通广播频率发布“百合康越橘叶黄素软胶囊”“本元首脑胶囊”等10个产品违法广告，当事人未健全广告承接登记、审核管理制度，未认真履行广告审查义务，以健康讲座形式变相发布广告，对药品的功效、治愈率、有效率、安全性做出保证性承诺，对商品的功能、用途、成分进行虚假宣传，欺骗、误导消费者，违反了《广告法》第十六条、第十九条、第二十八条等规定。2017年11月，双鸭山市市场监督管理局作出行政处罚，责令当事人停止发布违法广告，罚款88万元。 　　三、上海华与华营销咨询有限公司设计违法广告案 　　当事人为华夏幸福基业股份有限公司在动车组列车展牌媒体及航机杂志上设计广告。广告中使用的中华人民共和国地图未将国界线完整、准确的表示，损害了国家尊严及利益。且当事人在以后的相关广告设计中，在已知其广告地图绘制错误的情况下，仍未将我国领土表示完整、准确，客观上持续了违法行为，放任了危害后果的继续发生，违反了《广告法》第九条规定。2017年11月，上海市静安区市场监管局作出行政处罚，没收广告费用8.8万元，罚款100万元。 　　四、上海证大金融信息服务有限公司发布违法广告案 　　当事人利用“捞财宝APP”和捞财宝官网，宣传“新手专享96982期 10.0%年化收益率”等有关收益率宣传的内容，违反了《广告法》第二十五条规定。2017年9月，上海市浦东新区市场监管局作出行政处罚，罚款60万元。 　　五、浙江台州章某发布违法广告案 　　当事人在某网站平台上发布的“帝皇强肾汤”“御舒丹”广告用语涉嫌宣传治疗功能，涉案产品包装上含有的多项内容均为虚假，涉嫌犯罪。2017年11月，台州市黄岩区市场监管局已将该案移交公安部门调查处理。 　　六、安徽省长天资产管理有限公司发布违法广告案 　　当事人通过自设网站及微信公众号发布的广告内容与事实不符，含有明示或者暗示保本、无风险或者保收益的内容，违反了《广告法》第二十五条等规定。2017年10月，合肥市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款72.83万元。 　　七、福建省莆商贷互联网金融服务有限公司发布违法广告案 　　当事人在其公司网站及经营场所发布金融广告，广告中含有虚假内容，并对未来收益作出保证性承诺，没有对可能存在的风险以及风险责任承担有合理提示或者警示，违反了《广告法》第二十五条等规定。2017年10月，莆田市城厢区工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款30万元。 　　八、威海市广播电视台发布违法保健食品广告案 　　当事人在所属频道发布“红阳盐藻”“千菌方”“爱体养心口服液”“阳气肽”保健食品广告，广告中利用专家、患者的名义和形象作证明，含有表示功效、安全性的断言或者保证，并利用健康讲座形式变相发布保健食品广告，违反了《广告法》第十六条等规定。2017年8月，威海市工商局作出行政处罚，罚没款合计78.8万余元。 　　九、利川市长江医院发布违法医疗广告案 　　当事人未经医疗广告审查机关审查，利用宣传册和户外广告对其医疗服务进行宣传，广告内容含有表示功效、安全性的断言或者保证，违反了《广告法》第十六条等规定。2017年7月，利川市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款22万元。 　　十、广州市南珠医疗美容门诊有限公司发布违法广告案 　　当事人为推销其经营的医疗美容服务，通过官方网站、微信公众号及张贴宣传画板等形式发布广告对外进行宣传。广告含有与事实不符或者缺乏事实依据、容易误导消费者的虚假内容，违反了《广告法》第二十八条等规定。2017年10月，广州市海珠区市场和质量监督管理局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款95万元。 　　十一、南宁协和医院有限责任公司发布违法广告案 　　当事人以虚假荣誉证书授予的称号发布医疗广告，欺骗、误导消费者，违反了《广告法》第二十八条规定。2017年11月，玉林市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款20万元。 　　十二、海南东方明珠房地产有限公司发布违法广告案 　　当事人在广告宣传中以项目距离机场所需时间表示项目位置，将“产权式酒店”宣传为普通“高层住宅区”，误导消费者，违反了《广告法》第二十六条等规定。2017年7月，海南省海口市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款113万元。 　　十三、云南广播电视台发布违法医疗器械广告案 　　当事人与郑州康金瑞健康产业有限公司签订广告发布合同，在云南卫视频道发布“糖御医牌远红外贴”广告，该广告未按广告审查批准内容播出，含有表示功效、安全性的断言或者保证，出现了专家、患者名义作证明等内容，违反了《广告法》第十六条等规定。2017年9月，云南省工商局分别对云南广播电视台、广告主郑州康金瑞健康产业有限公司作出行政处罚，罚没款合计21.06万元。 　　十四、甘肃省广播电影电视总台(集团)发布违法广告案 　　当事人利用甘肃卫视频道发布“劵钞版《清明上河图大邮票》”广告，广告含有明示或者暗示保本、无风险或者保收益等内容，违反了《广告法》第二十五条规定。2017年9月，甘肃省工商局作出行政处罚，责令当事人停止发布违法广告，罚没款合计61.42万元。 　　十五、新疆电视台发布违法食品、保健食品广告案 　　当事人发布“老院长祛斑方”“藏宝保健滋补液”等食品、保健品广告，广告中含有涉及疾病治疗功能、医疗用语等内容，违反了《广告法》第十七条规定。2017年7月，新疆维吾尔自治区工商局作出行政处罚，责令当事人停止发布违法广告，罚款20万元。</p><p><br/></p>','upload\\record\\','image/jpeg','c100e8e538b94d528ceb4cc083519c95.jpg','error.jpg',NULL,1,0),('0c6d7fa31f79407c974415846ac50b71','',NULL,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-05-13 00:06:38','<p><span style=\"color: rgb(112, 116, 120); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; font-size: 12px; background-color: rgb(255, 255, 255);\">据国家工商总局网站消息，国家工商总局今天公布了近期查处的部分虚假违法广告典型案例，北京创客互动科技有限公司发布违法广告案、双鸭山广播电视台发布违法广告案等15个案例曝光。 　　一、北京创客互动科技有限公司发布违法广告案 　　当事人利用微信公众号发布的广告内容中含有违背社会良好风尚内容，违反了《广告法》第九条规定。2017年7月，北京市工商局朝阳分局作出行政处罚，责令当事人停止发布违法广告，罚没款合计20.3万元。 　　二、双鸭山广播电视台发布违法广告案 　　当事人在所属新闻综合广播、交通广播频率发布“百合康越橘叶黄素软胶囊”“本元首脑胶囊”等10个产品违法广告，当事人未健全广告承接登记、审核管理制度，未认真履行广告审查义务，以健康讲座形式变相发布广告，对药品的功效、治愈率、有效率、安全性做出保证性承诺，对商品的功能、用途、成分进行虚假宣传，欺骗、误导消费者，违反了《广告法》第十六条、第十九条、第二十八条等规定。2017年11月，双鸭山市市场监督管理局作出行政处罚，责令当事人停止发布违法广告，罚款88万元。 　　三、上海华与华营销咨询有限公司设计违法广告案 　　当事人为华夏幸福基业股份有限公司在动车组列车展牌媒体及航机杂志上设计广告。广告中使用的中华人民共和国地图未将国界线完整、准确的表示，损害了国家尊严及利益。且当事人在以后的相关广告设计中，在已知其广告地图绘制错误的情况下，仍未将我国领土表示完整、准确，客观上持续了违法行为，放任了危害后果的继续发生，违反了《广告法》第九条规定。2017年11月，上海市静安区市场监管局作出行政处罚，没收广告费用8.8万元，罚款100万元。 　　四、上海证大金融信息服务有限公司发布违法广告案 　　当事人利用“捞财宝APP”和捞财宝官网，宣传“新手专享96982期 10.0%年化收益率”等有关收益率宣传的内容，违反了《广告法》第二十五条规定。2017年9月，上海市浦东新区市场监管局作出行政处罚，罚款60万元。 　　五、浙江台州章某发布违法广告案 　　当事人在某网站平台上发布的“帝皇强肾汤”“御舒丹”广告用语涉嫌宣传治疗功能，涉案产品包装上含有的多项内容均为虚假，涉嫌犯罪。2017年11月，台州市黄岩区市场监管局已将该案移交公安部门调查处理。 　　六、安徽省长天资产管理有限公司发布违法广告案 　　当事人通过自设网站及微信公众号发布的广告内容与事实不符，含有明示或者暗示保本、无风险或者保收益的内容，违反了《广告法》第二十五条等规定。2017年10月，合肥市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款72.83万元。 　　七、福建省莆商贷互联网金融服务有限公司发布违法广告案 　　当事人在其公司网站及经营场所发布金融广告，广告中含有虚假内容，并对未来收益作出保证性承诺，没有</span><img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190513/1557677196418080766.png\" title=\"1557677196418080766.png\" alt=\"02.png\"/></p>',NULL,NULL,NULL,NULL,NULL,0,0),('14623136181a4f6fba1a417f373bbcda','新办公大楼主体竣工完成',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:07:30','<p>新办公大楼在集团及施工单位的集体努力下，于昨日主体宣告竣工。经监管单位验收，所有指标均高出国家标准。比计划提前了2个月。下个月开始，楼体的表面装饰工作将开始动工。&nbsp;<br/></p><p>接收人：</p><p>管理员;艾雪;陈小小;高凌;高伟;黄山;姜程;金万里;李国天;林琳;刘东;刘丰;刘刚;刘娟;刘晓宇;李晓红;李玉友;娄军;马天成;潘鹏;潘阳;孙富贵;孙楠;孙悦;系统管理员;田宇;普通用户;王大勇;王刚;王浩;王锦;王明;王萍;王强;王涛;王伟;王英;夏帆;肖鹏飞;薛爱荷;扬帆;杨新颖;于学军;张胜阳;张秀英;张振东;赵华威;郑和;周天</p><p><br/></p>','upload\\record\\','image/gif','985a1d46f0414626b5075bbeca8cadd6.gif','order.gif',NULL,1,0),('164c1d1d6c414a24a3ce5a5e55a180ba','羽毛球比赛结果展示',42,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:28:48','<p><span style=\"color: rgb(88, 102, 110); font-family: &quot;Microsoft YaHei&quot;, Helvetica; font-size: 14px; background-color: rgb(255, 255, 255);\">经过周六激烈的角逐，本年度羽毛球公开赛成绩如下： 第一名：生产一部 第二名：物流部 第三名：财务部 我们向取得好成绩的部门表示衷心祝贺！ 等等等等的结局解决军军军军军</span></p>','upload\\record\\','image/gif','2d263104f2784818867b268b20f8dbc5.gif','cart.gif',NULL,1,1),('30dd7c7b020d4a8f9bffa5f1babe49d6','测试重新部署',33,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-06-01 00:24:28','<p>奥德赛大啊大<img src=\"http://localhost:8080/oasy/ueditor/jsp/upload/image/20190601/1559319863922023287.png\" title=\"1559319863922023287.png\" alt=\"07.png\"/></p>','upload/record/','text/xml','c2358496e4bf4d71bdd807a61473c835.xml','pom.xml',NULL,0,0),('3f5e2c5e5ecc41158e7b7c93c90eefb1','【财务部公告】关于增值税发票开具有关问题的公告',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:37:52','<p><span style=\"color: rgb(88, 102, 110); font-family: &quot;Microsoft YaHei&quot;, Helvetica; font-size: 14px; background-color: rgb(255, 255, 255);\">关于增值税发票开具有关问题的公告&nbsp;&nbsp; 国家税务总局近日印发了《关于增值税发票开具有关问题的公告》（国家税务总局公告2017年第16号），自2017年7月1日起，购买方为企业的，索取增值税普通发票时，应向销售方提供纳税人识别号或统一社会信用代码。按上述要求，公司决定在索取增值税专用发票和增值税普通发票时，应向开票方提供如下信息，若信息未按照要求填列，则不予报销。（附件为增票样张） 特此通知。&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 财务部&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2017-12-02</span></p>',NULL,NULL,NULL,NULL,NULL,1,1),('3f8ac9d3b6984b1da945c853480d6346','测试文件',33,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-05-13 00:07:07','<p><span style=\"color: rgb(112, 116, 120); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif; font-size: 12px; background-color: rgb(255, 255, 255);\">据国家工商总局网站消息，国家工商总局今天公布了近期查处的部分虚假违法广告典型案例，北京创客互动科技有限公司发布违法广告案、双鸭山广播电视台发布违法广告案等15个案例曝光。 　　一、北京创客互动科技有限公司发布违法广告案 　　当事人利用微信公众号发布的广告内容中含有违背社会良好风尚内容，违反了《广告法》第九条规定。2017年7月，北京市工商局朝阳分局作出行政处罚，责令当事人停止发布违法广告，罚没款合计20.3万元。 　　二、双鸭山广播电视台发布违法广告案 　　当事人在所属新闻综合广播、交通广播频率发布“百合康越橘叶黄素软胶囊”“本元首脑胶囊”等10个产品违法广告，当事人未健全广告承接登记、审核管理制度，未认真履行广告审查义务，以健康讲座形式变相发布广告，对药品的功效、治愈率、有效率、安全性做出保证性承诺，对商品的功能、用途、成分进行虚假宣传，欺骗、误导消费者，违反了《广告法》第十六条、第十九条、第二十八条等规定。2017年11月，双鸭山市市场监督管理局作出行政处罚，责令当事人停止发布违法广告，罚款88万元。 　　三、上海华与华营销咨询有限公司设计违法广告案 　　当事人为华夏幸福基业股份有限公司在动车组列车展牌媒体及航机杂志上设计广告。广告中使用的中华人民共和国地图未将国界线完整、准确的表示，损害了国家尊严及利益。且当事人在以后的相关广告设计中，在已知其广告地图绘制错误的情况下，仍未将我国领土表示完整、准确，客观上持续了违法行为，放任了危害后果的继续发生，违反了《广告法》第九条规定。2017年11月，上海市静安区市场监管局作出行政处罚，没收广告费用8.8万元，罚款100万元。 　　四、上海证大金融信息服务有限公司发布违法广告案 　　当事人利用“捞财宝APP”和捞财宝官网，宣传“新手专享96982期 10.0%年化收益率”等有关收益率宣传的内容，违反了《广告法》第二十五条规定。2017年9月，上海市浦东新区市场监管局作出行政处罚，罚款60万元。 　　五、浙江台州章某发布违法广告案 　　当事人在某网站平台上发布的“帝皇强肾汤”“御舒丹”广告用语涉嫌宣传治疗功能，涉案产品包装上含有的多项内容均为虚假，涉嫌犯罪。2017年11月，台州市黄岩区市场监管局已将该案移交公安部门调查处理。 　　六、安徽省长天资产管理有限公司发布违法广告案 　　当事人通过自设网站及微信公众号发布的广告内容与事实不符，含有明示或者暗示保本、无风险或者保收益的内容，违反了《广告法》第二十五条等规定。2017年10月，合肥市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款72.83万元。 　　七、福建省莆商贷互联网金融服务有限公司发布违法广告案 　　当事人在其公司网站及经营场所发布金融广告，广告中含有虚假内容，并对未来收益作出保证性承诺，没有</span><img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190513/1557677225547081968.png\" title=\"1557677225547081968.png\" alt=\"03.png\"/></p>',NULL,NULL,NULL,NULL,NULL,1,0),('4479f0a1a6e04eaeaa3acaf106fd55d8','澳大利亚的NND公司签订长期供应合同',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:39:52','<p><span style=\"color: rgb(88, 102, 110); font-family: &quot;Microsoft YaHei&quot;, Helvetica; font-size: 14px; background-color: rgb(255, 255, 255);\">在经过了近5年的磨合，NND公司完全认可了我集团的产品，于前日与张胜阳副总签订了长期合同。该合同中声明，NND公司对于此产品仅从我集团采购。</span></p>',NULL,NULL,NULL,NULL,NULL,1,0),('505536d82f914eeb85b002dbe2699f66','跟着总书记去植树',42,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:26:36','<p style=\"margin-top: 28px; margin-bottom: 28px; padding: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 1.75em; font-family: Arial, &quot;microsoft yahei&quot;; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\">春暖花开，又到了植树的好季节。跟往年一样，习近平总书记又跟大伙一起来植树啦。</p><p style=\"margin-top: 28px; margin-bottom: 28px; padding: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 1.75em; font-family: Arial, &quot;microsoft yahei&quot;; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\">　　昨天（8日）上午，习近平总书记来到北京城市副中心绿心城市森林公园，同首都群众一起参加义务植树活动。</p><p style=\"margin-top: 28px; margin-bottom: 28px; padding: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 1.75em; font-family: Arial, &quot;microsoft yahei&quot;; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\">　　细细算来，自2013年以来，习近平总书记每年都参与首都义务植树活动。七年里，他种下了白皮松、银杏、榆叶梅、红瑞木等13种树木，都是北方常见的树种。</p><p style=\"margin-top: 28px; margin-bottom: 28px; padding: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 1.75em; font-family: Arial, &quot;microsoft yahei&quot;; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\">　　和总书记一起植树的孩子现在也都长大了，还有当年一起参加义务植树的首都各界群众，大家回忆起当年的事，总书记说过的话，都还历历在目。</p><p style=\"margin-top: 28px; margin-bottom: 28px; padding: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 1.75em; font-family: Arial, &quot;microsoft yahei&quot;; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\">　　今年是新中国植树节设立40周年。40年来，我国人工造林的面积增长了一倍，人工林面积居全球第一。总书记说，我们期望蓝天、白云、洁净的水、新鲜的空气，这些都是生态建设，生态建设绿化是很重要的，我们还要一年接着一年、一代接着一代地干。</p><p style=\"margin-top: 28px; margin-bottom: 28px; padding: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 1.75em; font-family: Arial, &quot;microsoft yahei&quot;; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\">　　就让我们跟上总书记的步伐行动起来，植绿护绿，从我做起！</p><p style=\"margin-top: 28px; margin-bottom: 28px; padding: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 1.75em; font-family: Arial, &quot;microsoft yahei&quot;; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\">　　（央视记者 申勇 史伟 邢彬 王鹏飞 彭汉明 陈曦 覃思 钱子琦 蔡跃升）</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,1,1),('52657d036bf84df893de774bd5255948','测试部署',33,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-05-17 16:40:34','<p>测试项目部署<img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190517/1558082427436005537.png\" title=\"1558082427436005537.png\" alt=\"02.png\"/></p>','upload/record/','application/octet-stream','26344ba793934153820ba9aea35ac3df.sql','oqss.sql',NULL,1,0),('5475b3671cb44159b68788bf707a3dd6','元旦放假通知',43,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 15:26:29','<p>各位同事： 感谢大家一直以来为公司做出的贡献，元旦将至，根据《国务院办公厅关于2018年部分节假日安排的通知》，结合本公司的实际情况，元旦节放假具体安排如下： 一、放假时间：2017年12月30日至2018年1月1日放假调休，共3天。1月2日上班。 二、注意事项：&nbsp;&nbsp; 2、请假的员工请提前安排好工作，并做好工作交接；&nbsp;&nbsp; 3、请各部门负责人提前组织好放假前安全检查，并做好防火、防盗排查；&nbsp;&nbsp; 4、请各位伙伴保持手机通讯畅通，如有任何紧急情况，请随时联系各部门负责人；&nbsp;</p>','upload\\record\\','text/html','9d28af9a96e245a5b0ae4ba93a83dbf6.html','index.html',NULL,1,1),('59b3584911934728ab71f6db882159f6','测试下载',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 21:19:04','<p>测试附件下载</p>','upload\\record\\','text/html','456417240e6540999b3d3a25510eb33c.html','index.html',NULL,1,1),('74e05d7a28f24acc8964390de6a173f9','新办公大楼的内部装修开始动工',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:05:31','<p><span style=\"color: rgb(88, 102, 110); font-family: &quot;Microsoft YaHei&quot;, Helvetica; font-size: 14px; background-color: rgb(255, 255, 255);\">金信人最为关注的新办公大楼于今日起开始进行内部装修。为了给大家一个良好的办公环境，装修全部材料均采用环保产品，并突出了高科技性，每间办公室均配备了网络及电话设施。为了保障安全性，对于办公区域均采用门卡制度。</span></p>',NULL,NULL,NULL,NULL,NULL,1,0),('81be3a890f3a46299c5a8b92a5621577','牢牢把握高质量发展这个根本要求（社论）',33,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:40:24','<p><span style=\"color: rgb(88, 102, 110); font-family: &quot;Microsoft YaHei&quot;, Helvetica; font-size: 14px; background-color: rgb(255, 255, 255);\">刚刚闭幕的中央经济工作会议，是党的十九大后党中央召开的第一个全国性会议，会议认真总结党的十八大以来我国经济发展历程，明确了以新发展理念为主要内容的习近平新时代中国特色社会主义经济思想，全面部署明年经济工作，对于我们统一思想、深化认识，打好决胜全面建成小康社会三大攻坚战，推动我国经济高质量发展，具有十分重大的意义。 　　党的十八大以来，以习近平同志为核心的党中央准确把握复杂局势，科学判断，正确决策，真抓实干，我国经济发展取得了历史性成就、发生了历史性变革。明年是贯彻党的十九大精神的开局之年，是改革开放40周年，是决胜全面建成小康社会、实施“十三五”规划承上启下的关键一年，经济工作要适应新时代、聚焦新目标、落实新部署，为2020年全面建成小康社会打下更坚实的物质基础，必须全面贯彻党的十九大精神，以习近平新时代中国特色社会主义思想为指导，加强党对经济工作的领导，坚持稳中求进工作总基调，坚持新发展理念，紧扣我国社会主要矛盾变化，按照高质量发展的要求，统筹推进“五位一体”总体布局和协调推进“四个全面”战略布局。 　　中国特色社会主义进入了新时代，我国经济发展也进入了新时代，我国经济已由高速增长阶段转向高质量发展阶段。高质量发展，就是能够很好满足人民日益增长的美好生活需要的发展，是体现新发展理念的发展，是创新成为第一动力、协调成为内生特点、绿色成为普遍形态、开放成为必由之路、共享成为根本目的的发展。推动高质量发展，就要建设现代化经济体系，这是我国发展的战略目标。实现这一战略目标，必须牢牢把握高质量发展的要求，坚持质量第一、效益优先；牢牢把握工作主线，坚定推进供给侧结构性改革；牢牢把握基本路径，推动质量变革、效率变革、动力变革；牢牢把握着力点，加快建设实体经济、科技创新、现代金融、人力资源协同发展的产业体系；牢牢把握制度保障，构建市场机制有效、微观主体有活力、宏观调控有度的经济体制。 　　推动高质量发展，首先要学懂弄通并贯彻好习近平新时代中国特色社会主义经济思想。要坚持加强党对经济工作的集中统一领导，坚持以人民为中心的发展思想，坚持适应把握引领经济发展新常态，坚持使市场在资源配置中起决定性作用，更好发挥政府作用，坚持适应我国经济发展主要矛盾变化完善宏观调控，坚持问题导向部署经济发展新战略，坚持正确工作策略和方法。 　　推动高质量发展，要坚持稳中求进工作总基调，该稳的要稳住，该进的要进取，把握好工作节奏和力度。要统筹各项政策，加强政策协同，积极的财政政策取向不变，稳健的货币政策要保持中性，结构性政策要发挥更大作用，社会政策要注重解决突出民生问题，改革开放要加大力度。 　　推动高质量发展，要重点抓好决胜全面建成小康社会三大攻坚战。打好防范化解重大风险攻坚战，重点是防控金融风险，要使宏观杠杆率得到有效控制，金融服务实体经济能力明显增强，系统性风险得到有效防控。打好精准脱贫攻坚战，要瞄准特定贫困群众精准帮扶，向深度贫困地区聚焦发力，激发贫困人口内生脱贫动力，巩固扶贫成果，提高脱贫质量。打好污染防治攻坚战，要下更大决心、采取更有力措施，加大污染防治力度，使主要污染物排放总量大幅减少，生态环境质量总体改善，重点是打赢蓝天保卫战。 　　推动高质量发展，要着力抓好明年的重点工作。要深化供给侧结构性改革，激发各类市场主体活力，实施乡村振兴战略，实施区域协调发展战略，推动形成全面开放新格局，提高保障和改善民生水平，加快建立多主体供应、多渠道保障、租购并举的住房制度，加快推进生态文明建设。 　　推动高质量发展，要坚持和加强党对经济工作的领导。要增强“四个意识”，坚决反对经济工作中的分散主义、自由主义、本位主义、山头主义、地方保护主义，防止不切实际地定目标，更不能搞选择性执行。各级领导干部要加强学习和实践，培养专业能力，弘扬专业精神，既要当好领导，又要成为专家，不断提高适应新时代、实现新目标、落实新部署的能力，不断增强推动高质量发展和建设现代化经济体系的本领。 　　一分部署、九分落实。做好明年经济工作，任务繁重、责任重大，让我们更加紧密地团结在以习近平同志为核心的党中央周围，全面贯彻党的十九大精神，不折不扣把这次会议的部署落实到位，锐意进取、埋头苦干，扎扎实实做好各项工作，确保明年经济工作开好局、起好步。</span></p>',NULL,NULL,NULL,NULL,NULL,1,0),('895913feb99b4673803add5605d727de','测试消息发布',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 15:25:45','<p>各位同事： 感谢大家一直以来为公司做出的贡献，元旦将至，根据《国务院办公厅关于2018年部分节假日安排的通知》，结合本公司的实际情况，元旦节放假具体安排如下： 一、放假时间：2017年12月30日至2018年1月1日放假调休，共3天。1月2日上班。 二、注意事项：&nbsp;&nbsp; 2、请假的员工请提前安排好工作，并做好工作交接；&nbsp;&nbsp; 3、请各部门负责人提前组织好放假前安全检查，并做好防火、防盗排查；&nbsp;&nbsp; 4、请各位伙伴保持手机通讯畅通，如有任何紧急情况，请随时联系各部门负责人；&nbsp;&nbsp; 5、需要外出的员工请注意安全防护，避免意外事故的发生，确保度过一个平安愉快的假期。 预祝各位伙伴元旦节快乐！&nbsp;&nbsp; 北京金信集团.人力资源部</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,1,1),('91caffd49714414388fc8c56d98bc165','测试1',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:51:41','<p>测试</p>',NULL,NULL,NULL,NULL,NULL,1,1),('9be1a1b8c097416ebd60a6d3f5de29e7','测试通知',33,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-05-16 11:28:19','<p>舒服撒<img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190516/1557977283242072608.png\" title=\"1557977283242072608.png\" alt=\"07.png\"/></p>','upload/record/','image/png','bb0f0543c5ef49f5b80a7aa8240112b5.png','02.png',NULL,1,0),('a7a3504c5783498bb5027d1a239aba09','工商总局公布2017年第三批虚假违法广告典型案例',33,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:04:45','<p>据国家工商总局网站消息，国家工商总局今天公布了近期查处的部分虚假违法广告典型案例，北京创客互动科技有限公司发布违法广告案、双鸭山广播电视台发布违法广告案等15个案例曝光。 　　一、北京创客互动科技有限公司发布违法广告案 　　当事人利用微信公众号发布的广告内容中含有违背社会良好风尚内容，违反了《广告法》第九条规定。2017年7月，北京市工商局朝阳分局作出行政处罚，责令当事人停止发布违法广告，罚没款合计20.3万元。 　　二、双鸭山广播电视台发布违法广告案 　　当事人在所属新闻综合广播、交通广播频率发布“百合康越橘叶黄素软胶囊”“本元首脑胶囊”等10个产品违法广告，当事人未健全广告承接登记、审核管理制度，未认真履行广告审查义务，以健康讲座形式变相发布广告，对药品的功效、治愈率、有效率、安全性做出保证性承诺，对商品的功能、用途、成分进行虚假宣传，欺骗、误导消费者，违反了《广告法》第十六条、第十九条、第二十八条等规定。2017年11月，双鸭山市市场监督管理局作出行政处罚，责令当事人停止发布违法广告，罚款88万元。 　　三、上海华与华营销咨询有限公司设计违法广告案 　　当事人为华夏幸福基业股份有限公司在动车组列车展牌媒体及航机杂志上设计广告。广告中使用的中华人民共和国地图未将国界线完整、准确的表示，损害了国家尊严及利益。且当事人在以后的相关广告设计中，在已知其广告地图绘制错误的情况下，仍未将我国领土表示完整、准确，客观上持续了违法行为，放任了危害后果的继续发生，违反了《广告法》第九条规定。2017年11月，上海市静安区市场监管局作出行政处罚，没收广告费用8.8万元，罚款100万元。 　　四、上海证大金融信息服务有限公司发布违法广告案 　　当事人利用“捞财宝APP”和捞财宝官网，宣传“新手专享96982期 10.0%年化收益率”等有关收益率宣传的内容，违反了《广告法》第二十五条规定。2017年9月，上海市浦东新区市场监管局作出行政处罚，罚款60万元。 　　五、浙江台州章某发布违法广告案 　　当事人在某网站平台上发布的“帝皇强肾汤”“御舒丹”广告用语涉嫌宣传治疗功能，涉案产品包装上含有的多项内容均为虚假，涉嫌犯罪。2017年11月，台州市黄岩区市场监管局已将该案移交公安部门调查处理。 　　六、安徽省长天资产管理有限公司发布违法广告案 　　当事人通过自设网站及微信公众号发布的广告内容与事实不符，含有明示或者暗示保本、无风险或者保收益的内容，违反了《广告法》第二十五条等规定。2017年10月，合肥市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款72.83万元。 　　七、福建省莆商贷互联网金融服务有限公司发布违法广告案 　　当事人在其公司网站及经营场所发布金融广告，广告中含有虚假内容，并对未来收益作出保证性承诺，没有对可能存在的风险以及风险责任承担有合理提示或者警示，违反了《广告法》第二十五条等规定。2017年10月，莆田市城厢区工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款30万元。 　　八、威海市广播电视台发布违法保健食品广告案 　　当事人在所属频道发布“红阳盐藻”“千菌方”“爱体养心口服液”“阳气肽”保健食品广告，广告中利用专家、患者的名义和形象作证明，含有表示功效、安全性的断言或者保证，并利用健康讲座形式变相发布保健食品广告，违反了《广告法》第十六条等规定。2017年8月，威海市工商局作出行政处罚，罚没款合计78.8万余元。 　　九、利川市长江医院发布违法医疗广告案 　　当事人未经医疗广告审查机关审查，利用宣传册和户外广告对其医疗服务进行宣传，广告内容含有表示功效、安全性的断言或者保证，违反了《广告法》第十六条等规定。2017年7月，利川市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款22万元。 　　十、广州市南珠医疗美容门诊有限公司发布违法广告案 　　当事人为推销其经营的医疗美容服务，通过官方网站、微信公众号及张贴宣传画板等形式发布广告对外进行宣传。广告含有与事实不符或者缺乏事实依据、容易误导消费者的虚假内容，违反了《广告法》第二十八条等规定。2017年10月，广州市海珠区市场和质量监督管理局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款95万元。 　　十一、南宁协和医院有限责任公司发布违法广告案 　　当事人以虚假荣誉证书授予的称号发布医疗广告，欺骗、误导消费者，违反了《广告法》第二十八条规定。2017年11月，玉林市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款20万元。 　　十二、海南东方明珠房地产有限公司发布违法广告案 　　当事人在广告宣传中以项目距离机场所需时间表示项目位置，将“产权式酒店”宣传为普通“高层住宅区”，误导消费者，违反了《广告法》第二十六条等规定。2017年7月，海南省海口市工商局作出行政处罚，责令当事人停止发布违法广告，在相应范围内消除影响，罚款113万元。 　　十三、云南广播电视台发布违法医疗器械广告案 　　当事人与郑州康金瑞健康产业有限公司签订广告发布合同，在云南卫视频道发布“糖御医牌远红外贴”广告，该广告未按广告审查批准内容播出，含有表示功效、安全性的断言或者保证，出现了专家、患者名义作证明等内容，违反了《广告法》第十六条等规定。2017年9月，云南省工商局分别对云南广播电视台、广告主郑州康金瑞健康产业有限公司作出行政处罚，罚没款合计21.06万元。 　　十四、甘肃省广播电影电视总台(集团)发布违法广告案 　　当事人利用甘肃卫视频道发布“劵钞版《清明上河图大邮票》”广告，广告含有明示或者暗示保本、无风险或者保收益等内容，违反了《广告法》第二十五条规定。2017年9月，甘肃省工商局作出行政处罚，责令当事人停止发布违法广告，罚没款合计61.42万元。 　　十五、新疆电视台发布违法食品、保健食品广告案 　　当事人发布“老院长祛斑方”“藏宝保健滋补液”等食品、保健品广告，广告中含有涉及疾病治疗功能、医疗用语等内容，违反了《广告法》第十七条规定。2017年7月，新疆维吾尔自治区工商局作出行政处罚，责令当事人停止发布违法广告，罚款20万元。</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,1,0),('ab07b993c87749d4aaa84bf0fb7036b4','关于集体出游费用报销的规定',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:37:07','<p style=\"box-sizing: border-box; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; font-size: 14px; line-height: normal; font-family: &quot;Microsoft YaHei&quot;, Helvetica; color: rgb(88, 102, 110); white-space: normal; background-color: rgb(255, 255, 255);\">&nbsp;关于集体出游费用报销的规定&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><p style=\"box-sizing: border-box; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; font-size: 14px; line-height: normal; font-family: &quot;Microsoft YaHei&quot;, Helvetica; color: rgb(88, 102, 110); white-space: normal; background-color: rgb(255, 255, 255);\">集体出游费用30%的部分是公司鼓励销售团队开展团队活动的激励基金。为规范集体出游费用的申请和使用，结合公司财务与审计意见和建议，对集体出游费用30%部分的报销作如下规定： 1、 集体出游费用采取团队申请报销制，由分部总经理在OA系统中填报《集体出游费用报销单》流程，附件上传发票扫描件及《集体出游费用集体审批表》标明活动的事由、参与人员、活动方案等。 2、 财务规定可报销发票有：1）机票、火车票、住宿费；2 ）打车费；3）会务费；&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><p style=\"box-sizing: border-box; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; font-size: 14px; line-height: normal; font-family: &quot;Microsoft YaHei&quot;, Helvetica; color: rgb(88, 102, 110); white-space: normal; background-color: rgb(255, 255, 255);\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 行政部&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><p style=\"box-sizing: border-box; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; font-size: 14px; line-height: normal; font-family: &quot;Microsoft YaHei&quot;, Helvetica; color: rgb(88, 102, 110); white-space: normal; background-color: rgb(255, 255, 255);\">2017年12月22日</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,1,1),('ab50875383f84480967070f365d3b52c','影讯：环太平洋',41,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:27:21','<p>明天下午4点，俱乐部播放第16届上海国际电影节最佳影片：青春派。 剧情介绍 不疯狂，怎叫青春？居然（董子健 饰）在高考前拍毕业照时，当着全校师生的面，大声地用泰戈尔的诗句向暗恋了三年的黄晶晶（安悦溪 饰）表白，收获了甜蜜的初恋。但很快初恋的甜蜜就被闻讯赶来的母亲（咏梅 饰）破坏了，黄晶晶在居然母亲的刺激下傲然离去，居然伤心的想爬墙挽回初恋，却摔伤了尾骨。失恋加受伤的他高考失利，看着黄晶晶前往复旦的身影，决定复读追逐爱情。开始了一段疯狂的高三历程。&nbsp;<br/></p><p>接收人：</p><p>管理员;艾雪;陈小小;高凌;高伟;黄山;姜程;金万里;李国天;林琳;刘东;刘丰;刘刚;刘娟;刘晓宇;李晓红;李玉友;娄军;马天成;潘鹏;潘阳;孙富贵;孙楠;孙悦;系统管理员;田宇;普通用户;王大勇;王刚;王浩;王锦;王明;王萍;王强;王涛;王伟;王英;夏帆;肖鹏飞;薛爱荷;扬帆;杨新颖;于学军;张胜阳;张秀英;张振东;赵华威;郑和;周天</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,0,1),('c7e9f915e1474b16a493a13ee8d360b4','测试添加到中间表',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:34:07','<p><img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190410/1554867238010042505.jpg\" title=\"1554867238010042505.jpg\" alt=\"10.jpg\" width=\"216\" height=\"120\"/></p>','upload\\record\\','image/jpeg','0ee03ce502634ffb9158d1d0699fdbaf.jpg','10.jpg',NULL,0,1),('cf5ad9824c854e0d93b5c8897d114e96','测试项目重新部署',33,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-06-01 00:33:04','<p>奥德赛大大 sad&nbsp;<img src=\"http://localhost:8080/oasy/ueditor/jsp/upload/image/20190601/1559320381448073228.png\" title=\"1559320381448073228.png\" alt=\"07.png\"/>案发时 阿斯蒂芬</p>','upload/record/','image/png','c17b0d157c0546638cffa5d5f29d50fb.png','07.png',NULL,1,0),('dd1ce07931b045a5ab5e5f2764362da2','大连分公司经理内部竞聘公告',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:38:34','<p>为进一步深化公司人力资源管理竞争激励机制，实施公司内部人才发展计划，打造建设高素质的人才队伍，公司计划采用内部竞争上岗方式，于内部选聘大连分公司经理1名。 一、内部竞聘原则：注重实绩、自愿、公平、公正、竞争、择优。 二、竞聘职务及相关情况： 1、 竞聘职务：大连分公司经理（1人） 2、 职务级别：地区主管 3、 特殊福利：公司可提供首24个月于当地的住宿 4、 内部竞争上岗人员的试用期为3个月。试用期满进行考核，考核合格者按程序办理转正。考核不合格的，由公司重新安排适合岗位。 5、 工作内容：主导完成公司在大连地区的销售任务，以及相关的人员管理、市场拓展工作 三、参加竞聘人员的基本条件： 1、 公司在职工作满一年并已转正的业务代表； 2、 任业务代表期间展现出良好的市场开拓及管理能力，业绩良好； 3、 于公司有较强的归属感和认同感； 四、内部竞聘工作程序： 1、 符合竞聘条件者自愿报名或由其主管提名，将个人申请、主管领导推荐交予人事部。 2、 人事部对报名人员进行资格审核，结合主管领导推荐意见，择优确定面试人选。 3、 营销事业部副总和总经理亲自安排面试，择优确定聘任人选。 4、 公司发出聘任通知、修改聘用合同相关条件。 5、 备注：（1）个人申请内容：介绍自己的基本情况、任职优势和任职后的工作设想。 （2）报名截止时间： 2018年1月10日</p><p>接收人：</p><p>管理员;艾雪;陈小小;高凌;高伟;黄山;姜程;金万里;李国天;林琳;刘东;刘丰;刘刚;刘娟;刘晓宇;李晓红;李玉友;娄军;马天成;潘鹏;潘阳;孙富贵;孙楠;孙悦;系统管理员;田宇;普通用户;王大勇;王刚;王浩;王锦;王明;王萍;王强;王涛;王伟;王英;夏帆;肖鹏飞;薛爱荷;扬帆;杨新颖;于学军;张胜阳;张秀英;张振东;赵华威;郑和;周天</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,1,1),('e64158e7a68e4b6085aaefc4c8e3eac2','董事会参观新办公楼的施工情况',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:18:27','<p>在李总的带领下，董事会全体成员于今日下午参观了新的办公大楼的施工现场。听取并查看了施工进度情况。在施工现场，赵董一再强调，在保障进度的同时，一定要保障工人们的安全，要做好安全教育及安全检查。不要把安全只挂在嘴上，要记在心上，随时注意。今年夏天比往年热，要注意不要让工人们中暑，后勤部门要提供降温饮品。</p><p>接收人：</p><p>管理员;艾雪;陈小小;高凌;高伟;黄山;姜程;金万里;李国天;林琳;刘东;刘丰;刘刚;刘娟;刘晓宇;李晓红;李玉友;娄军;马天成;潘鹏;潘阳;孙富贵;孙楠;孙悦;系统管理员;田宇;普通用户;王大勇;王刚;王浩;王锦;王明;王萍;王强;王涛;王伟;王英;夏帆;肖鹏飞;薛爱荷;扬帆;杨新颖;于学军;张胜阳;张秀英;张振东;赵华威;郑和;周天</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,0,0),('e9b7686eb15f4e75b7a58b6dcf0e3313','董事会参观新办公楼的施工情况',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:39:18','<p>在李总的带领下，董事会全体成员于今日下午参观了新的办公大楼的施工现场。听取并查看了施工进度情况。在施工现场，赵董一再强调，在保障进度的同时，一定要保障工人们的安全，要做好安全教育及安全检查。不要把安全只挂在嘴上，要记在心上，随时注意。今年夏天比往年热，要注意不要让工人们中暑，后勤部门要提供降温饮品。</p><p>接收人：</p><p>管理员;艾雪;陈小小;高凌;高伟;黄山;姜程;金万里;李国天;林琳;刘东;刘丰;刘刚;刘娟;刘晓宇;李晓红;李玉友;娄军;马天成;潘鹏;潘阳;孙富贵;孙楠;孙悦;系统管理员;田宇;普通用户;王大勇;王刚;王浩;王锦;王明;王萍;王强;王涛;王伟;王英;夏帆;肖鹏飞;薛爱荷;扬帆;杨新颖;于学军;张胜阳;张秀英;张振东;赵华威;郑和;周天</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,0,0),('e9c29912d5524cacb91a8512b8bb3ec6','首批产品生产成功',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-10 11:40:51','<p>首批产品在多次测试后，经专业部门鉴定，符合国际标准，允许投放市场。</p><p>接收人：</p><p>管理员;艾雪;陈小小;高凌;高伟;黄山;姜程;金万里;李国天;林琳;刘东;刘丰;刘刚;刘娟;刘晓宇;李晓红;李玉友;娄军;马天成;潘鹏;潘阳;孙富贵;孙楠;孙悦;系统管理员;田宇;普通用户;王大勇;王刚;王浩;王锦;王明;王萍;王强;王涛;王伟;王英;夏帆;肖鹏飞;薛爱荷;扬帆;杨新颖;于学军;张胜阳;张秀英;张振东;赵华威;郑和;周天</p><p><br/></p>',NULL,NULL,NULL,NULL,NULL,1,0),('f29eb94b53364a318a0b6a43a771aaad','测试主页面下载',40,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-05-15 19:49:36','<p>测试在主页面下载</p>','upload/record/','image/png','4aac94b08b674d81b4a8fc75825e8bbb.png','07.png',NULL,1,1),('f31911a2576f4a26a2bf766e56669657','新网',34,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-05-27 11:39:42','<p><span style=\"color: rgb(51, 51, 51); font-family: Helvetica, Arial, Tahoma, &quot;Microsoft Yahei&quot;, 宋体, sans-serif; font-size: 15px; background-color: rgb(242, 242, 242);\">新网—25年互联网基础服务运营经验.一站式网络营销平台,高效便捷！新网提供域名注册、云虚拟主机、驰云服务器、企业邮箱、云主机、服务器租用托管等网络服务.</span><img src=\"https://ss0.bdstatic.com/-0U0bnSm1A5BphGlnYG/tam-ogel/7b356addf9be6de37412d089fe7afa47_222_222.jpg\" width=\"183\" height=\"126\"/></p>','upload/record/','application/vnd.visio','7a6abe4b9f664af2a46ff0698d4ad33d.vsd','hxq.vsd',NULL,1,0),('f7363fbf030f40e7ad8dfd60ea1ffdea','今天晚上有大风警报，请大家做好防护。',43,'786a3701b1ef47fc9eb1f694c081c27d','李懂','2019-04-09 18:28:03','<p><span style=\"color: rgb(88, 102, 110); font-family: &quot;Microsoft YaHei&quot;, Helvetica; font-size: 14px; background-color: rgb(255, 255, 255);\">今晚本市西北部地区将出现雷阵雨天气，之后自西北向东南逐渐影响到全市。此次降雨可能会伴有7至9级阵风或冰雹。&nbsp;</span></p>',NULL,NULL,NULL,NULL,NULL,1,1);

/*Table structure for table `notice_staff` */

DROP TABLE IF EXISTS `notice_staff`;

CREATE TABLE `notice_staff` (
  `nc_id` varchar(32) NOT NULL,
  `staff_id` varchar(32) DEFAULT NULL,
  `notice_id` varchar(32) DEFAULT NULL,
  `is_read` tinyint(2) DEFAULT '0' COMMENT '是否已读',
  `mark` tinyint(2) DEFAULT '0' COMMENT '文件标记',
  `data_status` tinyint(2) DEFAULT '1' COMMENT '删除',
  PRIMARY KEY (`nc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `notice_staff` */

insert  into `notice_staff`(`nc_id`,`staff_id`,`notice_id`,`is_read`,`mark`,`data_status`) values ('00839d9625354e6ca919f0470f48c2f4','4fdbfa42577d4d83bc84899f315f015c','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('01cb872b5e654f8f8a0fc70cee3d1fc6','1757d5379b114c20b2cf7612a1641bfb','81be3a890f3a46299c5a8b92a5621577',0,0,1),('03fb19baf678490eb6690b562262984f','1757d5379b114c20b2cf7612a1641bfb','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('04b124a91e6746d8877dd12cc39bfa50','e5c0c7c54eca49b9bdba6234dbacf4b5','91caffd49714414388fc8c56d98bc165',0,0,1),('05f51b921e064ff8a9abbc3bce8f9875','1757d5379b114c20b2cf7612a1641bfb','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('06f53052b2c84a269a495fc61e831d63','a10adf63aa954813b237fca50b182573','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('07438dae6ae746b2a526b8804d5cc6ff','1757d5379b114c20b2cf7612a1641bfb','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('0b1f89394209461197af5cf1d135dc5b','ddc78c6a59d5426cbca1723e6c5f82f9','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('0ec0a5bbce6b41c6904707769baaa937','1757d5379b114c20b2cf7612a1641bfb','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('1041a95025ff4258a699b2a4e20c8202','52d8affc5ed44f3f93a67d8200d3c5f6','81be3a890f3a46299c5a8b92a5621577',0,0,1),('11c2877c61764fe2a7b5c5e83c42dc02','06916c6860e5486faf8d56044f202147','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('124fbe8497fe461eb87c28cfcada02a2','52d8affc5ed44f3f93a67d8200d3c5f6','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('129420dc85d14c49af3658044c519954','a10adf63aa954813b237fca50b182573','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('13251ff4c91b4b55ae16e98f84fda4f0','4fdbfa42577d4d83bc84899f315f015c','81be3a890f3a46299c5a8b92a5621577',0,0,1),('1f15de1b166d469595dbab46db65eaa2','ddc78c6a59d5426cbca1723e6c5f82f9','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('22eaa1553f1e4c54881fa5021d733ca3','6703f7b2134e46418062b688a38b1b37','81be3a890f3a46299c5a8b92a5621577',0,0,1),('253e3f99b19843da88173c25bd471d82','786a3701b1ef47fc9eb1f694c081c27d','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('280723ce1caa4a508edb261bd2432aa9','6703f7b2134e46418062b688a38b1b37','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('2e674d6760fa451eac0ab2d0996e01c5','786a3701b1ef47fc9eb1f694c081c27d','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('2f2157a47d1e445888f58a31ec2dab92','6703f7b2134e46418062b688a38b1b37','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('3115f327c08749a5859e23ecbd254976','ddc78c6a59d5426cbca1723e6c5f82f9','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('3e7ed9900c954c71b9e7f07758c2eb8f','52d8affc5ed44f3f93a67d8200d3c5f6','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('409167c2ac0b47a0acee5237a0d15ce2','4fdbfa42577d4d83bc84899f315f015c','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('4eb61e4988b640fdadffbf25ecf4d087','014e60ea2b9b41d6b93dedc38d465ad8','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('50d6381a5ef443529874cdf289b66774','014e60ea2b9b41d6b93dedc38d465ad8','91caffd49714414388fc8c56d98bc165',0,0,1),('610a0d16474d43f3aac94372a2369774','6703f7b2134e46418062b688a38b1b37','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('61bc10f6b318415ea67a936b1774b361','1757d5379b114c20b2cf7612a1641bfb','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('6566d6b5479944a1b32dec8f8b1da565','014e60ea2b9b41d6b93dedc38d465ad8','81be3a890f3a46299c5a8b92a5621577',0,0,1),('66f123dcac584c3eba986b273644cc5a','a10adf63aa954813b237fca50b182573','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('67f161634aab4613a27f4bf22a0beb14','52d8affc5ed44f3f93a67d8200d3c5f6','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('6a807cac79a14a2da15f0fb77f6922b9','6703f7b2134e46418062b688a38b1b37','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('6b2538b700dd4743b50ce2c29ef79f66','06916c6860e5486faf8d56044f202147','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('6f707366ff6c43d6b4ba341faab6aaa8','06916c6860e5486faf8d56044f202147','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('6ffb437522a049e3825c89e451c271a5','52d8affc5ed44f3f93a67d8200d3c5f6','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('7192229b0789417fbd9084e0dfeec984','6703f7b2134e46418062b688a38b1b37','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('71bef9afa70940d29eb3d8922f8b515d','014e60ea2b9b41d6b93dedc38d465ad8','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('75db185aa5bd41ef9a7b0182a4fa5445','ddc78c6a59d5426cbca1723e6c5f82f9','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('772f154165db464a8bfd49134c810a5e','ddc78c6a59d5426cbca1723e6c5f82f9','91caffd49714414388fc8c56d98bc165',0,0,1),('777c556072034e28a30f27ead9fcb041','4fdbfa42577d4d83bc84899f315f015c','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('7b8d56aba938466ca59c332fd8bf1b09','014e60ea2b9b41d6b93dedc38d465ad8','b561757c1dae454ea9878b3f0dfd7e4c',0,0,1),('7d8e56ae57ac454bbff46cfd6c8b2503','a10adf63aa954813b237fca50b182573','91caffd49714414388fc8c56d98bc165',0,0,1),('7ea8520b09b644b0bde0807a3c52f02a','e5c0c7c54eca49b9bdba6234dbacf4b5','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('85149a698620491f98a7c8353669bb93','52d8affc5ed44f3f93a67d8200d3c5f6','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('864db01c97fe412bbc69696d3777146f','6703f7b2134e46418062b688a38b1b37','91caffd49714414388fc8c56d98bc165',0,0,1),('86ffbdb07e354294bcabd82bbb7cb9fe','ddc78c6a59d5426cbca1723e6c5f82f9','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('8dafc214d09c411a8fe47d0d75ac4fbf','a10adf63aa954813b237fca50b182573','81be3a890f3a46299c5a8b92a5621577',0,0,1),('93291592228b437c8de1150f169162c1','e5c0c7c54eca49b9bdba6234dbacf4b5','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('943ed99303474e78a3bd46ec5934f6c7','1757d5379b114c20b2cf7612a1641bfb','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('94844798ce5048219a84b5fe54a01af7','52d8affc5ed44f3f93a67d8200d3c5f6','91caffd49714414388fc8c56d98bc165',0,0,1),('949863dfabda49cea69da8c0fd8a74a8','e5c0c7c54eca49b9bdba6234dbacf4b5','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('967490c9d93e4b25961240f9a0c36bdb','06916c6860e5486faf8d56044f202147','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('976a00d6a620409c82ac5843bfc7b415','786a3701b1ef47fc9eb1f694c081c27d','81be3a890f3a46299c5a8b92a5621577',0,0,1),('97bbc16e3b944d1c963c4838c6f11339','786a3701b1ef47fc9eb1f694c081c27d','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('9b671e9029374d61a9a6ab9f8c33e8fb','4fdbfa42577d4d83bc84899f315f015c','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('9d8f3605977e45bda1d83f7c34168b91','014e60ea2b9b41d6b93dedc38d465ad8','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('a03a89e1afa5486fb9c836be2f830229','1757d5379b114c20b2cf7612a1641bfb','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('a252979fbb4a4262ba01c04157bce962','ddc78c6a59d5426cbca1723e6c5f82f9','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('a2eefcfb8a7e46e09f9f36a1321f35b4','786a3701b1ef47fc9eb1f694c081c27d','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('a49546a204b7451cb6d1d8658f709618','e5c0c7c54eca49b9bdba6234dbacf4b5','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('a5a74f68bb934c079e69d430b8294d3e','e5c0c7c54eca49b9bdba6234dbacf4b5','81be3a890f3a46299c5a8b92a5621577',0,0,1),('a64e600db6224d93b24be69472cc33b9','a10adf63aa954813b237fca50b182573','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('ae37d6b70c6b456b9a3ee3b824a2e829','ddc78c6a59d5426cbca1723e6c5f82f9','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('b2c8a31e6a6847d09a00be4982cd6fe7','786a3701b1ef47fc9eb1f694c081c27d','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1),('b402dbd5c5774313a1f9435eadc03799','ddc78c6a59d5426cbca1723e6c5f82f9','81be3a890f3a46299c5a8b92a5621577',0,0,1),('b751b0ef0b1a44808b9293f58a6ef5e0','4fdbfa42577d4d83bc84899f315f015c','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('b97978446c454e47a2bf2d2362b6ecef','6703f7b2134e46418062b688a38b1b37','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('bbe43700893541b9b3c14700b5ade1f5','786a3701b1ef47fc9eb1f694c081c27d','91caffd49714414388fc8c56d98bc165',0,0,1),('bdfa0b3ddf964abba1c52c54dc0e5ba9','a10adf63aa954813b237fca50b182573','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('bf95439465154a2ab7ec6a7877725e7f','014e60ea2b9b41d6b93dedc38d465ad8','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('c0237771c9e94227941506c7ffa1d432','06916c6860e5486faf8d56044f202147','81be3a890f3a46299c5a8b92a5621577',0,0,1),('c66c447f24be43a982069bcf386953d8','4fdbfa42577d4d83bc84899f315f015c','91caffd49714414388fc8c56d98bc165',0,0,1),('c6b9a6c69c29497fb0c65bc5545131e4','e5c0c7c54eca49b9bdba6234dbacf4b5','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('c6eacf67981b42dfab5a4a99f48009e7','014e60ea2b9b41d6b93dedc38d465ad8','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('d18e9c1eba4845899edf01602559ca92','e5c0c7c54eca49b9bdba6234dbacf4b5','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('d79b523e869343e2a2da1e8b0e006275','a10adf63aa954813b237fca50b182573','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('da4627d8d6d0468faf8aa02caac45a3f','786a3701b1ef47fc9eb1f694c081c27d','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('dba1019b15134f0cbe9b1fcae5c67a0a','6703f7b2134e46418062b688a38b1b37','e9b7686eb15f4e75b7a58b6dcf0e3313',0,0,1),('dc671de5c492419799b4da9fb8953896','06916c6860e5486faf8d56044f202147','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('e0df3bfbc41949b5b2663a00df40550d','06916c6860e5486faf8d56044f202147','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('e3c8a8e9e3004ba28e273cdc94199d68','4fdbfa42577d4d83bc84899f315f015c','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('e4411209aee24b6cba1f8fb84ea296ba','014e60ea2b9b41d6b93dedc38d465ad8','4479f0a1a6e04eaeaa3acaf106fd55d8',0,0,1),('e489f1bdde6e455ebe362a5a1a264fda','1757d5379b114c20b2cf7612a1641bfb','91caffd49714414388fc8c56d98bc165',0,0,1),('e62da9bdb69b4ce8b5b0aa5584bf4f7c','52d8affc5ed44f3f93a67d8200d3c5f6','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('e936e411c2a24eb6a4377ffee6ae176e','e5c0c7c54eca49b9bdba6234dbacf4b5','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('f0ed840bee9c4e04b2a40a95e5acc015','52d8affc5ed44f3f93a67d8200d3c5f6','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('f22e45420ac14d39834711cc03623994','014e60ea2b9b41d6b93dedc38d465ad8','dd1ce07931b045a5ab5e5f2764362da2',0,0,1),('f2fc70fd74fb4f36994f2fd43590f7d8','a10adf63aa954813b237fca50b182573','c7e9f915e1474b16a493a13ee8d360b4',0,0,1),('f314f7d156bb495daa2dd155c5379bc8','786a3701b1ef47fc9eb1f694c081c27d','ab07b993c87749d4aaa84bf0fb7036b4',0,0,1),('f4dabd7e43be4edd8ca01f367db39a8b','4fdbfa42577d4d83bc84899f315f015c','e9c29912d5524cacb91a8512b8bb3ec6',0,0,1),('f8b990a27e6549e98a8161e464a81525','06916c6860e5486faf8d56044f202147','91caffd49714414388fc8c56d98bc165',0,0,1),('f9d8c046c26c4e8ab31dea11dcfb5810','06916c6860e5486faf8d56044f202147','3f5e2c5e5ecc41158e7b7c93c90eefb1',0,0,1);

/*Table structure for table `office_supplies` */

DROP TABLE IF EXISTS `office_supplies`;

CREATE TABLE `office_supplies` (
  `os_id` varchar(64) NOT NULL,
  `os_name` varchar(64) DEFAULT NULL,
  `os_ord_num` varchar(64) DEFAULT NULL COMMENT '办公用品编号',
  `os_category` int(64) DEFAULT NULL COMMENT '类别',
  `os_specification` varchar(64) DEFAULT NULL COMMENT '规格',
  `os_unit` int(4) DEFAULT NULL COMMENT '单位',
  `os_price` decimal(18,2) DEFAULT '0.00' COMMENT '单价',
  `os_total` int(32) DEFAULT '0' COMMENT '总量',
  `os_not_input` int(32) DEFAULT '0' COMMENT '未入库数量',
  `os_statistical_date` varchar(64) DEFAULT NULL COMMENT '统计日期',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`os_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `office_supplies` */

insert  into `office_supplies`(`os_id`,`os_name`,`os_ord_num`,`os_category`,`os_specification`,`os_unit`,`os_price`,`os_total`,`os_not_input`,`os_statistical_date`,`data_status`) values ('0cae204006a04e2b822c67c75251d7c8','笔记本','OFF03001',44,'32K',51,'2.00',200,0,NULL,1),('2cde9736d6fe4c9aa372576aaa70a073','白板','OFF01001',44,'600*90mm',46,'5.00',100,0,NULL,1),('2e0068cda4814edeb36cd73eda5c1422','公文稿纸','OFF18004',45,'16开 70g 100页/本',51,'75.00',0,0,NULL,1),('2e8a762fb6cf4010953930015f1ffe73','粉笔','OFF04006',44,'白色',53,'5.00',0,0,NULL,1),('4bf1297af7814d82bed5c731dd2ff47e','台式圆珠笔','OFF04004',44,'',48,'2.00',0,0,NULL,1),('a6ce4e37f9b34ea580de17b65c74ebf2','硬皮笔记本','OFF03002',44,'32k',51,'4.00',150,0,NULL,1),('c459cfac2f4843228d801ced7e06f363','油画笔','OFF04001',44,'',48,'1.00',0,0,NULL,1),('c7521818c3f248c6ab39bb590491408b','传真纸','OFF18007',45,'216*30m',52,'78.00',0,0,NULL,1);

/*Table structure for table `office_supplies_pickup` */

DROP TABLE IF EXISTS `office_supplies_pickup`;

CREATE TABLE `office_supplies_pickup` (
  `osp_id` varchar(32) NOT NULL,
  `os_id` varchar(32) DEFAULT NULL COMMENT '物品ID',
  `pickup_staff_id` varchar(32) DEFAULT NULL COMMENT '领用者ID',
  `pickup_staff_name` varchar(64) DEFAULT NULL COMMENT '领用者姓名',
  `pickup_staff_depart` varchar(64) DEFAULT NULL COMMENT '领用者部门',
  `pickup_num` int(32) DEFAULT NULL COMMENT '领用数量',
  `pickup_date` varchar(64) DEFAULT NULL COMMENT '领用日期',
  `app_date` varchar(64) DEFAULT NULL COMMENT '物品利用申请日期',
  `to_app_id` varchar(32) DEFAULT NULL COMMENT '向谁申请ID',
  `others` text COMMENT '备注',
  `app_status` int(2) DEFAULT NULL COMMENT '审批中',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`osp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `office_supplies_pickup` */

insert  into `office_supplies_pickup`(`osp_id`,`os_id`,`pickup_staff_id`,`pickup_staff_name`,`pickup_staff_depart`,`pickup_num`,`pickup_date`,`app_date`,`to_app_id`,`others`,`app_status`,`data_status`) values ('042b98140fbc4d8f848d49cec2b165ed','2e8a762fb6cf4010953930015f1ffe73','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',10,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','使用',2,1),('15f553d48b0f47e5a8a9de660d56f8d7','c7521818c3f248c6ab39bb590491408b','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',10,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','复印',1,1),('204416030516489fa14a83950e6ca6f6','a6ce4e37f9b34ea580de17b65c74ebf2','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',12,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','申请',2,1),('2ddc25f3e2024bbb915db53c9f7aa4f4','a6ce4e37f9b34ea580de17b65c74ebf2','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',10,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','使用',1,1),('426886c318cd4b16ba6b75dec4526169','c7521818c3f248c6ab39bb590491408b','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',1,NULL,'2019-05-06','786a3701b1ef47fc9eb1f694c081c27d','',1,1),('5f3fddd5f35944399d3cd43811e577bc','c7521818c3f248c6ab39bb590491408b','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',1,NULL,'2019-05-06','786a3701b1ef47fc9eb1f694c081c27d','',1,1),('7a549b95dd8443ac9e9da3983062acda','4bf1297af7814d82bed5c731dd2ff47e','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',1,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','办公',1,1),('9126805a0ee146b7a40fb8192ae3c0e0','2cde9736d6fe4c9aa372576aaa70a073','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',1,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','使用',1,1),('ad41b64abe96404fba7df65bb9040324','0cae204006a04e2b822c67c75251d7c8','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',100,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','申请理由',1,1),('c79afcf4d49e4e1db77ff3f3b87780de','0cae204006a04e2b822c67c75251d7c8','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',2,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','用于记录',1,1),('edbd641a926843c99f9d490c3c79b3fc','2cde9736d6fe4c9aa372576aaa70a073','786a3701b1ef47fc9eb1f694c081c27d','李懂','综合资财部',1,NULL,'2019-04-22','786a3701b1ef47fc9eb1f694c081c27d','用于作图',1,1);

/*Table structure for table `office_supplies_purchase` */

DROP TABLE IF EXISTS `office_supplies_purchase`;

CREATE TABLE `office_supplies_purchase` (
  `osb_id` varchar(32) NOT NULL,
  `os_id` varchar(32) DEFAULT NULL COMMENT '物品ID',
  `purchaser_id` varchar(32) DEFAULT NULL COMMENT '购买者Id',
  `purchaser_name` varchar(64) DEFAULT NULL COMMENT '购买者姓名',
  `agree_purchaser_name` varchar(64) DEFAULT NULL COMMENT '同意购买者姓名',
  `agree_purchaser_id` varchar(32) DEFAULT NULL COMMENT '同意购买者ID',
  `app_purchase_num` int(32) DEFAULT '0' COMMENT '申请购买数量',
  `apply_date` varchar(32) DEFAULT NULL COMMENT '申请日期',
  `purchase_num` int(32) DEFAULT '0' COMMENT '购买数量',
  `estimated_amount` decimal(18,2) DEFAULT '0.00' COMMENT '预计金额',
  `use_money` decimal(18,2) DEFAULT '0.00' COMMENT '花费金额',
  `purchase_date` varchar(64) DEFAULT NULL COMMENT '购买日期',
  `inputer_name` varchar(64) DEFAULT NULL COMMENT '入库人姓名',
  `inputer_id` varchar(32) DEFAULT NULL COMMENT '入库人',
  `input_date` varchar(64) DEFAULT NULL COMMENT '入库时间',
  `not_input_num` int(32) DEFAULT '0' COMMENT '未入库数量',
  `purchase_status` int(2) DEFAULT '58' COMMENT '购买状态',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`osb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `office_supplies_purchase` */

insert  into `office_supplies_purchase`(`osb_id`,`os_id`,`purchaser_id`,`purchaser_name`,`agree_purchaser_name`,`agree_purchaser_id`,`app_purchase_num`,`apply_date`,`purchase_num`,`estimated_amount`,`use_money`,`purchase_date`,`inputer_name`,`inputer_id`,`input_date`,`not_input_num`,`purchase_status`,`data_status`) values ('02af735689814c7d94d7f66c123d3c09','c7521818c3f248c6ab39bb590491408b','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',0,'7800.00','0.00',NULL,NULL,NULL,NULL,0,60,1),('5b6c6daed58b4c4fb5a4cf172712f52c','4bf1297af7814d82bed5c731dd2ff47e','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',0,'200.00','0.00',NULL,NULL,NULL,NULL,0,60,1),('5c9845791a2b42579a4ffcffa3665f6d','2cde9736d6fe4c9aa372576aaa70a073','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',100,'500.00','500.00','04/06/2019',NULL,'786a3701b1ef47fc9eb1f694c081c27d','2019-04-21',0,62,1),('98581e108d5f4d6abafb72c41c086a48','2e8a762fb6cf4010953930015f1ffe73','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',0,'500.00','0.00',NULL,NULL,NULL,NULL,0,60,1),('9fd355de6cce4e2e9d07785fdc1682da','0cae204006a04e2b822c67c75251d7c8','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',200,'200.00','400.00','04/01/2019',NULL,'786a3701b1ef47fc9eb1f694c081c27d','2019-04-21',0,62,1),('cc5b0750e2a449d490819e532050a572','c459cfac2f4843228d801ced7e06f363','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',0,'100.00','0.00',NULL,NULL,NULL,NULL,0,60,1),('e0ef6ffc7f6f49d993ceced32426abd8','a6ce4e37f9b34ea580de17b65c74ebf2','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',150,'400.00','600.00','04/01/2019',NULL,'786a3701b1ef47fc9eb1f694c081c27d','2019-04-21',0,62,1),('ee94d596ea094ac489a3774fbfb48d85','2e0068cda4814edeb36cd73eda5c1422','786a3701b1ef47fc9eb1f694c081c27d','李懂','陈蓝枫','6703f7b2134e46418062b688a38b1b37',100,'2019-04-21',0,'7500.00','0.00',NULL,NULL,NULL,NULL,0,60,1);

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `posi_id` varchar(64) NOT NULL,
  `posi_name` varchar(64) DEFAULT NULL,
  `posi_content` varchar(128) DEFAULT NULL COMMENT '工作内容',
  `create_time` varchar(64) DEFAULT NULL COMMENT '创建时间',
  `close_time` varchar(64) DEFAULT NULL COMMENT '关闭时间',
  `sub_posi` varchar(64) DEFAULT NULL COMMENT '子岗位',
  `parent_posi` varchar(64) DEFAULT NULL COMMENT '父岗位',
  `data_status` tinyint(2) DEFAULT '1',
  PRIMARY KEY (`posi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `position` */

insert  into `position`(`posi_id`,`posi_name`,`posi_content`,`create_time`,`close_time`,`sub_posi`,`parent_posi`,`data_status`) values ('00a1c3cc7e2846da96ffabd21c6768e3','司机','公司','2019-04-03 15:02:33',NULL,NULL,NULL,1),('067b549ab171476285e372214889e8ee','总监','负责项目实施12','2019-04-03 15:04:27',NULL,NULL,NULL,1),('1856adf54b6445deb47e359c73ff2959','架构师','负责软件架构','2019-04-02 23:12:55',NULL,NULL,NULL,1),('1a50d21ad4a249b693f3c5ccaaad1f59','清洁工','负责公司','2019-04-03 15:04:13',NULL,NULL,NULL,1),('1c5820fca1c548439e4eb77b3d2fd263','大堂经理','接待人员','2019-04-03 15:02:03',NULL,NULL,NULL,1),('1e04ecb24fb14c7c84709be2edb1da57','采购员','采购公司物品','2019-04-05',NULL,NULL,NULL,1),('21926e42ea13444a9d72ba65ede6fd23','技术总监','负责项目技术攻关','2019-04-06',NULL,NULL,NULL,1),('35a6116c394f45b6b0c99cd9b6884d23','财务总监','管理财务','2019-04-06',NULL,NULL,NULL,1),('52997ddd6f804a40a80e65f5b371c968','程序员','开发程序','2019-04-03 15:01:10',NULL,NULL,NULL,1),('640c6eed11d44764b653351988ca51b5','运营总监','维护运行','2019-04-06',NULL,NULL,NULL,1),('6c5bbb81311b4a448e66710cf7f687e0','个人财务','管理财等','2019-04-06',NULL,NULL,NULL,1),('73c91899ba8b4ab895cc5a2e1e146cd6','总裁','管理集团','2019-04-02 23:05:16',NULL,NULL,NULL,1),('8fa5cb7ded8b4420adfabb07ee51d6f1','保安','负责公司安全等','2019-04-03 15:02:53',NULL,NULL,NULL,1),('9a393d30b0ab4736b905a71cc2cd3f09','总经理','管理公司所有业务和业务','2019-04-02 22:58:12',NULL,NULL,NULL,1),('9a999af13b84408c9ba51ba0c32982db','运维','负责公司服务器正常运行','2019-04-06',NULL,NULL,NULL,1),('b47ab95c094640f6babe4be745f49b5c','招聘专员','招聘工作人员','2019-04-03 15:01:36',NULL,NULL,NULL,1),('bd1f9b26c7c846b39efaed27ef155943','财务总监','总管财务','2019-04-06',NULL,NULL,NULL,1),('c3c5b7b9f0074d69ab1bc873127eabf4','财务','管理公司财务','2019-04-03 18:58:40',NULL,NULL,NULL,1),('cd1167dc79644af396d4209c7435715b','董事长','公司终极大boss','2019-04-03 15:03:29',NULL,NULL,NULL,1),('eda564d5c7f94ac69493cc6a52487526','实习生','实习工作','2019-04-06',NULL,NULL,NULL,1),('ef4221da2ad041798ba5c3da870c9633','秘书','帮助领导开展办公','2019-04-03 15:03:56',NULL,NULL,NULL,1),('ef72d1b7e6c64a648845de4d85c34271','美图','美图工作','2019-04-06',NULL,NULL,NULL,1),('fd58981ac42943a7b1832f0642fd8c06','人事','管理公司人员','2019-04-03 18:58:22',NULL,NULL,NULL,1);

/*Table structure for table `procedu` */

DROP TABLE IF EXISTS `procedu`;

CREATE TABLE `procedu` (
  `pr_id` int(4) NOT NULL AUTO_INCREMENT,
  `pr_type_id` int(4) DEFAULT NULL COMMENT '流程类型ID',
  `pr_name` varchar(32) DEFAULT NULL COMMENT '流程名',
  `pr_staff_id` varchar(32) DEFAULT NULL COMMENT '流程处理者',
  `pr_parent_name` varchar(64) DEFAULT NULL COMMENT '处理总名称',
  `pr_number` int(4) DEFAULT NULL COMMENT '序号ID',
  `pr_status` int(2) DEFAULT '0' COMMENT '状态',
  `data_status` int(2) DEFAULT '1',
  PRIMARY KEY (`pr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `procedu` */

insert  into `procedu`(`pr_id`,`pr_type_id`,`pr_name`,`pr_staff_id`,`pr_parent_name`,`pr_number`,`pr_status`,`data_status`) values (1,1,'提交入职申请','','入职申请',1,0,1),(2,1,'部门主管审核',NULL,'入职申请',2,0,1),(3,1,'人事部审核',NULL,'入职申请',3,0,1);

/*Table structure for table `res_staff` */

DROP TABLE IF EXISTS `res_staff`;

CREATE TABLE `res_staff` (
  `resId` int(16) DEFAULT NULL,
  `staffId` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `res_staff` */

/*Table structure for table `resources` */

DROP TABLE IF EXISTS `resources`;

CREATE TABLE `resources` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `type` varchar(120) DEFAULT NULL,
  `mark_power` int(4) DEFAULT NULL,
  `resUrl` varchar(600) DEFAULT NULL,
  `icon` varchar(300) DEFAULT NULL,
  `resKey` varchar(150) DEFAULT NULL,
  `level` int(4) DEFAULT NULL,
  `ishide` int(3) DEFAULT NULL,
  `description` varchar(600) DEFAULT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

/*Data for the table `resources` */

insert  into `resources`(`id`,`name`,`parentId`,`type`,`mark_power`,`resUrl`,`icon`,`resKey`,`level`,`ishide`,`description`) values (1,'系统管理',0,'1',1,'system','fa fa-laptop','system',1,0,'系统基础管理'),(2,'用户管理',1,'2',1,'/staff/list',NULL,'account',2,0,'用户管理'),(4,'职位管理',1,'2',1,'/position/list',NULL,'ly_resources',12,0,'职位管理'),(5,'工作任务',0,'1',2,'job','fa fa-star',NULL,NULL,NULL,NULL),(6,'我的任务',5,'2',2,'/job/getMyAll',NULL,NULL,NULL,NULL,NULL),(7,'下级任务',5,'2',2,'/job/mySubJob',NULL,NULL,NULL,NULL,NULL),(8,'全部任务',5,'2',2,'/job/getAll',NULL,NULL,NULL,NULL,NULL),(13,'部门管理',1,'2',1,'/depart/list',NULL,NULL,NULL,NULL,NULL),(18,'消息发布',0,'1',2,'nan','fa fa-envelope',NULL,NULL,NULL,NULL),(19,'新闻',18,'2',2,'/nan/getAll/?distinguish=0',NULL,NULL,NULL,NULL,NULL),(20,'通知公告',18,'2',2,'/nan/getAll/?distinguish=1',NULL,NULL,NULL,NULL,NULL),(21,'文档中心',0,'1',2,'document','fa fa-folder',NULL,NULL,NULL,NULL),(22,'知识管理',21,'2',2,'/document/list/?distinguish=0',NULL,NULL,NULL,NULL,NULL),(23,'下载中心',21,'2',2,'/document/list/?distinguish=1',NULL,NULL,NULL,NULL,NULL),(24,'办公用品',0,'1',2,'os','fa fa-print',NULL,NULL,NULL,NULL),(25,'物品维护',24,'2',2,'/osc/getOas',NULL,NULL,NULL,NULL,NULL),(29,'采购历史',24,'2',2,'/osBuy/list',NULL,NULL,NULL,NULL,NULL),(30,'采购入库',24,'2',2,'/osBuy/input',NULL,NULL,NULL,NULL,NULL),(32,'我的领用',24,'2',2,'/ospc/myList',NULL,NULL,NULL,NULL,NULL),(33,'领用审批',24,'2',2,'/ospc/getpu',NULL,NULL,NULL,NULL,NULL),(34,'会议管理',0,'1',2,'conference','fa fa-group',NULL,NULL,NULL,NULL),(37,'我的会议',34,'2',2,'/conference/myList',NULL,NULL,NULL,NULL,NULL),(38,'会议纪要',34,'2',2,'/conference/record',NULL,NULL,NULL,NULL,NULL),(39,'会议审批',34,'2',2,'/conference/myDeal',NULL,NULL,NULL,NULL,NULL),(40,'档案中心',0,'1',2,'file','fa fa-file',NULL,NULL,NULL,NULL),(41,'档案浏览',40,'2',2,'/file/list/?distinguish=2',NULL,NULL,NULL,NULL,NULL),(42,'借阅历史',40,'2',2,'/fbc/list',NULL,NULL,NULL,NULL,NULL),(43,'我的借阅',40,'2',2,'/fbc/myList',NULL,NULL,NULL,NULL,NULL),(45,'车辆管理',0,'1',2,'car','fa fa-fighter-jet',NULL,NULL,NULL,NULL),(46,'车辆列表',45,'2',2,'/car/list',NULL,NULL,NULL,NULL,NULL),(47,'我的用车',45,'2',2,'/car/myList',NULL,NULL,NULL,NULL,NULL),(48,'用车审批',45,'2',2,'/car/toDeal',NULL,NULL,NULL,NULL,NULL),(51,'考勤',0,'1',2,'attence','fa fa-calendar-o',NULL,NULL,NULL,NULL),(52,'考勤记录',51,'2',2,'/attence/record',NULL,NULL,NULL,NULL,NULL),(53,'出勤统计',51,'2',2,'/attence/list',NULL,NULL,NULL,NULL,NULL),(54,'考勤管理',51,'2',2,'/attence/deal',NULL,NULL,NULL,NULL,NULL),(55,'审批流转',0,'1',2,'approval','fa fa-tasks',NULL,NULL,NULL,NULL),(56,'起草审批',55,'2',2,'/approval/menu',NULL,NULL,NULL,NULL,NULL),(57,'我的申请',55,'2',2,'/approval/mylist',NULL,NULL,NULL,NULL,NULL),(58,'待我审批',55,'2',2,'/approval/mydeal',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staff_id` varchar(64) NOT NULL,
  `staff_name` varchar(64) DEFAULT NULL,
  `staff_acc_num` varchar(64) DEFAULT NULL COMMENT '系统登录账号（工号）',
  `staff_gender` int(4) DEFAULT NULL,
  `staff_birthday` varchar(64) DEFAULT NULL,
  `staff_address` varchar(64) DEFAULT NULL,
  `staff_age` int(4) DEFAULT NULL,
  `staff_depart` varchar(64) DEFAULT NULL COMMENT '所属部门',
  `staff_posi` varchar(64) DEFAULT NULL COMMENT '职位',
  `staff_sal` decimal(18,2) DEFAULT NULL,
  `staff_status` int(4) DEFAULT NULL COMMENT '离职、在职',
  `staff_hiredate` varchar(64) DEFAULT NULL COMMENT '入职日期',
  `staff_leavedate` varchar(64) DEFAULT NULL COMMENT '离职日期',
  `staff_tel` varchar(32) DEFAULT NULL COMMENT '电话号码',
  `stMail` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `staff_other` text COMMENT '备注',
  `staff_grade` int(4) DEFAULT NULL COMMENT '人员等级',
  `staff_pass` varchar(64) DEFAULT NULL COMMENT '账号密码',
  `staff_img_name` varchar(64) DEFAULT NULL COMMENT '员工头像名',
  `staff_img_real_name` varchar(126) DEFAULT NULL COMMENT '员工真实头像名',
  `staff_img_path` varchar(126) DEFAULT NULL COMMENT '头像路径',
  `staff_img_img_type` varchar(64) DEFAULT NULL COMMENT '头像类型',
  `create_date` varchar(64) DEFAULT NULL COMMENT '记录创建时间',
  `mark_power` int(4) DEFAULT NULL COMMENT '权限等级',
  `data_status` tinyint(2) DEFAULT '1',
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`staff_id`,`staff_name`,`staff_acc_num`,`staff_gender`,`staff_birthday`,`staff_address`,`staff_age`,`staff_depart`,`staff_posi`,`staff_sal`,`staff_status`,`staff_hiredate`,`staff_leavedate`,`staff_tel`,`stMail`,`staff_other`,`staff_grade`,`staff_pass`,`staff_img_name`,`staff_img_real_name`,`staff_img_path`,`staff_img_img_type`,`create_date`,`mark_power`,`data_status`) values ('014e60ea2b9b41d6b93dedc38d465ad8','李思成','F00005',14,'2019-04-27','北京',45,'773b96b2320948048d8a1fa71e74dc51','52997ddd6f804a40a80e65f5b371c968','20000.00',16,'2019-04-30','','15082385555','5289999@qq.com','<p>安达市多阿达dadA 阿达</p>',12,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-05',2,1),('06916c6860e5486faf8d56044f202147','陈栏','F30000',14,'2019-04-13','深圳市',23,'95a67a8fc4ca4bfbae2d15d9d0074707','eda564d5c7f94ac69493cc6a52487526','4001.00',16,'2019-04-02','','15082384988','52999@qq.com','<p>dasd</p>',13,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-06',2,1),('1757d5379b114c20b2cf7612a1641bfb','李成','F00010',14,'2019-04-05','四川',25,'e839f40fb3d04778afe0c28e686ba862','21926e42ea13444a9d72ba65ede6fd23','12000.00',16,'2019-04-03','','15082385555','52666@qq.com','<p>adsd&nbsp;<img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190406/1554543310013026444.jpg\" title=\"1554543310013026444.jpg\" alt=\"header.jpg\"/></p>',8,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-06',2,1),('4fdbfa42577d4d83bc84899f315f015c','张纤','F00002',14,'1989-12-31','成都市',33,'e839f40fb3d04778afe0c28e686ba862','067b549ab171476285e372214889e8ee','14000.00',16,'2019-04-02','','15082384980','528990000@qq.com','<p>测试数据是多少大声道</p>',12,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-04',2,1),('52d8affc5ed44f3f93a67d8200d3c5f6','李成宇','F00004',14,'2019-04-06','浙江省',23,'fdb2905cdc624d6d943222af7f43dbc7','b47ab95c094640f6babe4be745f49b5c','2300.00',16,'2019-04-04','','15082382222','2589922@qq.com','<p>发放到沙发上</p>',11,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-05',2,1),('6703f7b2134e46418062b688a38b1b37','陈蓝枫','F20000',15,'2019-04-12','成都市',26,'c6c48e4200e648ea838e6ab61f347578','640c6eed11d44764b653351988ca51b5','12000.00',16,'2019-04-10','','13512345678','5289900@qq.com','<table><tbody><tr class=\"firstRow\"><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td></tr><tr><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\" style=\"word-break: break-all;\">阿达</td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td></tr><tr><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td></tr><tr><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\"><br/></td><td width=\"111\" valign=\"top\" style=\"word-break: break-all;\"><br/></td></tr></tbody></table><p>adasddasdas&nbsp; &nbsp;<br/></p>',12,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-06',2,1),('786a3701b1ef47fc9eb1f694c081c27d','李懂','F00001',14,'1995-01-01','成都市',28,'5e9a14365bc3454e95b908527682addf','067b549ab171476285e372214889e8ee','10022.00',16,'2019-01-09','','15082380000','74128029@qq.com','<p>大大打算</p>',8,'e10adc3949ba59abbe56e057f20f883e',NULL,NULL,NULL,NULL,'2019-01-01',1,1),('a10adf63aa954813b237fca50b182573','李完成','F00011',14,'2019-04-11','成都市',23,'19843f6f41d34c52862fbe7bc6b118c3','21926e42ea13444a9d72ba65ede6fd23','20000.00',16,'2019-04-04','','15082384980','5289900@qq.com','<p>dfsfasdfasdfas<img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190406/1554543583087016885.jpg\" title=\"1554543583087016885.jpg\" alt=\"footer.jpg\" width=\"254\" height=\"37\"/><img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190408/1554717634214001749.jpg\" title=\"1554717634214001749.jpg\" alt=\"10.jpg\"/></p><p><span class=\"edui-editor-imagescale-hand1\" style=\"box-sizing: border-box; position: absolute; width: 6px; height: 6px; overflow: hidden; font-size: 0px; display: block; background-color: rgb(60, 157, 208); cursor: n-resize; top: 0px; margin-top: -4px; left: 327.5px; margin-left: -4px; color: rgb(112, 116, 120); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif;\"></span><span class=\"edui-editor-imagescale-hand2\" style=\"box-sizing: border-box; position: absolute; width: 6px; height: 6px; overflow: hidden; font-size: 0px; display: block; background-color: rgb(60, 157, 208); cursor: ne-resize; top: 0px; margin-top: -4px; left: 655px; margin-left: -3px; color: rgb(112, 116, 120); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, Helvetica, Arial, sans-serif;\">da</span></p>',10,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-06',2,1),('aab2ddc3e34b4818a94a9ab19e8feead','吴峰','F00012',14,'2019-05-25','成都市',26,'bba4af5cac4c4474bf0e4aa03dadadea','067b549ab171476285e372214889e8ee','12000.00',16,'2019-05-25','','15082384023','2589952@qq.com','<p>测试人员添加</p>',10,'e10adc3949ba59abbe56e057f20f883e',NULL,NULL,NULL,NULL,'2019-05-16',NULL,1),('ddc78c6a59d5426cbca1723e6c5f82f9','胡成','F00008',15,'2019-04-03','成都市',32,'a8acd7921f0343eba1ae1bd5b370c32e','6c5bbb81311b4a448e66710cf7f687e0','5000.00',16,'2019-04-03','','15082384444','52899@qq.com','<p>简单测试12dasadsadasda<img src=\"http://localhost:8082/oasy/ueditor/jsp/upload/image/20190406/1554538472341059356.jpg\" title=\"1554538472341059356.jpg\" alt=\"header.jpg\"/></p>',7,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-06',2,1),('e5c0c7c54eca49b9bdba6234dbacf4b5','王石介','F00003',14,'2019-04-06','四川',29,'bba4af5cac4c4474bf0e4aa03dadadea','1856adf54b6445deb47e359c73ff2959','9000.00',16,'2019-04-05','','15082380000','528000000@qq.com','',13,'c4ca4238a0b923820dcc509a6f75849b',NULL,NULL,NULL,NULL,'2019-04-05',2,1);

/*Table structure for table `staff_job` */

DROP TABLE IF EXISTS `staff_job`;

CREATE TABLE `staff_job` (
  `staff_id` varchar(32) DEFAULT NULL,
  `job_id` varchar(32) DEFAULT NULL,
  `type_id` int(4) DEFAULT NULL,
  `dataStatus` int(2) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff_job` */

insert  into `staff_job`(`staff_id`,`job_id`,`type_id`,`dataStatus`) values ('014e60ea2b9b41d6b93dedc38d465ad8','c8735d10518349ff92c6836e941582f9',NULL,1),('06916c6860e5486faf8d56044f202147','c8735d10518349ff92c6836e941582f9',NULL,1),('1757d5379b114c20b2cf7612a1641bfb','c8735d10518349ff92c6836e941582f9',NULL,1),('52d8affc5ed44f3f93a67d8200d3c5f6','c8735d10518349ff92c6836e941582f9',NULL,1),('786a3701b1ef47fc9eb1f694c081c27d','c8735d10518349ff92c6836e941582f9',NULL,1),('e5c0c7c54eca49b9bdba6234dbacf4b5','b5231bc552a14e20adecce0b50ba04c9',NULL,1),('ddc78c6a59d5426cbca1723e6c5f82f9','b5231bc552a14e20adecce0b50ba04c9',NULL,1),('a10adf63aa954813b237fca50b182573','b5231bc552a14e20adecce0b50ba04c9',NULL,1),('786a3701b1ef47fc9eb1f694c081c27d','b5231bc552a14e20adecce0b50ba04c9',NULL,1),('6703f7b2134e46418062b688a38b1b37','b5231bc552a14e20adecce0b50ba04c9',NULL,1),('786a3701b1ef47fc9eb1f694c081c27d','08de3a8594744fe086ceb3bc81b7b8cf',NULL,1),('a10adf63aa954813b237fca50b182573','08de3a8594744fe086ceb3bc81b7b8cf',NULL,1),('ddc78c6a59d5426cbca1723e6c5f82f9','08de3a8594744fe086ceb3bc81b7b8cf',NULL,1),('6703f7b2134e46418062b688a38b1b37','08de3a8594744fe086ceb3bc81b7b8cf',NULL,1),('52d8affc5ed44f3f93a67d8200d3c5f6','08de3a8594744fe086ceb3bc81b7b8cf',NULL,1),('014e60ea2b9b41d6b93dedc38d465ad8','068a5d0a50ae4e3c8ba8e301249621ab',NULL,1),('1757d5379b114c20b2cf7612a1641bfb','068a5d0a50ae4e3c8ba8e301249621ab',NULL,1),('4fdbfa42577d4d83bc84899f315f015c','068a5d0a50ae4e3c8ba8e301249621ab',NULL,1),('52d8affc5ed44f3f93a67d8200d3c5f6','068a5d0a50ae4e3c8ba8e301249621ab',NULL,1),('786a3701b1ef47fc9eb1f694c081c27d','062601190cc64e7eab97e114a529c37d',NULL,1),('6703f7b2134e46418062b688a38b1b37','062601190cc64e7eab97e114a529c37d',NULL,1),('52d8affc5ed44f3f93a67d8200d3c5f6','062601190cc64e7eab97e114a529c37d',NULL,1),('4fdbfa42577d4d83bc84899f315f015c','062601190cc64e7eab97e114a529c37d',NULL,1);

/*Table structure for table `staff_relative` */

DROP TABLE IF EXISTS `staff_relative`;

CREATE TABLE `staff_relative` (
  `chief_id` varchar(32) DEFAULT NULL COMMENT '上级ID',
  `junior_id` varchar(32) DEFAULT NULL COMMENT '下级ID',
  `relative` int(4) DEFAULT '1' COMMENT '关系',
  `dataStatus` int(2) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff_relative` */

/*Table structure for table `staff_role` */

DROP TABLE IF EXISTS `staff_role`;

CREATE TABLE `staff_role` (
  `role_id` int(16) NOT NULL AUTO_INCREMENT,
  `state` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `roleKey` varchar(32) DEFAULT NULL,
  `description` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `staff_role` */

insert  into `staff_role`(`role_id`,`state`,`name`,`roleKey`,`description`) values (1,'0','管理员','admin','管理员'),(2,'0','普通角色','simple','普通角色'),(3,'0','超级管理员','super','超级管理员');

/*Table structure for table `user_login` */

DROP TABLE IF EXISTS `user_login`;

CREATE TABLE `user_login` (
  `login_id` int(16) NOT NULL AUTO_INCREMENT,
  `staff_id` varchar(32) DEFAULT NULL,
  `accountName` varchar(32) DEFAULT NULL,
  `loginTime` varchar(32) DEFAULT NULL,
  `loginIP` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_login` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
