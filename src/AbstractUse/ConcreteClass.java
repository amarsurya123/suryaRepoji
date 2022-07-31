package AbstractUse;

public class ConcreteClass extends AbstractStudy {

	public static void main(String[] args)
	{
		ConcreteClass c=new ConcreteClass();
		c.test1();
		c.test2();

	}

	@Override
	public void test1() {
		System.out.println("other class");
		
	}
	

}
