package org.bosik.ocjp2.s11.i2.t1;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest
{
	public static void main(String... args)
	{
		AtomicInteger n = new AtomicInteger(5);
		n.compareAndSet(6, 7);
		System.out.println(n);
	}
}
