package org.bosik.ocjp2.s01.i4.t1;

class A
{
}

class B extends A
{
}

class C extends B
{
}

class D extends C
{
}

class E extends D
{
}

class F extends E
{
}

class G extends F
{
}

class H extends G
{
}

class I extends H
{
}

class J extends I
{
}

class K extends J
{
}

class L extends K
{
}

class M extends L
{
}

class N extends M
{
}

class O extends N
{
}

class P extends O
{
}

class Q extends P
{
}

class R extends Q
{
}

class S extends R
{
}

class T extends S
{
}

class U extends T
{
}

class V extends U
{
}

class W extends V
{
}

class X extends W
{
}

class Y extends X
{
}

class Z extends Y
{
}

public class InstanceTest
{
	public static void main(String... args)
	{
		test(new Z());
	}

	private static void test(A a)
	{
		long t;
		final long N = 8000000000L;

		System.out.println(null instanceof Z);

		// warm-up
		for (long i = 0; i < N; i++)
		{
		}

		t = System.currentTimeMillis();
		for (long i = 0; i < N; i++)
		{
		}
		System.out.println("Empty loop: " + (System.currentTimeMillis() - t));

		// double k = 1000000000;
		// t = System.currentTimeMillis();
		// for (long i = 0; i < N; i++)
		// {
		// k = k / 2;
		// }
		// System.out.println("/: " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		for (long i = 0; i < N; i++)
		{
			if (a instanceof Z)
			{
			}
		}
		System.out.println("a instanceof Z: " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		for (long i = 0; i < N; i++)
		{
			if (Z.class.isInstance(a))
			{
			}
		}
		System.out.println("Z.class.isInstance(a): " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		for (long i = 0; i < N; i++)
		{
			if (Z.class.isAssignableFrom(a.getClass()))
			{
			}
		}
		System.out.println("Z.class.isAssignableFrom(a.getClass()): " + (System.currentTimeMillis() - t));

		// System.out.println(a instanceof B);
		// System.out.println(B.class.isInstance(a));
		// System.out.println(B.class.isAssignableFrom(a.getClass()));
	}
}
