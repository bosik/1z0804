package org.bosik.ocjp2.s02.i4.t2;

public class InnerTest
{
	class TheInner
	{
		// CE: The field x cannot be declared static in a non-static inner type, unless initialized
		// with a constant expression
		static int			x	= 2;

		static final int	y	= 2;	// compiles fine

		// CE: The method cannot be declared static; static methods can only be declared in a static
		// or top level type
		static void method()
		{
		}
	}
}
