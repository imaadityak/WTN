package oops;

public class shortlongshort
{
 public static void main(String[] args)
 {
		String a = "hi";
		String b = "hello";
		String out;
		if (a.length() < b.length()) 
			out = a + b + a;
		else
			out = b + a + b;
		
		System.out.println(out);
	}
 }

