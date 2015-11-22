package org.bosik.ocjp2.s04.i8.t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();

		Collections.addAll(list, 1, 2, 3, 4, 5, 6);
		Collections.shuffle(list);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		// Collections.shuffle(list);
		System.out.println(list);
		int index = Collections.binarySearch(list, 9);
		System.out.println(index);
	}
}
