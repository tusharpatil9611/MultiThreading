package MultiThreading;

public class AdditonSynchronization {

	public static void main(String[] args) throws Exception
	{
		Ab t1=new Ab();
		Abcd t2=new Abcd();
		t1.start();
		t2.start();
		t1.join();				//run one after another perform by join method
		t2.join();
		System.out.println(Addition1.i);
	}
}
class Addition1
{
	static int i=0;
	public static synchronized void addi() 
	{
		i=i+1;
	}
}
class Ab extends Thread
{
	public void run() 
	{
		for (int i = 0; i <1000; i++) 
		{
			Addition1.addi();
		}
	}
}
class Abcd extends Thread
{
	public void run() 
	{
		for (int i = 0; i < 1000; i++) 
		{
			Addition1.addi();
		}
	}
}