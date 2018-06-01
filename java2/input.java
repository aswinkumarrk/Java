package java2;
import java.util.Scanner;


public class input {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the line of text");
           String line=input.nextLine();
	System.out.println("the entered line is"+line);
int value=input.nextInt();
System.out.println("Enter the number to be got input");
System.out.println("the entered number is" +value);
System.out.println("Enter a floating point value: ");
double number = input.nextDouble();
System.out.println("You entered: " + number);
	}

}
