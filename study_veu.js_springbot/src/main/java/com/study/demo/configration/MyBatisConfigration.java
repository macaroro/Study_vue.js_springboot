package com.study.demo.configration;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.study.demo.mvc.repository")
public class MyBatisConfigration {
	
	@Bean
	public SqlSessionFactory SqlSessionFactory(@Autowired DataSource data, ApplicationContext ApplicationContext) throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(data);
		factoryBean.setMapperLocations(ApplicationContext.getResources("classpath:myBatis/sql/*.xml"));
		SqlSessionFactory factory = factoryBean.getObject();
		factory.getConfiguration().setMapUnderscoreToCamelCase(true);
		return factoryBean.getObject();
		
	}
	
	@Bean
	public SqlSessionTemplate SqlSessionTemplate(@Autowired SqlSessionFactory SqlSessionFactory) {
		return new SqlSessionTemplate(SqlSessionFactory);
		
	}

}
