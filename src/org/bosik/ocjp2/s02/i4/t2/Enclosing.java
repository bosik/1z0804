package org.bosik.ocjp2.s02.i4.t2;

class Enclosing
{
	static class StaticNested
	{
		{
			int a = staticField;
			// int b = instanceField; // CE
			int c = finalStaticField;
			// int d = finalInstanceField; // CE
		}
	}

	class NonStaticNested_aka_Inner
	{
		{
			int a = staticField;
			int b = instanceField;
			int c = finalStaticField;
			int d = finalInstanceField;
		}
	}

	{
		int auto = 1;
		final int finalAuto = 2;

		class LocalInner
		{
			{
				int a = staticField;
				int b = instanceField;
				int c = finalStaticField;
				int d = finalInstanceField;

				// int e = auto; // CE
				int f = finalAuto;
			}
		}

		new Object()
		{
			{
				int a = staticField;
				int b = instanceField;
				int c = finalStaticField;
				int d = finalInstanceField;

				// int e = auto; // CE
				int f = finalAuto;
			}
		};
	}

	private static int			staticField;
	private int					instanceField;
	private final static int	finalStaticField	= 3;	// must be initialized
	private final int			finalInstanceField	= 4;	// must be initialized
}
