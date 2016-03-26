package org.bosik.ocjp2.s04.i5.t3;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SubSetTest
{
	public static void main(String[] args)
	{
		TreeSet<Integer> set = new TreeSet<Integer>()
		{
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};

		NavigableSet<Integer> subSet = set.subSet(2, true, 4, true);
		subSet.remove(3);
		System.out.println(subSet); // ok, prints [2, 4]
		System.out.println(set); // prints [1, 2, 4, 5]

		subSet.add(5); // IllegalArgumentException: key out of range
	}
}
