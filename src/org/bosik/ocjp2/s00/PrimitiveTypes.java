package org.bosik.ocjp2.s00;

/**
 * <table border="1">
 * <tr>
 * <th>Type</th>
 * <th>Values</th>
 * <th>Values</th>
 * <th>Sign</th>
 * <th>Size</th>
 * </tr>
 * <tr>
 * <td><code><b>boolean</b></code></td>
 * <td>false, true</td>
 * <td>—</td>
 * <td>—</td>
 * <td>1 □</td>
 * </tr>
 * <tr>
 * <td><code><b>byte</b></code></td>
 * <td>–2<sup>7</sup>..2<sup>7</sup>–1</td>
 * <td>–128..127</td>
 * <td>signed</td>
 * <td>1 □</td>
 * </tr>
 * <tr>
 * <td><code><b>char</b></code></td>
 * <td>0..2<sup>16</sup>–1</td>
 * <td>0..65 535</td>
 * <td>unsigned</td>
 * <td>2 □□</td>
 * </tr>
 * <tr>
 * <td><code><b>short</b></code></td>
 * <td>–2<sup>15</sup>..2<sup>15</sup>–1</td>
 * <td>–32 768..32 767</td>
 * <td>signed</td>
 * <td>2 □□</td>
 * </tr>
 * <tr>
 * <td><code><b>int</b></code></td>
 * <td>–2<sup>31</sup>..2<sup>31</sup>–1</td>
 * <td>–2 147 483 648..2 147 483 647</td>
 * <td>signed</td>
 * <td>4 □□□□</td>
 * </tr>
 * <tr>
 * <td><code><b>long</b></code></td>
 * <td>–2<sup>63</sup>..2<sup>63</sup>–1</td>
 * <td>–9 223 372 036 854 775 808..9 223 372 036 854 775 807</td>
 * <td>signed</td>
 * <td>8 □□□□ □□□□</td>
 * </tr>
 * <tr>
 * <td><code><b>float</b></code></td>
 * <td>? ..(1–2<sup>–24</sup>)&middot;2<sup>128</sup></td>
 * <td>—</td>
 * <td>signed</td>
 * <td>4 □□□□</td>
 * </tr>
 * <tr>
 * <td><code><b>double</b></code></td>
 * <td>—</td>
 * <td>—</td>
 * <td>signed</td>
 * <td>8 □□□□ □□□□</td>
 * </tr>
 * </table>
 */
public class PrimitiveTypes
{
	public static void main(String... args)
	{
		boolean x1 = true; // 1
		byte x2 = -1; // 1
		char x3 = (char) -1; // 2
		short x4 = -1; // 2
		int x5 = -1; // 4
		long x6 = -1; // 8
		float x7 = -1; // 4
		double x8 = -1; // 8

		System.out.println("boolean: " + x1);
		System.out.println("byte: " + x2);
		System.out.println("char: " + (int) x3);
		System.out.println("short: " + x4);
		System.out.println("int: " + x5);
		System.out.println("long: " + x6);
		System.out.println("float: " + x7);
		System.out.println("double: " + x8);
	}

	static
	{
		/* Literals are checked at compile time */

		byte b1 = -129; // can't convert int -> byte
		byte b2 = -128; // ok
		byte b3 = +127; // ok
		byte b4 = +128; // can't convert int -> byte

		short s1 = -32_769; // can't convert int -> short
		short s2 = -32_768; // ok
		short s3 = +32_767; // ok
		short s4 = +32_768; // can't convert int -> short

		int i1 = -2147483649; // out of range
		int i2 = -2147483648; // ok
		int i3 = +2147483647; // ok
		int i4 = +2147483648; // out of range

		/* Results of simple expressions are checked at compile time */

		byte bt1 = 120 + 8; // can't convert int -> byte
		byte bt2 = 64 * 2; // can't convert int -> byte
		byte bt3 = 1 << 7; // can't convert int -> byte
		byte bt4 = 255 - 255; // ok
	}
}
