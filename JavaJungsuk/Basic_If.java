package JavaJungsuk;

import java.util.Scanner;

public class Basic_If {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		
		System.out.println("점수를 입력받기");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score >=90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade ='D';
		}
		
		System.out.println("입력한 점수의 학점은 = " + grade + " 학점입니다.");
	}

}
