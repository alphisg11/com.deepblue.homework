package org.deepblue.javbase.conatiner.propertiesDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Demo02_Properties_Out {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		//KEY是不允许重复
		properties.setProperty("userName", "xiaoming");
		properties.setProperty("userPassword", "admin");
	
		//properties必须存储在后缀名为properties的文件中
		File file = new File("src/data/user.properties");
		OutputStream out = new FileOutputStream(file);
		//把properties的内容写到user.propertis文件中
		properties.store(out, "this is my user information");
		
		out.flush();
		out.close();
		
		
	}
}

