package generalization;

public class CelloPen implements PenStore
{

	@Override
	public void design() 
	{
		System.out.println("cellopen design");	
	}

	@Override
	public void look()
	{
		System.out.println("cellopen look");	
	}

	@Override
	public void comfort() 
	{
		System.out.println("cellopen comfort");	
	}
	
	public void good()
	{
		System.out.println("pen is good");
	}

}
