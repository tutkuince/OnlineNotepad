package com.muditasoft.onlinenotepad.config;

import java.beans.PropertyVetoException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class HibernateConfig {
	
	
	@Bean(destroyMethod = "close")
	public ComboPooledDataSource comboPooledDataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		// JDBC Properties
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/onlinenotepad?useSSL=false");
		try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		dataSource.setUser("root");
		dataSource.setPassword("123456.");
		
		// Connection Pool Properties for C3P0
		dataSource.setInitialPoolSize(5);
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(20);
		dataSource.setMaxIdleTime(3000);
		
		return dataSource;
	}
}
