package generalization;

public class TestGenaralization {

	public static void main(String[] args)
	{
       CelloPen c=new CelloPen();
       c.design();
       c.comfort();
       c.look();
       c.good();
       System.out.println("================");
       
       BollPen b=new BollPen();
       b.design();
       b.comfort();
       b.look();
       b.bettar();
       System.out.println("================");
       
       JelPen j=new JelPen();
       j.design();
       j.comfort();
       j.look();
       j.Best();
       System.out.println("===============");
       
       
	}

}
