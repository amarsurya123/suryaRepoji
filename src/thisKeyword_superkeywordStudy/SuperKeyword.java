package thisKeyword_superkeywordStudy;

public class SuperKeyword extends ThisKeyword {
	
	int a=20; //global value 

	public static void main(String[] args)
	{
		SuperKeyword s=new SuperKeyword();
		s.sub1();
		s.addition();
		
	}
	
	public void sub1()
	{
		int a=40;
		int sub3=super.a-20;
		System.out.println("super addition is "+sub3);
		
		
	}

}
