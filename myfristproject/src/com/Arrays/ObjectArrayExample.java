package com.Arrays;

public class ObjectArrayExample {
 public static void main(String[] args) {
	Object array1[]=new Object[4]; 	
	array1[0]=10;
	array1[1]="pavan";
	array1[2]='K';
	array1[3]=0.1234;
     for(int index=0;index<array1.length;index++)
     {
       System.out.println(array1[index]);
       
       
     }     
       
       }
}
