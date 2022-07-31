package examBasedCode;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int a=121;
		int s=a;
		int r=0;
		while(a!=0)
		{   
			r=r*10+a%10; //121/10=1
			a=a/10;      //121/10=12
		}
		System.out.println(r);
		if(s==r)
		{
			System.out.println("it is Palindron Number "+s);
		}
		else
		{
			System.out.println("it is not Palindrone Number "+s);
		}
	}

}
