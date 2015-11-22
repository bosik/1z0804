package org.bosik.misc;

interface Function
{
	double calculate(double x);
}

public class Tent
{
	private static double distance(double x1, double y1, double x2, double y2)
	{
		double dx = x1 - x2;
		double dy = y1 - y2;
		return Math.sqrt(dx * dx + dy * dy);
	}

	static double getL(Function f, double minX, double maxX)
	{
		final double DELTA = 0.0001;

		double prevY = f.calculate(minX);
		double summ = 0.0;
		for (double x = minX + DELTA; x <= maxX; x += DELTA)
		{
			double y = f.calculate(x);
			// Previous point: (x - DELTA, prevY)
			// Current point: (x, curY)
			summ += distance(x - DELTA, prevY, x, y);
			prevY = y;
		}

		return summ;
	}

	private static double solve(Function f, double y, double minX, double maxX)
	{
		final double DELTA = 0.001;

		if (f.calculate(minX) > y)
		{
			throw new IllegalArgumentException("Violated requirement: f(minX) = " + f.calculate(minX) + " > y = " + y);
		}
		if (f.calculate(maxX) < y)
		{
			throw new IllegalArgumentException("Violated requirement: f(maxX) = " + f.calculate(minX) + " < y = " + y);
		}

		double eps = 0.0;

		do
		{
			double curX = (minX + maxX) / 2;
			double curY = f.calculate(curX);
			eps = y - curY;
			if (eps > 0)
			{
				System.out.println("f(" + curX + ") = " + curY + " < " + y);
				minX = curX;
			}
			else
			{
				System.out.println("f(" + curX + ") = " + curY + " > " + y);
				maxX = curX;
			}
		}
		while (Math.abs(eps) > DELTA);

		return (minX + maxX) / 2;
	}

	public static void main(String[] args)
	{
		// final double a = 115.0;
		final double b = 143.5;
		final double l = 406.0;// 413.0;

		Function lengthFunc = new Function()
		{
			@Override
			public double calculate(final double a)
			{
				final Function tentCurve = new Function()
				{
					@Override
					public double calculate(double x)
					{
						double y1 = a * Math.sin((Math.PI * (x + b)) / (2.0 * b));
						double y2 = a * Math.sqrt(1.0 - (x * x) / (b * b));
						double avg = (y1 + y2) / 2.0;

						// System.out.println(x + "\t" + y1 + "\t" + y2);

						if (y1 > y2)
						{
							throw new RuntimeException("Oh no, " + y1 + " > " + y2 + "; x = " + x);
						}

						return avg;

					}
				};
				return getL(tentCurve, -b, +b);
			}
		};

		// System.out.println(lengthFunc.calculate(1.0));

		// sin: a = 141.0
		// ell: a = 121.0
		// avg: a = 170.7

		// a = 1, b = 1
		// L_sin: 2.9274
		// L_ell: 3.1415
		// L_avg: 2.68

		double height = solve(lengthFunc, l, 0, 500);
		System.out.print(height);

		// Function test = new Function()
		// {
		// @Override
		// public double calculate(double x)
		// {
		// return 0;
		// }
		// };
		//
		// System.out.println(getL(test, -100, +100));
		//
		// System.out.println(solve(test, 16.0, 0, 100));

		// 413 => 130
		// 409 => 127.9 (-2.1)
		// 406 => 125.8 (-2.1)
	}
}
