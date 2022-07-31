package access_specifiers1;

import access_specifiers.AccessSpecifierStudy;
import method_study.Main_method;

public class Study3 extends AccessSpecifierStudy {

	public static void main(String[] args) 
	{
		AccessSpecifierStudy as3=new AccessSpecifierStudy();
		as3.study1();
		
		Study3 st=new Study3();
		st.study4();
	    st.study1();
	    
	    Main_method m=new Main_method();
	    m.sub();
	 
	}

}
