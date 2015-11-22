package org.bosik.ocjp2.s05.i3.t2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest
{
	private static void test(Date date, String pattern)
	{
		SimpleDateFormat f = new SimpleDateFormat(pattern);
		System.out.println(f.toPattern() + "\t" + f.format(date));
	}

	public static void main(String... args)
	{
		// System.out.println(String.format("%f", 0));
		System.out.printf("%1$s %s %<s %s%n", "A", "B", "C", "D");

		// Date date = new Date(2015 - 1900, 10, 22, 0, 30, 0);
		// System.out.println(date);
		// test(date, "MMMM");
		// test(date, "H");
		// test(date, "h");
		// test(date, "K");
		// test(date, "k");
		// test(date, "X");
		// test(date, "XX");
		// test(date, "XXXX");
		// test(date, "z");
		// test(date, "zz");
		// test(date, "zzz");
		// test(date, "zzzz");
		// test(date, "Z");
		// test(date, "ZZ");
		// test(date, "ZZZ");
		// test(date, "ZZZZ");
		// test(date, "yy");
		// test(date, "YY");

		System.out.format("%b%n", false);
		System.out.format("%-5s%n", "xx");
	}
}
