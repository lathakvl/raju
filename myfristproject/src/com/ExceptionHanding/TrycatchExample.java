package com.ExceptionHanding;

public class TrycatchExample {
    public static void main(String[] args) {
		try
		{
	    int var1=10;
	    int var2=0;
	    int var3;
		var3=var1/var2;
		System.out.println("The devision of 2 variabes is :"+var3);
		}
		catch(Exception hi)
		{
		System.out.println("The Expectionn is:"+hi);
		System.out.println("unable to perform the division");
		
		}
}
}