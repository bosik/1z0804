package org.bosik.ocjp2.s08.i1.t2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest
{
	public static void main(String... args)
	{
		Path p1 = Paths.get("\\photos\\vacation");
		Path p2 = Paths.get("\\yellowstone");
		System.out.println(p1.resolve(p2) + "  " + p1.relativize(p2));

		Path p = Paths.get("c:\\code\\java\\PathTest.java");

		System.out.println(p.getRoot());
		System.out.println(p.getName(0));
		System.out.println(p.getName(1));
		System.out.println(p.getName(2));
		System.out.println(p.getName(3));
	}
}
