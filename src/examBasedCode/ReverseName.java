package examBasedCode;

public class ReverseName {

	public static void main(String[] args) 
	{
		String a = "AMAR";
		String r="";
		int ref = a.length();
		System.out.println("lenght of the string "+ref);
		
		for(int i=ref-1;i>=0;i--)
		{
			r=r+a.charAt(i);
			
		}
		System.out.println(r);
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
