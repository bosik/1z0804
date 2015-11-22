package org.bosik.ocjp2.s06.i5.t1;

public class AssertTest
{
	public static void main(String... args)
	{
		// Java has 8 primitive types:
		boolean x1 = true;
		byte x2 = -1;
		char x3 = (char) -1;
		short x4 = -1;
		int x5 = -1;
		long x6 = -1;
		float x7 = -1;
		double x8 = -1;

		// All primitive types are permitted in assertions:
		assert true : x1;
		assert true : x2;
		assert true : x3;
		assert true : x4;
		assert true : x5;
		assert true : x6;
		assert true : x7;
		assert true : x8;

		// ..as all appropriative AssetionError constructors are there:
		new AssertionError(x1);
		new AssertionError(x2);
		new AssertionError(x3);
		new AssertionError(x4);
		new AssertionError(x5);
		new AssertionError(x6);
		new AssertionError(x7);
		new AssertionError(x8);
	}
}
