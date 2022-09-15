package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		String s = "hey";
		
		for(int i = 0; i <= s.length()-1; i++)
		{
			if(s(i).equals(s(i+1)))
			{
				System.out.println("String: " + s + ", does not have all unique characters");
			}
		}
	}
}
