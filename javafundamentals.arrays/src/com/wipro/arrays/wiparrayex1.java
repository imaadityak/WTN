package com.wipro.arrays;

public class wiparrayex1 
{
	public static void main(String[] args) 
    {
      int a[]=new int[]{1,2,3,4};
      int sum=0;
      float avg=0.0f;
      for(int i:a)
    	  sum =sum+i;
      
      avg=(float)sum/a.length;
      System.out.println(sum+" "+avg);
    }
}
