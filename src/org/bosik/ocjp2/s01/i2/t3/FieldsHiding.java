package org.bosik.ocjp2.s01.i2.t3;

class X
{
	protected int f = 1;

	public void test()
	{
		System.out.println(f);
	}
}

class Y extends X
{
	protected int f = 2;

	// public void test()
	// {
	// System.out.println(f);
	// }
}

public class FieldsHiding
{
	public static void main(String... args)
	{
		new X().test();
		new Y().test();
		((X) new Y()).test();
	}
}
