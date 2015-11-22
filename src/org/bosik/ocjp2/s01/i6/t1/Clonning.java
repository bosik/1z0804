package org.bosik.ocjp2.s01.i6.t1;

class A implements Cloneable
{
	int			x	= 1;
	final int	y	= 2;
	public int	i	= 10;

	public A createCopy() throws CloneNotSupportedException
	{
		return (A) clone();
	}
}

class B extends A
{
	public int i = 20;
}

public class Clonning
{
	public static void main(String... as) throws Exception
	{
		A a = new A();
		a.x = 42;
		A b = a.createCopy();
		System.out.println(b.x);
		System.out.println(b.y);

		B b1 = new B();
		// B b2 = (B)b1.clone();
		// System.out.println(b1==b2);
		System.out.println(new java.util.Date().getTime());
	}
}
