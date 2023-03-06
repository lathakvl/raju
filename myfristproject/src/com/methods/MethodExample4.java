package com.methods;

public class MethodExample4 {
private void multipliction()
{
   int var1 =20;
   int var2 =10;
   int var3;
   var3=var1*var2;
   System.out.println("The value of var3 after multiplication is:"+var3);
  }
  public static void main(String[] args) {
	  MethodExample4 m4=new MethodExample4();
	  m4.multipliction();
	  methodExample3 obj=new methodExample3();
	  obj.addittion();
	  m4.subtraction();
	  m4.subtraction();
	  m4.subtraction(40, 20);
  }
	public void subtraction()
	{
	 int var1=20;
	 int var2=10;
	 int var3;
	 var3=var1-var2;
	 System.out.println("The value of var3 after subtraction is "+var3);
	  
}

public void subtraction(int var1,int var2)
{
	int var3;
	var3=var1-var2;
	System.out.println("The valu of the varibale var3 with parameters after subtraction is  "+var3);
}


}
