package practice1;

public class If_statment {

	public static void main(String[] args) 
	{ 
		int marks=65;
		
		if(marks>=75)
		{
			System.out.println("you are distiction");
		}
		else if(marks>=60 && marks<75) 
		{
			System.out.println("you are a 1st class");
		}
		else if (marks>=40 && marks<60)
		{
			System.out.println("you are a 2nd class");
		}
		else 
		{
			System.out.println("you are a faile");
		}
		

	}

}
