package org.bosik.ocjp2.s04.i5.t3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsOrderTest
{
	private static void test(Set<String> set)
	{
		set.add("5");
		set.add("4");
		set.add("3");
		set.add("2");
		set.add("1");
		System.out.println(set);
	}

	public static void main(String[] args)
	{
		test(new HashSet<String>());
		test(new TreeSet<String>());
		test(new LinkedHashSet<String>());
	}
}
