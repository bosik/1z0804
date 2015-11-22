package org.bosik.ocjp2.s10.i3.t3;

public class WaitTest
{
	public static void main(String... args)
	{
		final Object x = new Object();

		new Thread()
		{
			public void run()
			{
				synchronized (x)
				{
					System.out.println("Thread A entered X sync block");
					try
					{
						System.out.println("Thread A waiting...");
						x.wait();
						System.out.println("Thread A notified");
					}
					catch (InterruptedException e)
					{
					}
				}
				System.out.println("Thread A released X sync block");
			};
		}.start();

		new Thread()
		{
			public void run()
			{
				safeSleep(1000);

				synchronized (x)
				{
					System.out.println("\t\tThread B entered X sync block");
					safeSleep(500);
					x.notify();
					System.out.println("\t\tThread B notified X");
					System.out.println("\t\tThread B still in the X sync block");
					safeSleep(1000);
					System.out.println("\t\tThread B still in the X sync block");
					safeSleep(1000);
					System.out.println("\t\tThread B still in the X sync block");
					safeSleep(1000);
				}
				System.out.println("\t\tThread B released X sync block");
			};
		}.start();

	}

	static void safeSleep(long time)
	{
		try
		{
			Thread.sleep(time);
		}
		catch (InterruptedException e)
		{
		}
	}
}
