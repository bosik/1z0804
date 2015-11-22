package org.bosik.ocjp2.s01.i2.t2;

class A
{
}

class B extends A
{
}

class C extends B
{
}

interface I1
{
}

interface I2
{
}

class X implements I1, I2
{
};

public class OverloadingTest
{
	private static void work(byte x)
	{
		System.out.println("byte");
	}

	private static void work(short x)
	{
		System.out.println("short");
	}

	// private static void work(char x) { System.out.println("char"); }
	// private static void work(int x) { System.out.println("int"); }
	// private static void work(long x) { System.out.println("long"); }
	// private static void work(float x) { System.out.println("float"); }
	// private static void work(double x) { System.out.println("double"); }
	private static void two(long x, double y)
	{
		System.out.println("long, double");
	}

	private static void two(double x, long y)
	{
		System.out.println("double, long");
	}

	private static void w(A a)
	{
		System.out.println("A");
	}

	private static void w(B b)
	{
		System.out.println("B");
	}

	private static void w(C c)
	{
		System.out.println("C");
	}
	// private static void x(I1 i1) {}
	// private static void x(I2 i2) {}

	public static void main(String... args)
	{
		byte _byte = 0;
		short _short = 0;
		char _char = 0;
		int _int = 0;
		long _long = 0L;
		float _float = 0f;
		double _double = 0;

		// work(_byte);
		// work(_short);
		// work(_char);
		// work(_int);
		// work(_long);
		// work(_float);
		// work(_double);
		// work(16d);
		// work(36.6);

		w((A) new C());
		// x(new X());
		System.out.println(017 == 15);
	}
}
