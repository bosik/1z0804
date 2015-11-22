package org.bosik.ocjp2.s02.i5.t1;

enum Currency
{
	UNKNOWN, USD
	{
		public String getStringCode()
		{
			return "United States dollar";
		}

		protected int getSomethingElse()
		{
			return 10;
		}

		public void cantCallMe()
		{
		}

		// static {} // CE

		{
			// OK
			System.out.println("Internal instance init block for " + name());
		}
	},
	UAH
	{
		public String getStringCode()
		{
			return "Ukrainian hryvnia";
		}

		{
			// OK
			System.out.println("Internal instance init block for " + name());
		}
	};

	public String getStringCode()
	{
		return "Unknown";
	}

	int getSomethingElse()
	{
		return 0;
	}

	{
		// OK
		System.out.println("Internal instance init block (base)");
	}
}

public class MethodsTest
{
	public static void main(String... xyz)
	{
		Currency c = Currency.UAH;
		System.out.println(c.getStringCode());
		System.out.println(c.getSomethingElse());

		// Currency.USD.cantCallMe(); // CE
	}
}
