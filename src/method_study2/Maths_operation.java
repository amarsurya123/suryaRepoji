package method_study2;

public class Maths_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maths_operation t=new Maths_operation();
		t.mathsinfo();
		
		mathinfo1(22,33);
		
    }
	//without parameter
	public void mathsinfo() //non-static method
	{
		int a=10,b=20;
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		
		System.out.println("---------------------");
		System.out.println("addition is "+add);
		System.out.println("substraction is "+sub);
		System.out.println("multiplication is "+mul);
		System.out.println("division is "+div);
		System.out.println("----------------------");
	}
	//with parameter
	public static void mathinfo1(int a, int b) //static mathod
	{
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		
		System.out.println("---------------------");
		System.out.println("addition is "+add);
		System.out.println("substraction is "+sub);
		System.out.println("multiplication is "+mul);
		System.out.println("division is "+div);
		System.out.println("----------------------");
	}

}
