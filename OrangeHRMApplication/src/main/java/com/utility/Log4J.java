package com.utility;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4J {

	public static Logger Log=Logger.getLogger(Log4J.class);
	
	public static void info(String Message)
	{
		PropertyConfigurator.configure("./Log4j.properties");
		Log.info(Message);
	}









}
