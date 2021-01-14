package basic;

public class LearnObject {

	int num1=34;
	int num2=45;
	
	public static void main(String[]args) {
		LearnObject learn=new LearnObject();
		
		int total=learn.num1+learn.num2;
		System.out.println("Total value is "+total);
				
		
	LearnObject obj=new LearnObject();
	obj.num1=66;
	obj.num2=77;
	int output=obj.num1*obj.num2;
	System.out.println("Output is "+output);		
		
	LearnDataType datatype=new LearnDataType();
	System.out.println(datatype.coursefee);
	datatype.isAvailable=false;
	System.out.println(datatype.isAvailable);
	
	LearnStatic ls=new LearnStatic();
	ls.display();
	LearnStatic.tvDisplay();
	
	}
	
}
