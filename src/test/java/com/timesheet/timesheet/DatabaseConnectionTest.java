package com.timesheet.timesheet;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.timesheet.api.TimesheetApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TimesheetApplication.class})
public class DatabaseConnectionTest {
	
	@Autowired
	JdbcTemplate template;
	
	
	
	@Test
	public void test() throws SQLException{
		String sql = "Select * from timesheet.employee;";
		DatabaseMetaData md = template.getDataSource().getConnection().getMetaData();
		ResultSet rs = md.getTables(null, null, "%", null);
		while (rs.next()) {
		  System.out.println(rs.getMetaData());
		}
		System.out.println(template.queryForList(sql));
		System.out.println();
	}
	
}
