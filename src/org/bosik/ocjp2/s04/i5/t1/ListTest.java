package org.bosik.ocjp2.s04.i5.t1;

import java.util.ArrayList;
import java.util.List;

public class ListTest
{
	public static void main(String[] args)
	{
		List<Object> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("org: " + list);

		List<Object> sublist = list.subList(2, 4);
		System.out.println("sub: " + sublist);
		list.add(2, 42);
		// list.clear();
		// list.set(2, -1);

		System.out.println("org: " + list);
		System.out.println("sub: " + sublist);

		// for (Iterator<Object> it = sublist.iterator(); it.hasNext();)
		// {
		// Object item = it.next();
		// System.out.println(item);
		// }
	}
}
