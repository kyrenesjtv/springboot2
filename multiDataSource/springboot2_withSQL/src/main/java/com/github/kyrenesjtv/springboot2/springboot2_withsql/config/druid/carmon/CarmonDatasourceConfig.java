package com.github.kyrenesjtv.springboot2.springboot2_withsql.config.druid.carmon;


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
@MapperScan(basePackages = CarmonDatasourceConfig.PACKAGE, sqlSessionFactoryRef = "carmonSqlSessionFactory")
public class CarmonDatasourceConfig {
    // mysqldao扫描路径
    static final String PACKAGE = "com.github.kyrenesjtv.springboot2.springboot2_withsql.DAO.carmon";
    // mybatis mapper扫描路径
    static final String MAPPER_LOCATION = "classpath:mapper/carmon/*.xml";

    @Primary
    @Bean(name = "carmondatasource")
    @ConfigurationProperties(prefix ="spring.datasource.carmon")
    public DataSource carmonDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "carmonTransactionManager")
    @Primary
    public DataSourceTransactionManager mysqlTransactionManager() {
        return new DataSourceTransactionManager(carmonDataSource());
    }

    @Bean(name = "carmonSqlSessionFactory")
    @Primary
    public SqlSessionFactory carmonSqlSessionFactory(@Qualifier("carmondatasource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //如果不使用xml的方式配置mapper，则可以省去下面这行mapper location的配置。
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(CarmonDatasourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
