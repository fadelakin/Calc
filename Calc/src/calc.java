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
	}
}