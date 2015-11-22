package org.bosik.ocjp2.s01.i3.t1;

interface I1
{
}

interface I2
{
}

class A implements I1, I2
{
}

class B extends A
{
}

public class OverloadTest
{
	void work(I1 x)
	{
	}

	void work(I2 x)
	{
	}

	// void work(A x)
	// {
	// }
	//
	void work(B x)
	{
	}

	{
		A x = new B();
		work(x);
	}
}
