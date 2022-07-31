package practice1;

public class Callvariable1 {
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;

	public static void main(String[] args)
	{
         System.out.println(c);
         System.out.println(d);
         int add=c+d;
         System.out.println(add);
         
         Callvariable1 c1=new Callvariable1();
         int add1=c1.a+c1.b;
         System.out.println(add1);
         
         int sub=c-c1.a;
         System.out.println(sub);
         
         int add2=CallVariableanotherClass.h+CallVariableanotherClass.j;
         System.out.println(add2);
         
         CallVariableanotherClass cs=new CallVariableanotherClass();
         int add4=cs.f+cs.g;
         System.out.println("add4 "+add4);
         
         


	}

}
