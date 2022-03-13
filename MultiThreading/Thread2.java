package MultiThreading;

public class Thread2 extends Thread
{
	public void run() 
	{
		for (int i = 0; i <10; i++) 
		{
			System.out.println("Hello");
			try 
			{
				Thread.sleep(100);
			} 
			catch (Exception e)
			{}
		}
	}
}
