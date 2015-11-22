package org.bosik.ocjp2.s01.i1.t1;

public class DefaultConstructors
{

}

class A
{
	// public A() {} // added implicitly
}

class B
{
	/*** B() {} ***/

	private class InnerC
	{
		/*** private InnerC() {} ***/
	}

	class InnerD
	{
		/*** InnerD() {} ***/
	}

	protected class InnerE
	{
		/*** protected InnerE() {} ***/
	}

	public class InnerF
	{
		/*** public InnerF() {} ***/
	}

	private static class InnerSC
	{
		/*** private InnerSC() {} ***/
	}

	static class InnerSD
	{
		/*** InnerSD() {} ***/
	}

	protected static class InnerSE
	{
		/*** protected InnerSE() {} ***/
	}

	public static class InnerSF
	{
		/*** public InnerSF() {} ***/
	}
}
