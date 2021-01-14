package basic;

import basic.LearnNestedClass.computer.Mobile;

public class LearnNestedClass {

	int num=20;
	int num1=30;
	
	public static void main(String[]args) {
	
	LearnNestedClass learn=new LearnNestedClass();
	System.out.println(learn.num);	
	computer com=new computer();
	System.out.println(com.computername);
	System.out.println(computer.computerprice);
	computer.computerDisplay();
	computer.Mobile mobile=new Mobile();
	System.out.println(mobile.mobileprice);
	System.out.println(computer.Mobile.mobilebrand);
	
	}
	
	

public static class computer{
	
	String computername="HP";
	static String computerprice="2000";
	public static void computerDisplay() {
	System.out.println("computerDisplay");
	}	
public static class Mobile {
		static String mobilebrand="Iphone";
        int mobileprice=1200; 
}	

}
}	
	




