package basic;

public class LearnStatic {

	int age;
	int pizzaprice=25;
	
	public static String stName="Jarin";
	String staddress="New York";
	static String stMiddleName;
	String stChildName="Butter";
	
	public static void tvDisplay() {
	System.out.println("tvDisplay is UHD");
	}
	
	public void display() {
	System.out.println("Display is good");	
	}
	
	
	public static void main(String[]args) {
		
		LearnStatic.stName="Kevin";
		System.out.println(LearnStatic.stName);
		LearnStatic.tvDisplay();
		LearnStatic.stMiddleName="Tanin";
		System.out.println("My middle name is "+LearnStatic.stMiddleName);
			
		
		LearnStatic obj=new LearnStatic();
		System.out.println(obj.staddress);
		obj.age=34;
		System.out.println(obj.age);
		obj.pizzaprice=45;
		System.out.println("Pizza price "+obj.pizzaprice);
	    System.out.println("My child's name is "+obj.stChildName);
	    obj.display();
	
	}
	
	
}
