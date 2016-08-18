package me.qiancheng.qianworks.codegen.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import me.qiancheng.qianworks.codegen.domain.DbConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;

/**
 * @author <a href="i@qiancheng.me">千橙</a>
 */
@Configuration
//@PropertySource("classpath:config.json")
public class DataSourceConfig {
    @Bean
    public DataSource dataSource(DbConfig dbConfig) {
        HikariConfig config = new HikariConfig();
        config.setDataSourceClassName(dbConfig.getJdbcDriver());
        config.addDataSourceProperty("serverName", dbConfig.getHost());
        config.addDataSourceProperty("port", dbConfig.getDbPort());
        config.addDataSourceProperty("databaseName", dbConfig.getDatabase());
        config.addDataSourceProperty("user", dbConfig.getUser());
        config.addDataSourceProperty("password", dbConfig.getPassword());
        config.setMaximumPoolSize(dbConfig.getConnectionLimit());

        return new HikariDataSource(config);
    }

    @Bean
    public DbConfig readDbConfig() throws Exception {
        File config = ResourceUtils.getFile("classpath:config.json");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(config, DbConfig.class);
    }
}
