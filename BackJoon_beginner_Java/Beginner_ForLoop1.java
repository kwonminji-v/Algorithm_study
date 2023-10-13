package BackJoon_beginner_Java;

import java.util.Scanner;

public class Beginner_ForLoop1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
