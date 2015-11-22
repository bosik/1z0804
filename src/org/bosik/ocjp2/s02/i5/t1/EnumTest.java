package org.bosik.ocjp2.s02.i5.t1;

class Enum2<T extends Enum2<T>>
{
	protected void compare(Enum2<T> another)
	{
		System.out.println(another.getClass().getSimpleName());
	}
}

class CustomEnum extends Enum2<CustomEnum>
{

}

class Son extends CustomEnum
{

}

enum ConstructorOrNot
{
	VALUE_NOTHING, VALUE_INT(0), VALUE_STRING("xxx");
	ConstructorOrNot()
	{
	}

	ConstructorOrNot(int x)
	{
	}

	ConstructorOrNot(String x)
	{
	}
}

enum StaticTest
{
	A, B, C;

	StaticTest()
	{
		System.out.println(staticNonFinal); // CE
		set(get() + 1);
		System.out.println(get()); // fine
		System.out.println(staticFinal); // fine
		System.out.println(instanceNonFinal); // fine
		System.out.println(instanceFinal); // fine
	}

	int					instanceNonFinal	= 1;
	final int			instanceFinal		= 2;
	static int			staticNonFinal		= 3;
	static final int	staticFinal			= 4;

	int get()
	{
		return staticNonFinal;
	}

	void set(int value)
	{
		staticNonFinal = value;
	}
}

enum MyEnum
{
	X, Y;

	// First: for each enum value called:

	// a) instance vars & init blocks as they declared

	int instVar1 = initInstance(1);

	{
		System.out.println("Instance init block #1: " + name());
	}

	int instVar2 = initInstance(2);

	{
		System.out.println("Instance init block #2: " + name());
	}

	// b) constructor

	MyEnum()
	{
		System.out.println("Constructor: " + name() + "\n" + getStaticVar1());
	}

	// Second: static vars & init blocks called as they go

	int getStaticVar1()
	{
		return staticVar1;
	}

	static
	{
		System.out.println("Static init block #1");
	}

	static int			staticVar1	= initStatic(1);
	static final int	staticVar2	= initStatic(2);

	static
	{
		System.out.println("Static init block #2");
	}

	private int initInstance(int n)
	{
		System.out.println("Instance vars init #" + n + ": " + name() + " - " + staticVar1);
		return 42;
	}

	private static int initStatic(int n)
	{
		System.out.println("Static vars init #" + n);
		return 42;
	}
}

public class EnumTest
{
	public static void main(String... args)
	{
		MyEnum a = MyEnum.X;
	}
}
