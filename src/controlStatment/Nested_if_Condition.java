package controlStatment;

public class Nested_if_Condition {

	public static void main(String[] args) 
	{
		String UN="amar";
		String pass="Amar@12";
		if(UN=="amar")
		{
			System.out.println("enetr password");
			
		    if(pass=="Amar@12")
		 {
			 System.out.println("Login succesfull");
		 }
		 else 
		 {
			 System.out.println("wrong password");
		 }
			
		}
		else
		{
			System.out.println("invalid username");
		}
	}

}
