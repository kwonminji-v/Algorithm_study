package BackJoon_beginner_Java;

import java.util.Scanner;

public class Beginner_Gugudan {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0; i<=array.length; i++) {
			array[i] = i+1;
			System.out.println(array[i]);
		}

	}

}
