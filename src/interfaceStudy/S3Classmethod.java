package interfaceStudy;

public class S3Classmethod implements S2  {

	public static void main(String[] args) 
	{
    S3Classmethod s=new S3Classmethod();
    s.chennai();
    s.kerala();
    s.mumbai();
    s.pune();
	}

	@Override
	public void pune() 
	{
       System.out.println("pune");		
	}

	@Override
	public void mumbai() 
	{
	       System.out.println("mumbai");			
	}

	@Override
	public void chennai() 
	{
	       System.out.println("chennai");			
	}

	@Override
	public void kerala()
	{
	       System.out.println("kerala");			
	}

}
