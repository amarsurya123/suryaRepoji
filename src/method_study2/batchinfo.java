package method_study2;

public class batchinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentinfo();
		stdinfo("Amit","Pune",'D',"entc" ,77.33f);

	}
	//without_parameter
	public static void studentinfo() //static method
	{
		String name="Amar surya";
		String district="Pune";
		char div='A';
		String branch="computer";
		float percentage=75.23f;
		
		System.out.println("---------------------------"); //uase method-print karane
		System.out.println("my name is "+name);
		System.out.println("district is "+district);
		System.out.println("my division is "+div);
		System.out.println("my branch is "+branch);
		System.out.println("my percentage is "+percentage);
		System.out.println("----------------------------");
	}

	public static void stdinfo(String name,String district,char div,String branch,float percentage) //non-static method
	{
		System.out.println("---------------------------");
		System.out.println("my name is "+name);
		System.out.println("ditrict is "+district);
		System.out.println("my division is "+div);
		System.out.println("my branch is "+branch);
		System.out.println("my percentage is "+percentage);
		System.out.println("----------------------------");
		
	}
}
