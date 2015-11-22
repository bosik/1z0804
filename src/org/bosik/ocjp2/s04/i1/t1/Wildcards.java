package org.bosik.ocjp2.s04.i1.t1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcards
{
	public static <E extends CharSequence> List<? super E> doIt(List<E> nums)
	{
		return null;
	}

	{
		ArrayList<String> in = null;
		List<?> result = doIt(in);
	}

	private void work(List<? extends Number> list)
	{
		// list.add(new Integer(1));
		// list.add(new Double(1));
	}

	{
		work(new ArrayList<Integer>());
		work(new ArrayList<Double>());

		List<String> list = new ArrayList<>();
		processCollection(list);
	}

	static void foo(List<?> list)
	{
		fooHelper(list);
	}

	private static <T> void fooHelper(List<T> list)
	{
		list.set(0, list.get(0));
	}

	private static <T> void processCollection(Collection<T> c)
	{

	}

}
