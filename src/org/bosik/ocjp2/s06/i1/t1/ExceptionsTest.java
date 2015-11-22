package org.bosik.ocjp2.s06.i1.t1;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent
{
	public Parent() throws FileNotFoundException
	{

	}

	void testChecked() throws IOException
	{

	};

	void testUnchecked() throws NullPointerException
	{

	}
}

class A extends Parent
{
	public A() throws IOException
	{
		super();
	}

	@Override
	void testChecked() throws FileNotFoundException // checked exceptions may be narrowed/specified
													// only
	{

	}

	@Override
	void testUnchecked() throws RuntimeException // unchecked exceptions may be widened OK
	{

	}
}

class FinalTest
{
	static int getVal()
	{
		System.out.println("getVal()");
		return 42;
	}

	/**/static final int x = getVal();

	/**/static
	{
		System.out.println("Static block");
	}

	/**/static final int	y	= getVal();
	static int				z;

	static final void correct()
	{
	}
}

class ExceptionsTest
{
	class A
	{
		A()
		{
		}

		void A(int x)
		{
		}
	}

	public int Test()
	{
		return 0;
	}

	// static void mathTest()
	// {
	// int x = 10, y = 2____0;
	// int dx, dy;
	// try
	// {
	// dx = x % 5;
	// dy = y / dx;
	// }
	// catch (ArithmeticException ae)
	// {
	// System.out.println("Caught AE");
	// dx = 2;
	// dy = y / dx;
	// }
	// x = x / dx;
	// y = y / dy;
	// System.out.println(dx + " " + dy);
	// System.out.println(x + " " + y);
	// }

	class A1
	{
		public void a()
		{
		};
	}

	class B extends A
	{
		public void a()
		{
		};
	}

	enum Gender
	{
		MALE, FEMALE
	}

	public static void main(String[] args)
	{
		// Game g = new Soccer();
		// g.play();
		// int i = 1;
		// i = ~~i;
		// System.out.println(i);

		// int k = 1;
		// k += 3 + ++k;
		// System.out.println(k);

		// boolean b = true & false;
		// System.out.println(b);
		// System.out.println('a' + 1);
		// System.out.println(5 / 4);

		// MARK:
		// {
		// break MARK;
		// }
		//
		// double c = ('0' == 48 ? 1 : 2);
		// System.out.println(c);
		//
		// String str;
		// Gender i = Gender.FEMALE;
		// switch (i)
		// {
		// case MALE:
		// str = "Zero";
		// break;
		// case FEMALE:
		// str = "Two";
		// break;
		// // default: str = "Else"; break;
		// }

		// System.out.println(str);

		// int[] m = new int[1];
		// int k = m[0]; // ok, assigned 0

		// System.out.println("Args: " + args.length);
		// A a = new A();
		// a.perform();

		// double f = .5;

		// String s1 = new String("x");
		// String s2 = new String("x");
		// String s1 = "x";
		// String s2 = "x";
		// System.out.println(s1.equals(s2));

		// System.arraycopy(src, srcPos, dest, destPos, length);
		// int i = 42;
		// String s = String.valueOf(i);
		// int j = Integer.parseInt(s);
		// System.out.println(j);

		// A a = new A();
		// B b = new B();
		// if (a instanceof A)
		// {
		// }
		// if (a instanceof B)
		// {
		// }
		// if (b instanceof A)
		// {
		// }
		// if (b instanceof B)
		// {
		// }
		// String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday",
		// "sunday" };
		// int index = 0;
		// for (String day : days)
		// {
		// if (index == 3)
		// {
		// break;
		// }
		// else
		// {
		// continue;
		// }
		// index++;
		// if (days[index].length() > 3)
		// {
		// days[index] = day.substring(0, 3);
		// }
		// }
		// List<Object> x = new ArrayList<Object>();
		// x.add("a");
		// x.add("b");
		// x.add("c");
		// x.add(x);
		// System.out.println(x.toString());

		// StringBuilder sb = new StringBuilder();
		// sb.delete(start, end)
		// int i = 2;
		// switch (i)
		// {
		// default:
		// break;
		// case 0:
		// break;
		// case 1:
		// break;
		// }
		// Map map = new HashMap();
		// FinalTest f = new FinalTest();
		// new Test();

		try
		{
			System.out.println("Try executed");
			System.exit(0);
		}
		finally
		{
			System.out.println("Finally executed");
		}
	}

	static
	{
		System.out.println("Static init block called");
	}

	static int var = staticGetter();

	static int staticGetter()
	{
		System.out.println("Static variable initiated");
		return 42;
	}

	{
		System.out.println("Member init section 1 called");
	}

	{
		System.out.println("Member init section 2 called");
	}

	public ExceptionsTest()
	{
		System.out.println("Constructor called");
	}

	static class StaticClass
	{
		static int X = 2;

		static class StaticClass2
		{
			static int Y = 3;
		}
	}
}