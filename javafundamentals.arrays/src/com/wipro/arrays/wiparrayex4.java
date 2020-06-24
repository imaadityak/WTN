package com.wipro.arrays;

public class wiparrayex4 
{
	public static void main(String[] args) {
		int a[]=new int[]{65,67,69,71};
        char ch=0;
        int i;
        for(i=0;i<a.length;i++)
        {
        	ch=(char)a[i];
        	System.out.println(a[i]+"->"+ch);
        }
        
    }
	
}
