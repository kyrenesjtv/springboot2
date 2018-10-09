package com.github.kyrenesjtv.springboot2.springboot2_withsql.config.druid.gwyc;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @ProjectName: springboot2_withsql
 * @Author: wanglin
 * @CreateDate: 2018/9/29 11:15
 */
@Configuration
@MapperScan(basePackages = GwycDatasourceConfig.PACKAGE, sqlSessionFactoryRef = "gwycSqlSessionFactory")
public class GwycDatasourceConfig {
    // mysqldao扫描路径
    static final String PACKAGE = "com.github.kyrenesjtv.springboot2.springboot2_withsql.DAO.gwyc";
    // mybatis mapper扫描路径
    static final String MAPPER_LOCATION = "classpath:mapper/gwyc/*.xml";

    @Bean(name = "gwycdatasource")
    @ConfigurationProperties(prefix ="spring.datasource.gwyc")
    public DataSource gwycDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "gwycTransactionManager")
    public DataSourceTransactionManager mysqlTransactionManager() {
        return new DataSourceTransactionManager(gwycDataSource());
    }

    @Bean(name = "gwycSqlSessionFactory")
    public SqlSessionFactory gwycSqlSessionFactory(@Qualifier("gwycdatasource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //如果不使用xml的方式配置mapper，则可以省去下面这行mapper location的配置。
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(GwycDatasourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
