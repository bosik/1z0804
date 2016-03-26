package org.bosik.ocjp2.s11.i4.t4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer>
{
	private static final long	serialVersionUID	= 1L;
	private static final int	THRESHOLD			= 2;

	private int[]				data;
	private int					from;
	private int					to;

	public SumTask(int[] data, int from, int to)
	{
		this.data = data;
		this.from = from;
		this.to = to;
	}

	public static int transform(int t)
	{
		hardsleep(100);
		return t;
	}

	private static void hardsleep(long time)
	{
		long end = System.nanoTime() + time * 1000000;
		while (System.nanoTime() < end)
		{
		}
	}

	@Override
	protected Integer compute()
	{
		int sum = 0;
		if (to - from < THRESHOLD)
		{
			for (int i = from; i <= to; i++)
			{
				sum = sum + transform(data[i]);
			}
		}
		else
		{
			int mid = (from + to) / 2;
			SumTask newtask1 = new SumTask(data, from, mid);
			SumTask newtask2 = new SumTask(data, mid + 1, to);

			// beautiful, but ends up having master thread just waiting for the slave threads:
			// newtask1.fork();
			// newtask2.fork();
			// sum = newtask1.join() + newtask2.join();

			// effective (note: fork() must be called before compute() )
			newtask2.fork();
			Integer result1 = newtask1.compute();
			Integer result2 = newtask2.join();
			sum = result1 + result2;
		}
		return sum;
	}

	// =========================================================================

	public static void main(String[] args)
	{
		double time = System.nanoTime();

		int size = 100;
		int data[] = new int[size];
		for (int i = 0; i < size; i++)
		{
			data[i] = i + 1;
		}

		ForkJoinPool pool = new ForkJoinPool();
		SumTask task = new SumTask(data, 0, size - 1);
		int sum = pool.invoke(task);

		System.out.printf("sum = %d; done in %.1f ms", sum, (System.nanoTime() - time) / 1000000);
	}
}
