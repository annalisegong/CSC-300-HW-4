package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		if(uniqueTest(s) == false)
		{
			System.out.println("'" + s + "' does not have all unique characters");
		}
		else
		{
			System.out.println("'" + s + "' has all unique characters");
		}
	}
	
	public static boolean uniqueTest(String s)
	{
		for(int i = 0; i < s.length()-1; i++)
		{
			for(int j = 0; j < s.length() - i - 1; j++)
			{
				if(s.charAt(i) == s.charAt(i+1))
				{
					return false;
				}
			}
		}
		return true;
	}
}