package ifelseif;

public class ifelseifstatement {
public static void main(String[] args) {
	int var1=90;
	int var2=80;
	int var3=70;
	if(var1>var2&var1>var3)
	{
		System.out.println("var1 variable is greater than var2 and var3 variable");
	}
	else
	 if(var2>var3)
		{
			System.out.println("var2 variable is greater than var1 and var3 varlable");
		}
		else
		{
		System.out.println("var3 variable is greater than var1 and var2 variable");	
		}
	
	
}
}
