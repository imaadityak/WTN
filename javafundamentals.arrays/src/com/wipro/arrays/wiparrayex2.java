package com.wipro.arrays;

public class wiparrayex2 
{
	public static void main(String[] args) 
    {
      int a[]=new int[]{1,2,3,4};
      int max=a[0],min=a[0];
      for (int i:a)
      {
    	  if(i>max)
    		  max=i;
    	  else if(i<min)
    		  min=i;
      }
      System.out.println(max+" "+min);
      
    }
	
}
