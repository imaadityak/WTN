package oops;

class box 
{
    double width;
    double height;
    double depth;
    
    public box()
    {
        width = 3;
        height = 3;
        depth = 3;
    }
    
  
    public box(double width, double height, double depth) 
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume()
    {
        return width * height * depth;
    }
}

public class ClassesandObjectex1 
{
	 public static void main(String args[]) 
	 {
	        box mybox1 = new box(); 
	        double volume;
	        volume = mybox1.volume();
	        System.out.println("Volume of mybox1 is " + volume);

	  }
	
}
