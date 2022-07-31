package stringClassStudy;

public class StringClass {

	public static void main(String[] args) 
	{
       String s1="Amar";   //constat pool area
       String s2="Amar";
       String s3="vijay";
       
       String t1=new String("sumit1"); //non-constat pool area
       String t2=new String("sumit1");
       String t3=new String("sumit3");
       
       System.out.println("length of string  "+s1.length());
       //use of length
       int Stringlength=s1.length(); 
       int sum=Stringlength+10;
       System.out.println(sum);
       
       int Stringstudy=t2.length();    
       System.out.println(Stringstudy);
     
       //use of toUppercase
      String Stringname=s2.toUpperCase(); 
      System.out.println(Stringname);
      
      //use of toLowercase
       String StringName1=s2.toLowerCase(); 
       System.out.println(StringName1);
       
       System.out.println(s1==s2); //Equls
       
       System.out.println(s1.equals(s3)); //equals
       
       //use of equalsIgnoreCase
       System.out.println(s1.equalsIgnoreCase(s2)); 
       System.out.println(s1.equalsIgnoreCase(s3)); 
      
       //use of contains
       System.out.println(s1.contains("Amar"));
       System.out.println(s1.contains("vijay"));
       
       //use of isEmpty
       String m="";
       System.out.println(m.length());
       System.out.println(m.isEmpty());
       System.out.println(m.isBlank());
      
       //use of charAt
       System.out.println(s1.charAt(2));
       System.out.println(s1.charAt(1));
      
       //use of endsWith
       String bus="ashok";
       System.out.println(bus.endsWith("k"));
       System.out.println(bus.endsWith("o"));
      
       //use of startWith
       String pen="celo";
       System.out.println(pen.startsWith("c"));
       System.out.println(pen.startsWith("e"));
      
       //use of substring
       String college="shahu college";
       System.out.println(college.substring(5));
       System.out.println(college.substring(0, 5));
       
	}

}
