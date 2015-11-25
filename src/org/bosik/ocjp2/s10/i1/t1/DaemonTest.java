package org.bosik.ocjp2.s10.i1.t1;

public class DaemonTest
{
	public static void main(String[] args)
	{
		System.err.println("User thread started");

		Thread thread = new WorkerThread();
		// default is the same as parent thread's

		thread.setDaemon(false);

		thread.start();
		Utils.silentSleep(2250);

		System.err.println("User thread ended");
	}
}

class WorkerThread extends Thread
{
	@Override
	public void run()
	{
		System.err.println("\tUser thread #2 started");

		for (String s : new String[] { "I", "need", "to", "tell", "you", "something", "important" })
		{
			System.out.printf("\t%s%n", s);
			Utils.silentSleep(500);
		}

		System.err.println("\tUser thread #2 ended");
	}
}

class Utils
{
	public static void silentSleep(final int time)
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
