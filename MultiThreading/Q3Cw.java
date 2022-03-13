package MultiThreading;
//Write a program to explain the concept of priorities of a thread. Also show how to set and get priorities of a thread.
public class Q3Cw 
{
	public static void main(String[] args) 
	{
		Priority1 P =new Priority1();
		P.setPriority(4);
		System.out.println(P.getPriority());
		priority2 p1=new priority2();
		p1.setPriority(10);
		System.out.println(p1.getPriority());
		P.start();
		p1.start();
	}
}
class Priority1 extends Thread
{
	public void run() 
	{
		System.out.println("Rajendra");
	}
}
class priority2 extends Thread
{
	public void run() 
	{
		System.out.println("Tushar");
	}
}
