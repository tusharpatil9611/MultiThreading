package MultiThreading;

public class JoinMethod {

	public static void main(String[] args) throws Exception
	{
		Thread1 t1 =new Thread1();
		ThreadT t2=new ThreadT();
		Thread3 t3 =new Thread3();
		t1.start();
		t2.start();
		t3.start();
	
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Work is Over now");
	}

}
class Therad1 extends Thread
{
	public void run() 
	{
		for(int i = 0; i < 10; i++) 
		{
			System.out.println("Hello");
		}
	}
}
class ThreadT extends Thread
{
	public void run() 
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Hii");
		}
	}
}
class Thread3 extends Thread
{
	public void run() 
	{
		for (int i = 0; i <10; i++) 
		{
			System.out.println("Something");
		}
	}	

}