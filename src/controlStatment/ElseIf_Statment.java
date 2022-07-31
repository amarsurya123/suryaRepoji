package controlStatment;

public class ElseIf_Statment {

	public static void main(String[] args)
	{  
		int marks=45;
		if(marks>=75)
	    {    
			System.out.println("you are distinction");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("you are 1st class");

		}
		else if(marks>=40 && marks<60)
		{
			System.out.println("you are 2nd class");
		}
		else
		{
			System.out.println("yor are failed");
		}



	}

}
