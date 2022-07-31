package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
       Son s=new Son();
       s.bike();
       s.car();
       s.home();
       System.out.println("===========");
       
       Father f=new Father();
       f.car();
       f.home();
       
       Father f1=new Son();  //this is upcasting
       f1.car();
       f1.home();
       
       
       
	}

}
