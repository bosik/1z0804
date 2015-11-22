package org.bosik.misc;

public class EnvTest
{
	public static void main(String[] args)
	{
		String key = "ANDROID_HOME";
		String val = System.getenv(key);
		System.out.println(val);
	}
}
