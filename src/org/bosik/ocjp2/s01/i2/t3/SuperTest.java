package org.bosik.ocjp2.s01.i2.t3;

class A
{
	public void work()
	{
		System.out.println("A");
	}
}

class B extends A
{
	public void work()
	{
		System.out.println("B");
	}

	public void test()
	{
		work();
		super.work();
	}
}

class C extends B
{
	public void work()
	{
		System.out.println("C");
	}
}

public class SuperTest
{
	public static void main(String[] args)
	{
		B c = new C();
		c.test();
	}
}
