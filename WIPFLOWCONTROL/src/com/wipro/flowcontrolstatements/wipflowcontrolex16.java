package com.wipro.flowcontrolstatements;

public class wipflowcontrolex16 
{
	public static void main(String[] args) {

        int num,rev = 0,r,temp;
      num=Integer.parseInt(args[0]);
        temp= num;
        while( num != 0 )
        {
            r = num % 10;
            rev=rev*10+r;
            num/=10;
        }

        if (temp==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
	
}
