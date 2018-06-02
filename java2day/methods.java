package java2day;
class Entrepreneur
{
	String name;
	int age;
	
	void speaks()
	{
		 for(int i=0; i<3; i++) {
	            System.out.println("My name is: " + name + " and I am " + age + " years old ");
	        }
	}
	void sayhello()
	{
		System.out.println("Hello everyone,I am a freaking billionaire");
	}
	
}
public class methods {

	public static void main(String[] args) {
		//object 1 creation
	 Entrepreneur  entrepreneur1 =new Entrepreneur();
     entrepreneur1.name="Mark";
     entrepreneur1.age=35;
     entrepreneur1.speaks();
     entrepreneur1.sayhello();
     //object 2 creation
     Entrepreneur entrepreneur2 =new Entrepreneur();
     entrepreneur2.name="Jackdorsey";
     entrepreneur2.age=40;
     entrepreneur2.speaks();
     entrepreneur2.sayhello();

     System.out.println("The name of the entrepreneur 2 is");
     System.out.println(entrepreneur2.name);
	}

}
