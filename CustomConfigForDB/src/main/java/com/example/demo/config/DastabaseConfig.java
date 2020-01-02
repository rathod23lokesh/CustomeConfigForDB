package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DastabaseConfig {
	@Bean(name = "mysqlDataSourceFrDemo")
	public DataSource getDatasourceSQL() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/demo");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("root");
		return dataSourceBuilder.build();
	}

	 @Bean(name = "mysqlDataSourceFrTest")
	    public DataSource h2DataSource() 
	    {
		 	DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
			dataSourceBuilder.url("jdbc:mysql://localhost:3306/demo");
			dataSourceBuilder.username("root");
			dataSourceBuilder.password("root");
			return dataSourceBuilder.build();
	    }

}
