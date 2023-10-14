package JavaJungsuk;

import java.util.Scanner;

//if (조건식1) { 
//// 조건식1의 연산결과가 true일 때 수행될 문장들을 적는다.
//if (조건식2) { 
//// 조건식1과 조건식2가 모두 true일 때 수행될 문장들
//} else { 
//// 조건식1이 true이고, 조건식2가 false일 때 수행되는 문장들
//} 
//} else { 
//// 조건식1이 false일 때 수행되는 문장들
//}

public class Basic_If_1 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';			
			if(score >=98) {
				opt = '+';
			} else if (score <94) {
				opt = '-';
			}
		} else if (score >=80) {
			grade = 'B';
			
			if(score >=88) {
				opt = '+';
			} else if (score <84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade,opt);

	}

}
