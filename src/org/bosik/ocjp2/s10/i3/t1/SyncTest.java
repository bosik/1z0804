package org.bosik.ocjp2.s10.i3.t1;

class W
{
	W w = new W();
}

class Test
{
	private Object	m1	= new Object();
	private Object	m2	= new Object();

	private static void sleep(long time)
	{
		try
		{
			Thread.sleep(time);
		}
		catch (InterruptedException e)
		{
		}
	}

	public/* synchronized */void a()
	{
		synchronized (m1)
		{
			System.out.println("a started");
			sleep(100);
			synchronized (m2)
			{
				System.out.println("a finished");
			}
		}
	}

	public/* synchronized */void b()
	{
		synchronized (m2)
		{
			System.out.println("b started");
			sleep(100);
			synchronized (m1)
			{
				System.out.println("b finished");
			}
		}
	}
}

public class SyncTest
{
	public static void main(String... args)
	{
		final Test x = new Test();

		final Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				x.a();
			}
		};

		final Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				x.b();
			}
		};

		t1.start();
		t2.start();
	}
}
