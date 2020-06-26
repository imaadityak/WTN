package oops;
class Animal 
{
	void eat()
	{ 
		System.out.println("eat"); 
	} void sleep() 
	{
		System.out.println("sleep");
	}
}
class Bird extends Animal
{
   void eat() 
   { 
	   System.out.println("Override eat");
	   
   }
   void sleep() 
   {
	   System.out.println("Override sleep");
	   }
   void fly() 
   {
	   System.out.println("fly");
	   }
   }
public class inheritacceex1 
{
	public static void main(String args[]) 
	{
		Animal a = new Animal();
		Bird b= new Bird();
		a.eat();
		a.sleep(); 
		b.eat();
		b.sleep(); 
		b.fly();
		} 
	}
