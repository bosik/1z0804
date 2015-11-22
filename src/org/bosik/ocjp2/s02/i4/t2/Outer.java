package org.bosik.ocjp2.s02.i4.t2;

public class Outer
{
	private static int	privateStaticVar;
	private int			privateInstanceVar;

	public Outer()
	{
	}

	class Inner
	{
		public Inner()
		{
		}

		{
			privateStaticVar++;
			privateInstanceVar++;
		}

		void m(int r)
		{

		}

		class Inner2
		{
		}
	}

	static class StaticNested
	{
		// {
		// privateStaticVar++;
		// privateInstanceVar++; // CE: Cannot make a static reference to the non-static field
		// }
		static class Inner3
		{
			static class Inner4
			{
			}

			class Inner5
			{
			}

		}
	}

	{
		int variable;

		class Local
		{
			{
				// System.out.println(variable); // CE: Cannot refer to the non-final local variable
			}
		}
	}
}
