package com.wipro.flowcontrolstatements;

public class wipflowcontrolex13 
{
	public static void main(String args[])
    {
    	
        int n, r=0, sum=0, temp;
        
        n=Integer.parseInt(args[0]);
        temp = n;
        while(n>0)
        {
            r= n%10;
            sum = sum+r;
            n = n/10;
        }
		
        System.out.print("Sum of Digits of " +temp+ " is : " +sum);        
    }
	
}
