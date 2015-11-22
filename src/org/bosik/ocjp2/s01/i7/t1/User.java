package org.bosik.ocjp2.s01.i7.t1;

import java.util.ArrayList;
import java.util.List;

abstract class W
{
	public Integer i = 2;
	// public abstract void work();
}

interface RT
{
	Integer			x		= 2;
	List<String>	list	= new ArrayList<String>();
}

public class User
{
	private static final int x = 3;

	// static {
	// x = 3;
	// }
	User()
	{
		try
		{
			System.out.println("constr-r");
		}
		catch (RuntimeException | Error e)
		{
			e = null;
		}
	}

	static final void correct()
	{
	} // OK

	public static void main(String... xyz)
	{
		final int x;
		x = 3;

	}
}
