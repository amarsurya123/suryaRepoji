package constractor;  //user
           //classmane
public class CS5 {
	
	   int a;
	   int b; //variable declaration
	   int c;
	   
	public static void main(String[] args) {
		   //object name
		CS5 c=new CS5(40,50,30); //creating object
		 c.add();
		 CS5 c1=new CS5();
		 c1.add();
		 
		 
	}
	
	public CS5()   //constructor without parametar
	{  
		a=10; //variable intilazation
		b=20;
		c=30;
	}
	
	public CS5(int x,int y,int z) //constructor with parametar
	{
		a=x;b=y;c=z;
	}
	
	public void add()  //non-static without parametar
	{
		int add=a+b+c;
		System.out.println("Addition is "+add);
	}
	
}
