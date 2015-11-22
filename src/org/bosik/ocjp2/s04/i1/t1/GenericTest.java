package org.bosik.ocjp2.s04.i1.t1;

import java.util.ArrayList;
import java.util.List;

class Box<T>
{
	private T content;

	public void put(T content)
	{
		this.content = content;
		System.out.println("Put:" + this.content.getClass());
	}

	public T get()
	{
		return content;
	}
}

class MyClass
{
}

interface MyInterface
{
}

class A<T extends MyClass>
{
}

class B<T extends MyInterface>
{
}

class Tricky<Z extends Y, Y extends X, X>
{
}

class Useless<$>
{
}

interface I1
{
}

interface I2
{
}

interface I3
{
}

class Multiple<I extends I1 & I2 & I3, T extends MyClass>
{
}

public class GenericTest
{
	public <N> void genericMethod(N n)
	{
		System.out.println(n);
	}

	public static void main(String[] args)
	{
		Box<String> box = new Box();
		box.put("something");
		box.put(42);
		System.out.println(box.get());

		List m = new ArrayList<String>();
		m.add(42);
		// this.<String> genericMethod("");
	}
}
