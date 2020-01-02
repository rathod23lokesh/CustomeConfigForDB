package com.example.demo.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CustomConfigForDbDao {

	@Autowired
	@Qualifier("mysqlDataSourceFrDemo")
	public DataSource mysqlDemoDataSrc;
	
	public void getData()
	{
		System.out.println("GetData");
	}
}
