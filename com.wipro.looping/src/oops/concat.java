package oops;
import java.util.Scanner; 
public class concat 
{
 public static void main(String[] args) 
 {
	 Scanner scan=new Scanner(System.in);
	 String s1=scan.nextLine();
	 String s2=scan.nextLine();
	 if(s1.substring(s1.length()-1).equalsIgnoreCase( s2.substring(0,1))) 
		 System.out.println(s1.concat(s2.substring(1,s2.length()))); 
	 else 
		 System.out.println(s1.concat(s2).toLowerCase());
	 }
 }
