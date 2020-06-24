package com.wipro.flowcontrolstatements;

public class wipflowcontrolex7 
{
	public static void main(String[] args) 
	{
		 char c=args[0].charAt(0);

		int temp; 
		if (Character.isLowerCase(c))
			System.out.println(c+"->"+Character.toUpperCase(c));
		else 
			System.out.println(c+"->"+Character.toLowerCase(c));
		if(c>='a' && c<='z') 
		{
			System.out.print(c+"->");
			temp=(int)c; 
			c=(char)(temp-32);
			System.out.println(c); 
			}
		else
		{
			System.out.print(c+"->"); 
			temp=(int)c; 
			c=(char)(temp+32);
			System.out.println(c); 
			}
		}
}
