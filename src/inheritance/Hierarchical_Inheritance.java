package inheritance;

public class Hierarchical_Inheritance {

	public static void main(String[] args) 
	{
		Mother m=new Mother();
		m.home();
		
		Son1 s=new Son1();
		s.bike();
		s.home();
		
		Daughter g=new Daughter();
		g.book();
		g.home();

	}

}
