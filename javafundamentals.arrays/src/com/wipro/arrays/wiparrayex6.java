package com.wipro.arrays;

public class wiparrayex6 
{
	public static void main(String[] args)
	{        
        
        int [] a= new int [] {2,8,4,6};     
        int temp = 0,i;   
        for (i=0;i<a.length;i++)
        {     
            for (int j=i+1;j<a.length;j++)
            {     
               if(a[i]>a[j])
               {    
                   temp = a[i];    
                   a[i]=a[j];    
                   a[j]=temp;    
               }     
            }     
        }    
          
        System.out.println();    
        for (i=0;i<a.length;i++) 
        {     
            System.out.print(a[i] + " ");    
        }    
    }    
}
