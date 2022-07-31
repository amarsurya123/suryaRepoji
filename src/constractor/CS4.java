package constractor;

public class CS4 {
    
	int a;  //variable declaration
	int b;
	int c;
	int sum;
	
	public static void main(String[] args) {    //main method
		  
		CS4 c=new CS4(); //creating object in same class
        c.sum();
        CS4 t=new CS4(100); //creating object in single parametar
        t.sum();
        CS4 h=new CS4(200,300); //creating object in doubal parametar
        h.sum();
	}
        
     public CS4() //constructor without parametar
	{
		a=10; //variable initialization
		b=20;
		c=30;
	}
	public CS4(int x) //construction with singal parametar
	{
		a=x;
	}
	public CS4(int x,int y) //construction with double parametar
	{
		a=x; b=y;
	}
	
	public void sum() //regular method
	{
		sum=a+b+c;
		System.out.println("Addition is "+sum);
	}
}
