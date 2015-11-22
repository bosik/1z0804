package org.bosik.ocjp2.s01.i4.t1;

class Base1
{
}

class Base2
{
}

class Child1 extends Base1
{
}

public class Test_instanceof
{
	public void test1()
	{
		Child1 c = new Child1();

		// Compiles with warning
		if (new Child1() instanceof Object || c instanceof Child1)
		{
			System.out.println("c instanceof Base1 == true");
		}
		else
		{
			// Actually dead, but no warnings about this
			System.out.println("c instanceof Base1 == false");
		}

		// Compilation error
		if (c instanceof Base2)
		{
			System.out.println("c instanceof Base2 == true");
		}
	}
}
