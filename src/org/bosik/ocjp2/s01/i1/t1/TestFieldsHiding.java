package org.bosik.ocjp2.s01.i1.t1;

class ClassA
{
	public int			instance1;
	public int			instance2;
	public static int	class1;
	public static int	class2;
}

class ClassB extends ClassA
{
	public int			instance1;
	public static int	instance2;
	public int			class1;
	public static int	class2;
}

public class TestFieldsHiding
{
	class ClassA
	{
		public int				instance1;
		public int				instance2;
		public static final int	class1	= 1;
		public static final int	class2	= 2;
	}

	class ClassB extends ClassA
	{
		public int				instance1;
		public static final int	instance2	= 3;
		public int				class1;
		public static final int	class2		= 4;
	}

}
