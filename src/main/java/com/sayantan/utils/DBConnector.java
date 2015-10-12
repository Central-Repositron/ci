package com.sayantan.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class DBConnector {
	public Map<String, String> mysql = new HashMap<String, String>();
	private MessageDigest md;
	private String uname = "root";
	private String password = "s3rect";
	private String digest;

	/* mysql doesnt provide any way to provide password as md5 hash input */
	public String encryptedPassword(String pass) {
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] hash = md.digest(pass.getBytes("UTF-8"));

			StringBuilder sb = new StringBuilder(2 * hash.length);
			for (byte b : hash) {
				sb.append(String.format("%02x", b & 0xff));
			}

			digest = sb.toString();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return digest;
	}

	public DBConnector() {
		mysql.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		mysql.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		mysql.put("hibernate.connection.url",
				"jdbc:mysql://localhost:3306/mysql");
		mysql.put("hibernate.connection.username", uname );
		mysql.put("hibernate.connection.password", password);
	}
}
