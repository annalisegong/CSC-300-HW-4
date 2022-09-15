package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "bye";
		
		uniqueTest(s1);
		uniqueTest(s2);
	}
	
	public static boolean uniqueTest(String s)
	{
		for(int i = 0; i < s.length()-1; i++)
		{
			for(int j = 0; j < s.length() - i - 1; j++)
			{
				if(s.charAt(i) == s.charAt(i+1))
				{
					System.out.println("'" + s + "' does not have all unique characters");
					return false;
				}
			}
		}
		System.out.println("'" + s + "' has all unique characters");
		return true;
	}
}