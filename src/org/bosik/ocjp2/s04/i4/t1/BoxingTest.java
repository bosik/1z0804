package org.bosik.ocjp2.s04.i4.t1;

public class BoxingTest
{
	static void check(Integer a, Integer b)
	{
		System.out.println(a == b);
	}

	public static void main(String... args)
	{
		check(127, 127);
		check(129, 128);

		long l = 42;
		check(l, l);

		// {-128, .., 127}
		Short x = (short) -129;
		Short y = (short) -129;
		System.out.println(x == y);
		// System.out.println(x.equals(y));
	}
}
