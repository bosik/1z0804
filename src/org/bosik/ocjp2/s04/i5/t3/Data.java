package org.bosik.ocjp2.s04.i5.t3;

class Data
{
	public String name;

	public Data(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		return true;
	}
}

class BadHashBadEquals extends Data
{
	/**
	 * <ul>
	 * <li><code>hashCode()</code>: always returns 0</li>
	 * <li><code>equals(...)</code>: always returns <code>true</code></li>
	 * </ul>
	 * Hash code-equals contract: RESPECTED.
	 */
	public BadHashBadEquals(String name)
	{
		super(name);
	}

	@Override
	public int hashCode()
	{
		return 0;
	}

	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
}

class GoodHashBadEquals extends Data
{
	/**
	 * <ul>
	 * <li><code>hashCode()</code>: returns value based on data</li>
	 * <li><code>equals(...)</code>: always returns <code>true</code></li>
	 * </ul>
	 * Hash code-equals contract: VIOLATED.
	 */
	public GoodHashBadEquals(String name)
	{
		super(name);
	}

	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
}

class BadHashGoodEquals extends Data
{
	/**
	 * <ul>
	 * <li><code>hashCode()</code>: always returns 0</li>
	 * <li><code>equals(...)</code>: compares data properly</li>
	 * </ul>
	 * Hash code-equals contract: RESPECTED.
	 */
	public BadHashGoodEquals(String name)
	{
		super(name);
	}

	@Override
	public int hashCode()
	{
		return 0;
	}
}

class GoodHashGoodEquals extends Data
{
	/**
	 * <ul>
	 * <li><code>hashCode()</code>: returns value based on data</li>
	 * <li><code>equals(...)</code>: compares data properly</li>
	 * </ul>
	 * Hash code-equals contract: RESPECTED.
	 */
	public GoodHashGoodEquals(String name)
	{
		super(name);
	}
}