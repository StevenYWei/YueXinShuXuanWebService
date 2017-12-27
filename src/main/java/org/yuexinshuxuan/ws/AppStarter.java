package org.yuexinshuxuan.ws;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@SpringBootApplication
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(AppStarter.class, args);
	}

//	@Bean
//	public DataSource dataSource() { 
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://shuxuan.ccjzcngskpro.ap-northeast-1.rds.amazonaws.com:3306/shuxuan");
//		dataSource.setUsername("shuxuanadmin");
//		dataSource.setPassword("shuxuanadmin");
//		dataSource.setSchema("shuxuan");
//		dataSource.setConnectionProperties(additionalProperties());
//		return dataSource;
//	}
	
	@Bean
	public DataSource dataSource() { 
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/yuexinshuxuan");
		dataSource.setUsername("JDBC");
		dataSource.setPassword("JDBC");
		dataSource.setSchema("yuexinshuxuan");
		dataSource.setConnectionProperties(additionalProperties());
		return dataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);

		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5dialect");
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}

}
