package me.qiancheng.qianworks.fastcode.domain;

import lombok.Data;

/**
 * 数据库配置
 *
 * @author <a href="i@qiancheng.me">千橙</a>
 */
@Data
public class DbConfig {
    private String host;
    private String database;
    private String user;
    private String password;
    private Integer connectionLimit = 10;
    private Integer httpPort = 8888;
    private Integer dbPort = 3306;
    private String jdbcDriver;
}
