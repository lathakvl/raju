package stringcomparsion;

public class stingcompareExample {
public static void main(String[] args) {
	String string1="Livetech";
	System.out.println("string");
	System.out.println("String1.charAt(2)");
	char charAtIndex=string1.charAt(4);
	System.out.println("the value of the variable  charAtIndex is:"+charAtIndex);
	int charAtNewIndex=string1.charAt(4);
	System.out.println("chartAtNewindex");
	String string2="LiVeTech";
	String string3="Livetech";
	if(string2.equals(string3))//both string variables are compared for the exact match case
      
	{
		System.out.println("variable staring2 and variable staring3 are equal");
	}
	else
		
	{
		System.out.println(" variable staring2 and variable staring3 ane NOT Equal");
	}

    String string4 ="Testing Tools";
    String string5="Testing tools  ";
    if(string4.equals(string5))
    
    {
    	System.out.println("variable string4 variable staring5 are equal");
    }
    else
    
    {
    	System.out.println("variable stearing4 and variable staring5 are NOT Equal");
    }
   
    String string6= "loadRunner";
	String ConvertedstringTOuppercase=string6.toUpperCase();
	System.out.println("the string value string6 converted to uppercase:"+ConvertedstringTOuppercase);
//variable value converting to all lower case letter
	String convertedstringStringToLowercase = string6.toLowerCase();
   System.out.println("the stringvalue string6 converted to Lowercase:"+convertedstringStringToLowercase);
   //checking for the existence of the string value
   String string7="Live";
   String string8="Live Tech";
   if(string7.contains(string8))
   {
	   System.out.println("Expected string is found-string7 contains String8");
	   
   }

   else
   {
   System.out.println("Expected string is NOT found-string string7 does not contains string");
   }
   }




}

