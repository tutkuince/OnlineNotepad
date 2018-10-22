package com.muditasoft.onlinenotepad.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class HibernateConfig implements TransactionManagementConfigurer {
	
	private Logger logger = Logger.getLogger(getClass().getName());

	@Bean(destroyMethod = "close")
	public ComboPooledDataSource comboPooledDataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();

		String user = "root";
		String url = "jdbc:mysql://localhost:3306/onlinenotepad?useSSL=false";

		// JDBC Properties
		dataSource.setJdbcUrl(url);
		try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		dataSource.setUser(user);
		dataSource.setPassword("123456.");

		// Connection Pool Properties for C3P0
		dataSource.setInitialPoolSize(5);
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(20);
		dataSource.setMaxIdleTime(3000);

		logger.info("user ==>>> " + user);
		logger.info("url ==>>> " + url);

		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(comboPooledDataSource());
		bean.setPackagesToScan("com.muditasoft.onlinenotpad.model");
		
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		bean.setHibernateProperties(properties);
		return bean;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
		return hibernateTransactionManager;
	}

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return transactionManager();
	}
}
