package MultiThreading;

public class Synchronise {

	public static void main(String[] args) throws Exception 
	{
		abc t1=new abc();
		abc1 t2=new abc1();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(Addition.i);
	}
}
class  Addition 
{
	static int i=0;
	public synchronized static  void add()
	{
		i=i+1;
	}
}
class abc extends Thread
{
	public void run() 
	{
		for (int i = 0; i <100000; i++) 
		{
			Addition.add();
		}
	}
}
class abc1 extends Thread
{
	public void run() {
		for (int i = 0; i <100000; i++) 
		{
			Addition.add();
		}
	}
}
