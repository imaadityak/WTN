package interfaces;
public class Test 
{
	public static void main(String[] args) 
	{
		Playable p1=new Veena();
		Playable p2=new Saxophone();
		p1.play();
		p2.play();
	}
}