package org.bosik.ocjp2.s01.i1.t1;

public class TestChangingVisibility
{
	class A
	{
		private void privateMethod()
		{
		}

		void defaultMethod()
		{
		}

		protected void protectedMethod()
		{
		}

		public void publicMethod()
		{
		}
	}

	class B extends A
	{
		@Override
		public void publicMethod()
		{
		}
	}
}
