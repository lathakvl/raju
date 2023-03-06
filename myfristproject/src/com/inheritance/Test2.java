package com.inheritance;

public class Test2 extends Test1 {
private void subtraction()
{
int var1=20;
int var2=10;
int var3;
var3=var1-var2;
System.out.println("the vale of value of after subtraction is"+var3);
}
protected void multiplication()
{
int var1=20;
int var2=10;
int var3;
var3=var1*var2;
System.out.println("the valu of var3 after multiplication is"+var3);

}
public static void main(String[] args) {
System.out.println("********Test class method*****");
Test2 t2=new Test2();
t2.subtraction();
t2.multiplication();
System.out.println();
System.out.println("***Test1class methods****");
t2.addition();







}
}
