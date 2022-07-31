package generalization;

public class BollPen implements PenStore 
{

	@Override
	public void design() 
	{
		System.out.println("BollPen design");	
	}

	@Override
	public void look() 
	{
		System.out.println("BollPen look");
	}

	@Override
	public void comfort()
	{
		System.out.println("BollPen comfort");	
	}
	public void bettar()
	{
		System.out.println("batter pen");
	}

}
