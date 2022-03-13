package MultiThreading;
//Write a program to create 2 threads by extending the thread class and then run them concurrently

public class Q1Cw {

	public static void main(String[] args) 
	{
		A obj =new A();
		B obj1= new B();
		obj.start();
		obj1.start();
	}
}
	class A extends Thread
	{
		public void run() 
		{
				for (int i = 0; i <10; i++) 
				{
					System.out.println("Hi");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) 
					{}
				}
		}
	}
	class B extends Thread
	{
		public void run() 
		{
			for (int i = 0; i <10; i++) {
				System.out.println("Hello");
			}
		}
	}


