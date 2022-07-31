package method_study;
           //classname
public class Test {

	public static void main(String[] args) {    //main method
		// TODO Auto-generated method stub
       Test t=new Test(); //creating object of same class
       t.method1();       //calling of regular method in main method from same class
		
       Myclass m=new Myclass();	//creat object of another class
       m.mymethod1();    //calling non-static method from another class
	}
             //methodname
	public void method1()  //non-static method
	{
		int a=22,b=33,sub;    //regular method
		sub=a-b;
		
		System.out.println("subtraction is "+sub);
		
	}
}
