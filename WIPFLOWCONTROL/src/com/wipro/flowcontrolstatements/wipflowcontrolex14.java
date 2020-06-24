package com.wipro.flowcontrolstatements;

public class wipflowcontrolex14 
{
	public static void main(String args[])
    {
       int r, n= 1, i, j;
       r =Integer.parseInt(args[0]);
       for (i= 1 ;i<= r ;i++ )
       {
           for ( j = 1 ; j <=i ; j++ )
           {
                System.out.print("*  ");
                n++;
           }
          
           System.out.println(" ");
       }
   }
	
}
