package method_study;

public class Main_method {

	public static void main(String[] args) {
		/*method is a block of code which "only runs when it is called". 
		 * why to use meyhod? - define thr code once & use it many times.
		 * Two types of mathod - 1.main method , 2.regular method
		 * 1.main method-without main method you save the program but can't run the program
		 *    (1)complete method / Method Definition - Public static void main() {subject}
		 *    {2}incomplete method / Method Declaration - Public static void main();
//		 * 2.regular method- (1)static & (2)non static
 * 
		*/
       add();//calling of static regular method in main method From same class by using "method name".
       Call_static_method.multiplication(); // calling of static regular method from another class in main method by using "class name.methodname"
       }
	                 
	public static void add()   //static method
	
	{
		int a=10,b=20,c;        //regular method
		c=a+b;
		
		System.out.println("addition is "+c);
	}
	public void sub() //non-static method 
	{
		int a=11,b=22,c;
		c=a-b;
		System.out.println("substraction "+c);
		
	}

}
