package MultiThreading;

public class DeadLock {

	public static void main(String[] args) 
	{
		FifthThread t1=new FifthThread();
		SixthThread t2=new SixthThread();
	
		t1.start();
		t2.start();
	}

}
class FifthThread extends Thread
{
	public void run() 
	{
		fifth.m1();
	}
}
class SixthThread extends Thread
{
	public void run() 
	{
		sixth.m1();	
	}
}
class fifth
{
	public static synchronized void m1()
	{
		System.out.println("5-1");
		try {
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		sixth.m2();
	}
	public static synchronized void m2()
	{
		System.out.println("5-2");
	}
}
class sixth
{
	public static synchronized void m1()
	{
		System.out.println("6-1");
		try {
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		fifth.m2();
	}
	public static synchronized void m2()
	{
		System.out.println("6-2");
	}
}
