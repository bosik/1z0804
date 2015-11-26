package org.bosik.ocjp2.s11.i1.t1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest
{
	public static void main(String... args)
	{
		List<String> list = new CopyOnWriteArrayList<>(); // hi diamond!
		list.add("one");
		list.add("two");

		Iterator<String> iter = list.iterator();
		iter.remove();
	}
}
