package com.methods;

public class MethodExmaple2 {
//Global
	int var1=30;
    int var2=20;
	
	public void addition()
	{
	//local variable
	int var1=10;
	    var1=50;
	    int var2=20;
	    int var3;
	    var3=var1+var2;
	    System.out.println("The value of the varoable var3 after addition is:"+var3);
}	    
public static void main(String[] args) {
	MethodExmaple2 m2= new MethodExmaple2();
	m2.addition();
	m2.subtration();
	m2.multiplication();
	m2.divistion();
	m2.multiplication();
}
private void subtration()
{
     int var1=10;
     int var2=20;
     int var3;
     var3=var1-var2;
     System.out.println("The value of the variable var3 after subtration is:"+var3);

}	
	
protected void multiplication()	
	
{	
	int var3;
	var3=var1*var2;
	System.out.println("The value of the variable var3 after multiplication is:"+var3);
}
	
void divistion()
{
   int var1=100;
   int var2=20;
   int var3;
   var3=var1|var2;
   System.out.println("The value of the variable var3 after division is:"+var3);
	
}
	
	
	
	
	
	
	
	
	
	
}
