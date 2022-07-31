package method_study1;

public class Methodtest {

	public static void main(String[] args) {     //main method
		// TODO Auto-generated method stub
       
		Methodtest m=new Methodtest(); //creating object from same class
		m.result(); //calling regular method in main method 
		studentinfo();
		
	}

	public void result() //regular method
	{
		int chem=60,phy=70,maths=80;   //non-static mathod
		int total=chem+phy+maths;
		int avg=total/3;
		
	System.out.println("my result is "+avg);
		
	}
	
	public static void studentinfo()   //static method
	{
		String name="Amar surya";
		int rollno=10;
		String mobileno="7038706967";
		float age=24.4f;
		int batch=10;
		char gender='M';
		
		System.out.println("----------------------");
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my mobile n. is "+mobileno);
		System.out.println("my age is "+age);
		System.out.println("my batch is "+batch);
		System.out.println("my gender is "+gender);
		System.out.println("---------------------");
	}
	
	
}
