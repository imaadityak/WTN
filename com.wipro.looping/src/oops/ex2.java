package oops;

public class ex2 
{
    public static void main(String[] args) {
 
    System.out.println(calculator.powerInt(35,4));
    System.out.println(calculator.powerDouble(35.0, 4));
    }

}

class calculator
{
    static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}




