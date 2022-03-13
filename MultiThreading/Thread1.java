package MultiThreading;

public class Thread1 extends Thread
{
	public void run() 
	{
		for (int i = 0; i <10; i++)
		{
			System.out.println("hi");
			try 
			{
				Thread.sleep(100);
			}
			catch (Exception e) 
			{}
		}
		super.run();
	}
}
