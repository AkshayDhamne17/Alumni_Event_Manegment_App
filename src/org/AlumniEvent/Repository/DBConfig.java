package org.AlumniEvent.Repository;

import java.sql.*;


import org.AlumniEvent.helper.PathHelper;

public class DBConfig {

	protected Connection conn;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	public DBConfig() {


		try {			
			PathHelper phelp = new PathHelper();
			Class.forName(PathHelper.p.getProperty("dbClass"));
			conn = DriverManager.getConnection(PathHelper.p.getProperty("url"), PathHelper.p.getProperty("user"),PathHelper.p.getProperty("pass"));
		} catch (Exception ex) {
			System.out.println("Error when we connect database is "+ex);
		}
	}
}
