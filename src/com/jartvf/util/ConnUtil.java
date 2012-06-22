package com.jartvf.util;

import java.sql.DriverManager;

public class ConnUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql:jartvf";
        String user = "andrew";
        String password = "mettle11";
        Class.forName(driver);
        DriverManager.getConnection(url, user, password);
	}

}
