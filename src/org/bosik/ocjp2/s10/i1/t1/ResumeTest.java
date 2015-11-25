package org.bosik.ocjp2.s10.i1.t1;

public class ResumeTest
{
	public static void main(String[] args)
	{
		new MyThread().resume(); // does nothing

		// test1();
		// test2();
		test3();
	}

	/**
	 * Works as expected
	 */
	static void test1()
	{
		Thread t = new MyThread();
		t.start();
		Utils.silentSleep(2500);

		t.suspend();
		System.out.println("Thread suspended");
		Utils.silentSleep(2500);

		System.out.println("Thread resumed");
		t.resume();
	}

	/**
	 * Works as expected
	 */
	static void test2()
	{
		Thread t = new MyThread();
		t.start();
		Utils.silentSleep(2000); // time changed

		System.out.println("Thread suspended"); // reordered
		t.suspend(); // reordered
		Utils.silentSleep(2500);

		System.out.println("Thread resumed");
		t.resume();
	}

	/**
	 * Causes deadlock
	 */
	static void test3()
	{
		Thread t = new MyThread();
		t.start();
		Utils.silentSleep(2000);

		t.suspend();
		System.out.println("Thread suspended");
		Utils.silentSleep(2500);

		System.out.println("Thread resumed");
		t.resume();
	}
}

/**
 * Counts from 1 to 10
 */
class MyThread extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Hello from the thread, part " + (i + 1));
			Utils.silentSleep(1000);
		}
	}
}
