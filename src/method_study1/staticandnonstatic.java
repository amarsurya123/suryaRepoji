package method_study1;

public class staticandnonstatic {
	        
	int a;    //declartion
	int b;

	public static void main(String[] args) ///main method
	{
		add1();//static
		staticandnonstatic st=new staticandnonstatic();//object creat by non-static
		st.add2(); //calling non-static
//	 Test1 t=new Test1(); //object creat in other class
//	 t.mul(); //calling in nonstatic from another class
//	 Test1.mul1();//

	}
	public static void add1()  //static method
	{
		int a=10;int b=20; //initilization
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
    
	public void add2()  //non-static method
	{  
		int a=40;int b=70;
		int sum1=a+b;
		System.out.println("addition is "+sum1);
	}
	
}
