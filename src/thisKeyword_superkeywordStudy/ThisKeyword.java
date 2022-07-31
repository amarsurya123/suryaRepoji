package thisKeyword_superkeywordStudy;

public class ThisKeyword {
	int a=10; //global value of global variable

	public static void main(String[] args)
	{
		
		ThisKeyword a=new ThisKeyword();
		a.addition();

	}
	
	public void addition()
	{
		int a=30; //local value 
		int add1=10+a;
		System.out.println("addition is "+add1);
		
		int add2=this.a+20;
		System.out.println("back addition is "+add2);
	}

}
