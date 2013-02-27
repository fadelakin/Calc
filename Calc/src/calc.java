import java.io.*;
import java.util.*;

public class calc {
	public static void main(String args[]) throws IOException {
		BufferedReader keyboard = new BufferedReader (new
			InputStreamReader(System.in));
		int option, first, second, answer;

		System.out.print("1: too add" +
							"\n2: to multiply" +
							"\n3: to subtract" +
							"\nEnter option: ");
		option = Integer.parseInt(keyboard.readLine());
		System.out.print("Enter the first number: ");
		first = Integer.parseInt(keyboard.readLine());
		System.out.print("Enter the second number: ");
		second = Integer.parseInt(keyboard.readLine());

		switch(option) {

			case 1: answer = first + second; break;
			case 2: answer = first * second; break;
			case 3: answer = first - second; break;
			default: System.out.print("Invalid");answer=0;break;
		}
		System.out.print("Answer: " + answer);
		
		BufferedReader keys = new BufferedReader (new
			InputStreamReader(System.in));
		int newoption, newfirst, newsecond, newanswer;
		
		System.out.print("Do you want to continue with new numbers?\n");
		System.out.print("Enter yes or no\n");
		boolean enter;
		if (enter == "yes") {
			System.out.print("1: to add" +
				"\n2: to multiply" +
				"\n3: to subtract" +
				"\nEnter option: ");
			newoption = Integer.parseInt(keyboard.readLine());
			System.out.print("Enter the first number: ");
			newfirst = Integer.parseInt(keyboard.readLine());
			System.out.print("Enter the second number: ");
			newsecond = Integer.parseInt(keyboard.readLine());
			
			switch(newoption) {
				
				case 1: newanswer = newfirst + newsecond; break;
				case 2: newanswer = newfirst * newsecond; break;
				case 3: newanswer = newfirst - newsecond; break;
				default: System.out.print("Brah, your answer is invalid");newanswer=0;break;
			}
			System.out.print("Answer: " + newanswer);
		} else {
			System.out.println("Goodbye");
		}
		
	}
}
