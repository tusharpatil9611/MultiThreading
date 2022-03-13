package MultiThreading;
//Write a program to create three threads using the Runnable interface and then running them concurrently 

public class Q2Cw {

	public static void main(String[] args) 
	{
		A1 a=new A1();
		Thread a1=new Thread(a);
		a1.start();
		B1 b=new B1();
		Thread b1=new Thread(b);
		b1.start();
		C1 c=new C1();
		Thread c1=new Thread(c);
		c1.start();
	}
}
	class A1 implements Runnable
	{
		public void run() 
		{
			try 
			{
				System.out.println(10/0);
			} 
			catch (Exception e) 
			{
				System.out.println("We connot Divide 10 by 0 ");
			}
		}
	}
	class B1 implements Runnable
	{
		public void run() 
		{
			for (int i = 0; i <=5; i++) 
			{
				for (int j = 0; j <=5; j++) 
				{
					if(j+i>=5)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	class C1 implements Runnable
	{
		public void run() 
		{
			System.out.println("End");
		}
	}