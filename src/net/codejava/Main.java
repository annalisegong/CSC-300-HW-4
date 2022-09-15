package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		String s = "hey";
		
		for(int i = 0; i <= s.length(); i++)
		{
			for(int j = 0; j < s.length(); j++)
			{
				if(s.charAt(i).equals(s.charAt(j)))
				{
					System.out.println("String: " + s + ", does not have all unique characters");
				}
			}
		}
	}
}
