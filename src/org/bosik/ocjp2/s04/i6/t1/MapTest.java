package org.bosik.ocjp2.s04.i6.t1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MapTest
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key4", "value3");
		map.put("key5", null);
		map.put(null, "value3");

		System.out.println(map);

		// map.keySet().remove("key1");
		// System.out.println(map);
		//
		// map.values().remove("value3");
		// System.out.println(map);
		//
		// map.values().remove("value3");
		// System.out.println(map);

		// map.entrySet().clear();
		// System.out.println(map);

		ConcurrentMap<String, String> map2 = new ConcurrentHashMap<>();
		String temp;
		temp = map2.putIfAbsent("key", "value1");
		System.out.println(temp);
		temp = map2.putIfAbsent("key", "value2");
		System.out.println(temp);

	}
}
