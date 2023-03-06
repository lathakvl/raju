package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class orangeHRMProperty {
	public static Properties loadproperty() throws IOException {
		
		FileInputStream OHRmApplicationPropertiesfile=new FileInputStream("C:\\Users\\makke\\OneDrive\\Desktop\\krishnaveni\\OrangeHRMApplication\\src\\main\\java\\com\\config\\OrangeHRMProperties.properties");
		Properties properties=new Properties();
		properties.load(OHRmApplicationPropertiesfile);
		return properties;







	}

}
