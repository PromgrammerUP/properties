package org.javachina.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class TestProperties {
	
	//properties解析方式一
	public void testProperties() throws IOException{
		Properties pro = new Properties();
		InputStream is = new FileInputStream("./src/org/javachina/prop/conn.properties");
		pro.load(is);
		String name = pro.getProperty("password");
		System.out.println(name);
		is.close();
	}
	
	//properties解析方式二
	public void testResourceBunndle(){
		
		//路径：包名+文件名(不含扩展名）
		ResourceBundle rb = ResourceBundle.getBundle("org/javachina/prop/conn");
		String name = rb.getString("username");
		System.out.println(name);
	}
	public static void main(String[] args) throws IOException {
		
	}
}
