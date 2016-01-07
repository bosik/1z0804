package org.bosik.ocjp2.s04.i5.t3;

import java.util.HashSet;
import java.util.Set;

public class SetsComparisonTest
{
	public static void main(String[] args)
	{
		Set<Data> s;

		s = new HashSet<>();
		s.add(new GoodHashGoodEquals("Foo"));
		s.add(new GoodHashGoodEquals("Foo"));
		s.add(new GoodHashGoodEquals("Bar"));
		System.out.println("Good hash, good equals: " + s);

		s = new HashSet<>();
		s.add(new BadHashGoodEquals("Foo"));
		s.add(new BadHashGoodEquals("Foo"));
		s.add(new BadHashGoodEquals("Bar"));
		System.out.println("Bad hash, good equals: " + s);

		s = new HashSet<>();
		s.add(new GoodHashBadEquals("Aa"));
		s.add(new GoodHashBadEquals("Aa")); // same hashcode
		s.add(new GoodHashBadEquals("BB")); // same hashcode
		s.add(new GoodHashBadEquals("CC"));
		System.out.println("Good hash, bad equals: " + s);

		s = new HashSet<>();
		s.add(new BadHashBadEquals("Foo"));
		s.add(new BadHashBadEquals("Foo"));
		s.add(new BadHashBadEquals("Bar"));
		System.out.println("Bad hash, bad equals: " + s);
	}
}
