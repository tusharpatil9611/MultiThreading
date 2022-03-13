package MultiThreading;

public class CumsumerProducer {

	public static void main(String[] args)
	{
		Shop shop=new Shop();
		consumer c=new consumer(shop);
		producer p=new producer(shop);
		c.start();
		p.start();
	}
}
class consumer extends Thread
{
	 Shop shop;
	 consumer(Shop shop) 
	{
		this.shop=shop;
	}
	public void run() 
	{
		while(true)
		{
			shop.consumer();
			try {Thread.sleep(100);} catch (Exception e) {}
		}
	}
}
class producer extends Thread
{
	 Shop shop;
	 producer(Shop shop) 
	{
		this.shop=shop;
	}
	public void run() 
	{
		while(true)
		{
			shop.producer();
			try {Thread.sleep(10);} catch (Exception e) {}
		}
	}
}
class Shop
{	
	int pen=1;
	public synchronized void consumer()
	{
		if(pen==0)
		{
			try {wait();} catch (Exception e) {}
		}
		pen--;
		System.out.println(pen);
		if(pen<10)
			notify();
	}
	public synchronized void producer()
	{
		if(pen>=100)
		{
			try {wait();} catch (Exception e) {}
		}
		pen++;
		System.out.println(pen);
		if(pen>10)
			notify();
	}
}