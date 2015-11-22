package org.bosik.ocjp2.s05.i1.t4;

public class StringSearch
{
	public static void main(String[] args)
	{
		// ---------012345678901
		String s = "catcatcatcat";
		System.out.println(s.indexOf("cat"));
		System.out.println(s.indexOf("cat", 2));
		System.out.println(s.lastIndexOf("cat"));
		System.out.println("catcatcatcat".lastIndexOf("cat", 7)); // 6; 0, 1, 3, 9, 11, 5

		System.out.println(s.replace("cat", "catcat"));
	}
}
