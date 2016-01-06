package org.bosik.ocjp2.s04.i5.t1;

import java.util.ArrayList;
import java.util.List;

public class ExtendsTest
{
	public static void main(String[] args)
	{
		Integer n = new Integer(5);

		List<? extends Integer> listA = new ArrayList<>();
		listA.add(n); // CE: the method in not applicable: wrong capture
		n = listA.get(0); // ok

		// Actual signatures:
		// * add(null e) -- for input, use lower (strongest) bound; it's undefined, hence,
		// effectively, nothing except null can be added
		// * Integer get(int) -- for output, use upper (weakest) bound

		// =========================================================================

		List<? super Integer> listB = new ArrayList<>();
		listB.add(n); // ok
		n = listB.get(0); // CE: can't convert capture to Integer

		// Actual signatures:
		// * add(Integer) -- for input, use lower (strongest) bound
		// * Object get(int) -- for output, use upper (weakest) bound
	}
}
