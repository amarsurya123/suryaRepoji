package loop;
//practice
public class ForLoopPractice {

	public static void main(String[] args) 
	{ 
		
//		
//		for(int i=0;i<=100;i=i+2) //even numbers
//		{
//			System.out.println(i);   
//		}
//		
//		for(int a=1;a<=100;a=a+2) //old numbers
//		{
//			System.out.println(a);
//		}
//		for(int s=3;s<=1;s--) //545,151,171 
//		{
//			System.out.println(s);
//		}
		
		int r,sum=0,temp;
		int n=545;
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("palindrome number ");
			
		}
		else 
		{
			System.out.println("not palindrom number");
		}
		
			
		
		
		
		
		

	} 

}

