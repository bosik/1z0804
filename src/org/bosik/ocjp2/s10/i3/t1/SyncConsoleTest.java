package org.bosik.ocjp2.s10.i3.t1;

class X
{
	public void a()
	{
		synchronized (this)
		{
			while (true)
			{
				System.out.println("a works");
			}
		}
	}

	public void b()
	{
		synchronized (this)
		{
			while (true)
			{
				System.out.println("b works");
			}
		}
	}
}

public class SyncConsoleTest
{
	public static void main(String... args)
	{
		final X x = new X();

		new Thread()
		{
			public void run()
			{
				x.a();
			};
		}.start();

		new Thread()
		{
			public void run()
			{
				x.b();
			};
		}.start();
	}
}
