package inheritance;

public class multiLevalInheritance {

	public static void main(String[] args) 
	{
        GrandFather g=new GrandFather();
        g.farm();
        
        Father f1=new Father();
        f1.job();
        f1.farm();
        
        Son s1=new Son();
        s1.cycle();
        s1.job();
        s1.farm();

	}

}
 