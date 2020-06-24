package com.wipro.flowcontrolstatements;

public class wipflowcontrolex5 {

	public static void main(String[] args)
	{
	    char ch =args[0].charAt(0);
	
	    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	    {
	        System.out.println(" alphabets");
	    }
	    else if(ch >= '0' && ch <= '9')
	    {
	        System.out.println("digits");
	    }
	    else 
	    {
	        System.out.println("special c");
	    }

	}
}
