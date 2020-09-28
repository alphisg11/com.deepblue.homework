package org.deepblue.javbase.conatiner.propertiesDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo03_Properties_IN {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		InputStream inStream = new FileInputStream(new File("src/data/user.properties"));
		//把指定的properties文件中的信息加载到properties中
		properties.load(inStream);
		
		String userName =  properties.getProperty("userName");
		System.out.println(userName);
		
		
	}
}
