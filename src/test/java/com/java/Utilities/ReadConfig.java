package com.java.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	String path ="C:\\Users\\Admin\\eclipse-workspace\\HybridFramework\\Configuration\\Config.properties";
	
	public ReadConfig() {
	
	prop = new Properties();

	try {
		FileInputStream f = new FileInputStream(path);
		prop.load(f);
	} catch (Exception e) {
		
		e.printStackTrace();
		
	}	
	}
	
	public String getBaseurl() {
		
		String value = prop.getProperty("BaseUrl");
		
		
		if(value!=null)
		{
			return value;
		}
		else
		{
			throw new RuntimeException("URL is not specified in Config File");
		}
	}
	
	public String getBrowser()
	{
		String Browser = prop.getProperty("Browser");
		
		if(Browser!=null)
		{
			return Browser;
		}
		else
		{
			throw new RuntimeException("Browser is not specified in Config File");
		}

	}
	
	
}
