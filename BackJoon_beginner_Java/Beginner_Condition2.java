package BackJoon_beginner_Java;
import java.util.Scanner;

public class Beginner_Condition2 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int score = sc.nextInt();
			
			if ( score >=90 && score <=100) {
				System.out.print("A");
			} else if (80<=score && score <= 89) {
				System.out.print("B");
			} else if (70 <= score && score <= 79) {
				System.out.print("C");
			} else if (60 <= score && score <=69) {
				System.out.println("D");
			} else System.out.println("F");

	}

}
