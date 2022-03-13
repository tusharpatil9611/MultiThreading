package MultiThreading;

public class YeildMerthod {

	public static void main(String[] args) throws Exception
	{
		Yeild1 y1=new Yeild1();
		Yeild2 y2=new Yeild2();
		
		y1.start();
		y2.start();
		y1.join();
		System.out.println("End");
		y2.yield();
	
	}
}
class Yeild1 extends Thread
{
	public void run() {
		for (int i = 0; i <20; i++) 
		{
			System.out.println("may I come");
		}
	}
}
class Yeild2 extends Thread 
{
	public void run() 
	{
		for (int i = 0; i <20; i++) 
		{
			System.out.println(" in Sir");
		}
	}
}