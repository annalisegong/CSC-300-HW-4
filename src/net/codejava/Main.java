package net.codejava;

public class Main 
{

	public static void main(String[] args) 
	{
		String s = "hey";
		
		for(int i = 0; i <= s.length()-1; i++)
		{
			int count = 0;
			char a = s.charAt(count);
			char b = s.charAt(i);
			if(a.equals(b))
			{
				System.out.println("String: " + s + ", does not have all unique characters");
			}
			count++;
		}

	}

}
