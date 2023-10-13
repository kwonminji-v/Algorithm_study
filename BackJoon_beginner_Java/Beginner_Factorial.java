package BackJoon_beginner_Java;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Beginner_Factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		
		int numbers = scanner.nextInt();
		int sum =1;

		while(numbers !=0) {
			sum = sum * numbers;
			numbers--;
		}
		
		System.out.println(sum);

	}

}
