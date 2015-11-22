package org.bosik.misc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavadocListFormatter
{
	/**
	 * 
	 * @param s
	 * @return Number of tabs in front of string
	 */
	private static int getIndent(String s)
	{
		int result = 0;
		while (s.startsWith("\t", result))
		{
			result++;
		}
		return result;
	}

	public static void main(String... args) throws FileNotFoundException, IOException
	{
		String fileName = "input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			int prevIndent = 0;
			System.out.println("<ul>");
			for (String line; (line = br.readLine()) != null;)
			{
				int indent = getIndent(line);
				int diff = indent - prevIndent;
				while (diff > 0)
				{
					System.out.println("<ul>");
					diff--;
				}
				while (diff < 0)
				{
					System.out.println("</ul>");
					diff++;
				}

				if (indent == 0)
				{
					line = "<b>" + line + "</b>";
				}
				System.out.println("<li>" + line + "</li>");

				prevIndent = indent;
			}
			int diff = -prevIndent;
			while (diff < 0)
			{
				System.out.println("</ul>");
				diff++;
			}
			System.out.println("</ul>");
		}
	}
}
