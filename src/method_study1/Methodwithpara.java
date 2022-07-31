package method_study1;

public class Methodwithpara {
	
	public static void main(String[] args) {  //main method


	Methodwithpara mp=new Methodwithpara(); //creat object by main method
	mp.studentinfo("Amar_surya",22,"83934002992",22,'A','M'); //initilaization 
	mp.studentinfo("sumit",23,"72883283883",22,'S','M');////calling regular method in main method
	studentinfo1("abhishek",21,"838388383",'B');
		
		
	}	
	                        //declarisation
	public void studentinfo(String name,int rollno,String mobileno,float age,char batch,char gender) //regular method
	{
		System.out.println("-------------------------");
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my mobile no is "+mobileno);
		System.out.println("my age is "+age);
		System.out.println("my batch is "+batch);
		System.out.println("my gender is "+gender);
		System.out.println("-------------------------");
	}
    
	public static void studentinfo1(String employ,int id,String mobileno,char bloodgroup)
	{
		System.out.println("-------------------------------");
		System.out.println("employ name is "+employ);
		System.out.println("employ id is "+id);
		System.out.println("employ mobileno is "+mobileno);
		System.out.println("employ bloodgroup is "+bloodgroup);
		System.out.println("--------------------------------");
	}
	
	
}