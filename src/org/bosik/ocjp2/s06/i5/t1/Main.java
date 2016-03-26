package org.bosik.ocjp2.s06.i5.t1;

import org.bosik.ocjp2.s06.i5.t1.critical.FailFast;
import org.bosik.ocjp2.s06.i5.t1.safe.FailSoft;

public class Main
{
	public static void main(String[] args)
	{
		FailSoft.work();
		FailFast.work();
		assert false : "Main assert fired!";

		System.out.println("No assertions fired");
	}
}
