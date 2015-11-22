package org.bosik.ocjp2.s04.i7.t2;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest
{
	public static void main(String[] args)
	{
		SortedMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("c", 11);
		map.put("b", 9);
		map.put("a", 10);
		// System.out.println(map.subMap("b", "a"));
		System.out.println(map.comparator());
	}
}
