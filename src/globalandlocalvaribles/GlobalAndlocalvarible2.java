package globalandlocalvaribles;

public class GlobalAndlocalvarible2 

{     int r=445;        //non-static global varible
      static int t=556; //static global varible
	
 public static void main(String[] args) 
 {
	 Sampal1 s2=new Sampal1();
	 int sub=t-s2.x;
	 System.out.println("substraction is "+sub);
	 System.out.println("the value of global static varible is "+t);
	 GlobalAndlocalvarible2 g1=new GlobalAndlocalvarible2();
	 float add=g1.r+s2.z;	
	 System.out.println("addition is "+add);
	 
	 
}
 
 
 
}
