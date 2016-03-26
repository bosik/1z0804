package org.bosik.ocjp2.s05.i2.t1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest
{
	public static void main(String... args)
	{
		// Pattern p = Pattern.compile("кошка", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
		// System.out.println(p.matcher("КОШКА").matches());
		// System.out.println(Pattern.matches("Ко(?iu)шка", "КОШКА"));

		Pattern p = Pattern.compile("\\d");
		String[] items = p.split("cat2dog8hamster");
		// System.out.println(items);

		// ==============================================

		test("a.*b", "a1b234b");
	}

	static void test(String pattern, String s)
	{
		Matcher m = Pattern.compile(pattern).matcher(s);
		while (m.find())
		{
			System.out.println(m.group(0));
		}
	}
}
