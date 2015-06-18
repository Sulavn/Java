// Sulav Nakarmi
// COSI 11A, Fall 2013, Section 01
// Programming Assignment #7, 12/10/2013
//
// This program will count the number of words, lines, and total characters in a paper.
import java.io.*;
import java.util.*;

public class WordCounter
{
	public static int numword;
	public static int numline;
	public static void main (String[] args) throws FileNotFoundException		// Removes exception
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter a file to be read");
		String a = read.next();
		File f = new File(a);
		Scanner console = new Scanner(f);
		long text = f.length();													// Number of total characters including whitespace.
		line(console);
		System.out.println("Number of words: " + numword);
		System.out.println("Number of lines: " + numline);
		System.out.println("Number of Characters: " + (text - numword));		// Subtracts total number of words from total number of characters to find total number of characters not including whitespace.
	}
		
	public static int word(String y)											// Counts number of words in a file.
	{
		Scanner lines = new Scanner(y);
		while (lines.hasNext())													// As long as theres a line, this method will read the number of words in that line.
		{				
			String word = lines.next();															
			++numword;
		}
		return numword;		
	}		
																	
	public static int line(Scanner console)										// Counts number of lines in a file.										
	{
		while (console.hasNextLine())
		{
			String y = console.nextLine();
			word(y);															
			++numline;
		}
		return numline;
	}
}
