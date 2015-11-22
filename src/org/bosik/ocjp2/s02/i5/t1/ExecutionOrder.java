package org.bosik.ocjp2.s02.i5.t1;

enum BrainerEnum
{
	A, B
	{
		int x = build();

		private int build()
		{
			System.out.println("x initialized"); // 5(B)
			return 7;
		}

		{
			System.out.println("Instance init (internal): " + name()); // 6(B)
		}
	},
	C
	{
		{
			System.out.println("Instance init (internal): " + name()); // 9(C)
		}
	};

	{
		System.out.println("Instance init (base): " + name()); // 1(A), 3(B), 7(C)
	}

	BrainerEnum()
	{
		System.out.println("Constructor: " + name()); // 2(A), 4(B), 8(C)
	}

	static
	{
		System.out.println("Static init (base)"); // 10
	}
}

public class ExecutionOrder
{
	public static void main(String[] args)
	{
		BrainerEnum n = BrainerEnum.A;
	}
}
