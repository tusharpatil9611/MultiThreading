package MultiThreading;
public class DeadLock1 {
	public static void main(String[] args)
	{
		class1Thread t1 =new class1Thread();
		class2Thread t2=new class2Thread();
		t1.start();
		t2.start();
	}
}
class class1Thread extends Thread
{
	public void run() 
	{
		class1.M1();
	}
}
class class2Thread extends Thread
{
	public void run()
	{
		class2.M1();
	}
}
class class1
{
	public synchronized static void M1()
	{
		System.out.println("5-1");
		try {Thread.sleep(100);} catch (Exception e) {}
		class2.M2();	
	}
	public synchronized static void M2()
	{
		System.out.println("5-2");
	}
}
class class2
{
	public synchronized static void M1()
	{
		System.out.println("6-1");
		try {Thread.sleep(1000);} catch (Exception e) {}
		class1.M2();
	}
	public synchronized static void M2()
	{
		System.out.println("6-2");
	}
}
