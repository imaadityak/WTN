package oops;

public class palindrome
{
 public static void main(String[] args)
 {
	 String str1=new String("adi");
	 StringBuffer str2=new StringBuffer(str1);
	 str2.reverse();
	 if(str1.equalsIgnoreCase(str2.toString()))
		 {
			 System.out.println("Palindrome");
		 }
	 else
	 {
		 System.out.println("Not Palindrome");
	 }
 }
}
