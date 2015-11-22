package org.bosik.ocjp2.s05.i1.t3;

import java.util.StringTokenizer;

public class TokenizerTest
{
	public static void main(String... args)
	{
		StringTokenizer st = new StringTokenizer("    this  is  a         test  ");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
