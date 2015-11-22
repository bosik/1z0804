package org.bosik.ocjp2.s01.i2.t1;

class Animal
{
	public int field = 1;

	public static void testClassMethod()
	{
		System.out.println("Static - Animal");
	}

	public void testInstanceMethod()
	{
		System.out.println("Instance - Animal");
	}

	public void getField()
	{
		System.out.println(field);
	}
}

public class Cat extends Animal
{
	public int field = 2;

	public static void testClassMethod()
	{
		System.out.println("Static - Cat");
	}

	@Override
	public void testInstanceMethod()
	{
		System.out.println("Instance - Cat");
	}

	public static void main(String[] args)
	{
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		myAnimal.testClassMethod();
		myAnimal.testInstanceMethod();

		int n = 0;
		n += 0.2f;

		myAnimal.getField();
		myCat.getField();
	}
}
