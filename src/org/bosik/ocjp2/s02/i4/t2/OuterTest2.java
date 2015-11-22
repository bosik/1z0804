package org.bosik.ocjp2.s02.i4.t2;

class MyOuter
{
	class MyInner extends MyOuter
	{

	}
}

public class OuterTest2
{
	public static void main(String[] args)
	{
		new MyOuter().new MyInner();
	}
}
