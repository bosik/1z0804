package org.bosik.ocjp2.s10.i3.t1;

public class SyncRecursionTest
{
	public synchronized int fact(int x)
	{
		return x > 1 ? x * fact(x - 1) : 1;
	}

	public static void main(String[] args)
	{
		SyncRecursionTest test = new SyncRecursionTest();
		int n = test.fact(5);
		System.out.println(n);

		/**
		 * Works OK: synchronized prevents *different* threads to enter the same method at the same
		 * time, but once thread acquired the lock, it can re-enter synchronized methods as much as
		 * it wants
		 */
	}
}
