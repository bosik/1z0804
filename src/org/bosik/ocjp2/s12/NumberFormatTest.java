package org.bosik.ocjp2.s12;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatTest
{
	public static void main(String... args)
	{
		double x = 12345.123;
		String s = NumberFormat.getInstance().format(x);
		try
		{
			x = (double) NumberFormat.getInstance().parse(s);
		}
		catch (ParseException e)
		{
		}
		System.out.println(x);
	}
}
