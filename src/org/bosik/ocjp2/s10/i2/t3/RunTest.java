package org.bosik.ocjp2.s10.i2.t3;

public class RunTest
{
	public static volatile int counter = 0;

	static class RunnerDec implements Runnable
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 5000; i++)
			{
				counter--;
			}
		}
	}

	static class RunnerInc implements Runnable
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 5000; i++)
			{
				counter++;
			}
		}
	}

	public static void main(String[] args)
	{
		RunnerDec rd = new RunnerDec();
		RunnerInc ri = new RunnerInc();
		Thread t1 = new Thread(rd);
		Thread t2 = new Thread(ri);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(counter);
	}
}
