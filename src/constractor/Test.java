package constractor;
  //method
public class Test {

	public static void main(String[] args) {     //int ,string,float,boolean,char,with non-static of parametar
		// TODO Auto-generated method stub
      Test t=new Test();
      t.Stdinfo("Amar", 22,33.4f,'O');
      Test e=new Test();
      e.Stdinfo1();
		
	}
	public void Stdinfo(String name,int rollno,float marks,char bloodgroup) //non-static with parametar
	{
		System.out.println("---------------------------");
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my marks is "+marks);
		System.out.println("my bloodgroup is "+bloodgroup);
		System.out.println("----------------------------");
	}
	public void Stdinfo1() //non-static method without parametar
	{
		String name="Sumit";
		int rollno=23;
		float marks=33.22f;
		char bloodgroup='A';
		
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my marks is "+marks);
		System.out.println("my bloodgroup is "+bloodgroup);
	}

}
