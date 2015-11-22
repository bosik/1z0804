package org.bosik.ocjp2.s04.i1.t1;

class Worker<T>
{
	public void perform(T x)
	{

	}
}

class Data
{
}

public class WildcardTest
{
	{
		Worker<? extends Data> worker = new Worker<Data>();
		worker.perform(new Data());
	}
}
