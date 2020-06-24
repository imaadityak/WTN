package com.wipro.arrays;

public class wiparrayex3 
{
 public static void main(String[] args)
 {
	 int a[]=new int[]{1,2,3,4};
	 int x=4,flag=0,i;
	 for(i=0;i<a.length;i++)
	 {
		 if(a[i]==x)
		 {
			 flag=1;
			 break;
		 }
	 }
	 if(flag==1)
		 System.out.println(i);
	 else
		 System.out.println(-1);
 }
	
}
