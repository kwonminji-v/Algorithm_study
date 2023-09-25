package BackJoon_beginner_Java;

import java.util.Scanner;


public class Beginner_Condition1 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if ( a > b) {
				System.out.print(">");
			} else if (a < b) {
				System.out.print("<");
			} else if (a == b) {
				System.out.print("==");
			} else return;

		}
}
