package interfaceStudy;

public class Son implements Father,Mother,S2   //multiple interface
{
     public static void main(String[] args) 
     {
		Son s=new Son();
		s.bike();
		s.Home();
		s.scooty();
		s.shop();
		s.watch();
		s.chennai();
		s.kerala();
		s.mumbai();
		s.pune();
	}
	@Override
	public void scooty() 
	{
		System.out.println("mother scooty");
	}

	@Override
	public void shop()
	{
		System.out.println("mother shop");		
	}

	@Override
	public void Home() 
	{
		System.out.println("father home");		
	}

	@Override
	public void bike() 
	{
		System.out.println("father bike");		
		
	}
    
	void watch() 
	{
		System.out.println("son watch");
	}
	@Override
	public void pune() 
	{
	       System.out.println("pune");		
		
	}
	@Override
	public void mumbai() {
	       System.out.println("mumbai");		
		
	}
	@Override
	public void chennai() {
	       System.out.println("chenai");		
		
	}
	@Override
	public void kerala() {
	       System.out.println("kerala");		
		
	}
}
