package org.bosik.ocjp2.s02.i4.t2;

public class OuterClass
{
	public class Inner
	{
	}

	public static class StaticNested
	{
	}

	public void useClasses()
	{
		/**
		 * To instantiate Inner, we need instance of Outer first:
		 */

		// ...can use "this" instance... (next two options are equal!)
		new OuterClass.Inner();
		new Inner();
		// ...or create new one...
		new OuterClass().new Inner();

		/**
		 * To instantiate StaticNested, we need an Outer class only
		 */
		new OuterClass.StaticNested();
		new StaticNested();

		// note: using instance is prohibited:
		new OuterClass().new StaticNested(); // CE
	}
}
