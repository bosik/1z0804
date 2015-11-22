package org.bosik.ocjp2.s03.i1.t1;

interface X
{
	int n = 1;
}

interface Y
{
	int n = 2;
}

class A implements X, Y
{
	// int n = 3;
	{
		System.out.println(n);
	}
}
