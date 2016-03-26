package org.bosik.ocjp2.s11.i4.t4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Input
{
}

class Output
{
}

@SuppressWarnings({ "unused", "serial" })
class Task extends RecursiveTask<Output>
{
	private Input data;

	public Task(Input data)
	{
		this.data = data;
	}

	@Override
	protected Output compute()
	{
		// Here we can either:

		if (true)
		{
			// a) calculate value directly
			return new Output();
		}
		else
		{
			// b) share the work with another thread:
			Task newtask1 = new Task(data);
			Task newtask2 = new Task(data);
			newtask2.fork();
			Output result1 = newtask1.compute();
			Output result2 = newtask2.join();

			// so we can merge outputs somehow
			return new Output();
		}
	}
}

public class CommonTask
{
	public static void main(String[] args)
	{
		Input input = new Input();
		ForkJoinPool pool = new ForkJoinPool();
		Output output = pool.invoke(new Task(input));
	}
}
