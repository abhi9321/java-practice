
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter user input\n");
		double value = input.nextDouble();
		
		System.out.println("User input : "+ value);
	}

}
