package BackJoon_beginner_Java;

import java.util.Scanner;

public class Beginner_Domain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int domain1 = sc.nextInt();
		int domain2 = sc.nextInt();
		
		int sub = domain1 - domain2;
		
		
		System.out.println(Math.abs(sub));
		
	}

}
