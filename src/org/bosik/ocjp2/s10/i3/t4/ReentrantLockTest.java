package org.bosik.ocjp2.s10.i3.t4;

public class ReentrantLockTest
{
	final static Object lock = new Object();

	static void s(long time)
	{
		try
		{
			Thread.sleep(time);
		}
		catch (InterruptedException e)
		{
		}
	}

	public static void main(String[] args)
	{
		new Thread()
		{
			@Override
			public void run()
			{
				s(1000);

				System.out.println("T2: Waiting for lock");
				synchronized (lock)
				{
					System.out.println("T2: External lock aquired");
					synchronized (lock)
					{
					}
					s(10000);
					System.out.println("T2: External lock released");
				}
			}
		}.start();

		for (int i = 0; i < 200; i++)
		{
			synchronized (lock)
			{
				System.out.println("\tT1: Tick");
				s(200);
			}
			s(50);
		}

	}
}
