package interfaceStudy;

public class ImplimentationClass implements InterfaceTest //single interface
{
	
	int a=60;
	int b=20;

	public static void main(String[] args)
	{
      ImplimentationClass m=new ImplimentationClass();
      m.add();
      m.sub();
      System.out.println(InterfaceTest.a);
	}

	@Override
	public void add()
	{
		int a=30;
		int b=33;
		int sum=a+b;
		int sum1=this.a+this.b;
        System.out.println("the value of sum "+sum);
        System.out.println("the value of sum1 "+sum1);
	}

	@Override
	public void sub()
	{
       int sub=this.a-20;
       System.out.println("the value of sub is "+sub);
	}

}
