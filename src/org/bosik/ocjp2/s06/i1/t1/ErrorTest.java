package org.bosik.ocjp2.s06.i1.t1;

public class ErrorTest
{
	public static void main(String... args)
	{
		try
		{
			m1();
		}
		catch (Error e)
		{
			System.out.println("haha");
		}

		try
		{
			System.out.println("Started");
			System.exit(1);
			// throw new Exception();
		}
		// catch (Throwable t)
		// {
		// System.out.println("Caught: " + t);
		// }
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("Finished");
	}

	private static void m1()
	{
		m2();
	}

	private static void m2()
	{
		assert false;
	}

}
