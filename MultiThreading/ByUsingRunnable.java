package MultiThreading;

public class ByUsingRunnable {

	public static void main(String[] args) 
	{
		RunnableThread t1=new RunnableThread();
		Thread t2=new Thread(t1);
		t2.start();
	}

}
