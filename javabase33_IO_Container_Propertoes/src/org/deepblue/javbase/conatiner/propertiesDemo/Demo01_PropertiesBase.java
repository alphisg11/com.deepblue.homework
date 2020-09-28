package org.deepblue.javbase.conatiner.propertiesDemo;

import java.util.Properties;

public class Demo01_PropertiesBase {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		//KEY是不允许重复
		properties.setProperty("userName", "xiaoming");
		properties.setProperty("userPassword", "admin");
		
		System.out.println(properties);
		
		
		String userPassword = properties.getProperty("userPassword");
		System.out.println(userPassword);
	}
}

