-- 用户表

CREATE TABLE `sys_user` (
                            `id` INT(11) NOT NULL AUTO_INCREMENT,
                            `username` VARCHAR(32) NOT NULL,
                            `password` VARCHAR(255) NOT NULL,
                            `enabled` TINYINT(1) NOT NULL DEFAULT 1,
                            `account_non_expired` TINYINT(1) NOT NULL DEFAULT 1,
                            `account_non_locked` TINYINT(1) NOT NULL DEFAULT 1,
                            `credentials_non_expired` TINYINT(1) NOT NULL DEFAULT 1,
                            PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;




-- 角色表
CREATE TABLE `sys_role` (
                            `id` INT(11) NOT NULL AUTO_INCREMENT,
                            `name` VARCHAR(32) DEFAULT NULL,
                            `describe` VARCHAR(32) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- 创建 sysuser_role 表
CREATE TABLE `sysuser_role` (
                                `id` INT(11) NOT NULL AUTO_INCREMENT,
                                `uid` INT(11) DEFAULT NULL,
                                `rid` INT(11) DEFAULT NULL,
                                PRIMARY KEY (`id`),
                                KEY `uid` (`uid`),
                                KEY `rid` (`rid`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- 插入用户数据
BEGIN;
INSERT INTO `sys_user` (`id`, `username`, `password`, `enabled`, `account_non_expired`, `account_non_locked`, `credentials_non_expired`)
VALUES
    (1, 'root', '{noop}123', 1, 1, 1, 1),
    (2, 'admin', '{noop}123', 1, 1, 1, 1),
    (3, 'jaguarliu', '{noop}123', 1, 1, 1, 1);
COMMIT;

-- 插入角色数据
BEGIN;
INSERT INTO `sys_role` (`id`, `name`, `describe`)
VALUES
    (1, 'ROLE_super', '超级管理员'),
    (2, 'ROLE_admin', '普通管理员'),
    (3, 'ROLE_user', '普通用户');
COMMIT;

-- 插入用户角色数据
BEGIN;
INSERT INTO `sysuser_role` (`id`, `uid`, `rid`)
VALUES
    (1, 1, 1),
    (2, 1, 2),
    (3, 2, 2),
    (4, 3, 3);
COMMIT;
