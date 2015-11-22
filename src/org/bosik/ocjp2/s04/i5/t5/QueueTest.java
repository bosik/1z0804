package org.bosik.ocjp2.s04.i5.t5;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new PriorityQueue<>();
		q.add(5);
		q.add(4);
		q.add(7);
		q.add(6);

		while (!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
