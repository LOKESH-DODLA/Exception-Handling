
// used for Checked Exception 

// To handle any Exception We use try-Catch()-finally() methods 

import java.util.*;
class AgeException extends Exception
{
	public AgeException(String s)
	{
		System.out.println(s);
	}
}
class VotingDemo
{
	public static void main(String[]args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age :");
		age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new AgeException("NOT ELEGIBLE FOR VOTING ,AGE MUST BE GREATER THAN 18.");
			}
			else
			{
				System.out.println("WELCOME TO VOTING");
			}
		}
		catch(Exception e)
		{
		}
	}
}



