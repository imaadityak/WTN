package oops;

public class firsthalfstr 
{
    public static void main(String[] args)
    {
       StringBuffer a=new StringBuffer();
       
        String b=null;
        int l=a.length();
        int n=l/2;
        if(l%2==0)
        { 
        	b="";
            for(int i=0;i<n;i++)
            {
                b=b+a.charAt(i);
            }
            System.out.print(b);
        }
        else
        System.out.println(b);
    }
	}