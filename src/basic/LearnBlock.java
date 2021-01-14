package basic;

public class LearnBlock {

	{	
	System.out.println("Hello");
	System.out.println("This is a block");
	
	}

public static void display() {

	System.out.println("This is a display method");
    System.out.println("This is from inside a block");


}


public static void main (String[]args) {

	{
	
	System.out.println("Hello");
	System.out.println("This is a block");
		
	}	
		
	LearnBlock.display();	
}

}
