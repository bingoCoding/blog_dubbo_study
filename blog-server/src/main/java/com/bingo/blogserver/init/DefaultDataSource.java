package com.bingo.blogserver.init;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Properties;

//@Configuration   //该注解类似于spring配置文件
//@MapperScan(basePackages="com.bingo.blogserver.dao",sqlSessionFactoryRef = "sqlSessionFactory")
//@PropertySources({ @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)})
public class DefaultDataSource{
//    @Autowired
//    private Environment env;
//    /**
//     * 创建数据源
//     * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
//     */
//    @Bean(name = "masterDataSource")
//    @Primary
//    public DataSource getMasterDataSource() throws Exception{
//        Properties props = new Properties();
//        props.put("driverClassName", env.getProperty("default.datasource.driver-class-name"));
//        props.put("url", env.getProperty("default.datasource.url"));
//        props.put("username", env.getProperty("default.datasource.username"));
//        props.put("password", env.getProperty("default.datasource.password"));
//        return DruidDataSourceFactory.createDataSource(props);
//    }
//
//    /**
//     * 根据数据源创建SqlSessionFactory
//     */
//    @Bean(name = "sqlSessionFactory")
//    @Primary
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("masterDataSource") DataSource ds) throws Exception{
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(ds);//指定数据源(这个必须有，否则报错)
//        //分页插件
//        PageHelper pageHelper = new PageHelper();
//        Properties props = new Properties();
//        props.setProperty("reasonable", "true");
//        props.setProperty("supportMethodsArguments", "true");
//        props.setProperty("returnPageInfo", "check");
//        props.setProperty("params", "count=countSql");
//        pageHelper.setProperties(props);
////        bean.setPlugins(new Interceptor[]{pageHelper});
//        //添加插件
//        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
////        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));//指定基包
//        System.out.println(env.getProperty("mybatis.mapperLocations"));
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        bean.setMapperLocations(resolver.getResources(env.getProperty("mybatis.mapperLocations")));//指定xml文件位置
//
//
//        return bean.getObject();
//    }
//
//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager transactionManager(@Qualifier("masterDataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "sqlSessionTemplate")
//    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
////        new MapperAutoConfiguration(sqlSessionFactory);
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//    }
//
//    @Bean
//    @Qualifier("sqlSessionFactory")
//    public PageHelper pageHelper() {
//        System.out.println("MyBatisConfiguration.pageHelper()");
//        PageHelper pageHelper = new PageHelper();
//        Properties p = new Properties();
//        p.setProperty("offsetAsPageNum", "true");
//        p.setProperty("rowBoundsWithCount", "true");
//        p.setProperty("reasonable", "true");
//        pageHelper.setProperties(p);
//        return pageHelper;
//    }
}