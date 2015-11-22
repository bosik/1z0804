package org.bosik.ocjp2.s01.i4.t1;

class Son1
{
}

class Son2
{
}

public class Casting
{
	public static void main(String[] args)
	{
		Son2 son2 = (Son2) new Son1();

		if (new Son1() instanceof Son2)
		{

		}
		Son2.class.isAssignableFrom(s1.getClass());
		Son2.class.isInstance(s1);
	}
}
