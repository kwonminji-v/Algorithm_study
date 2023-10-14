package JavaJungsuk;

import java.nio.file.FileSystemLoopException;
import java.util.Scanner;

//① 조건식을 계산한다.
//② 조건식의 결과와 일치하는 case문으로 이동한다.
//③ 이후의 문장들을 수행한다.
//④ break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
//    switch (조건식) { 
//      case 값1 : 
// //      조건식의 결과가 값1과 같을 경우 수행될 문장들
// //     ... 
//      break; 
//      case 값2 : 
// //      조건식의 결과가 값2와 같을 경우 수행될 문장들
// //     ... 
//      break; // switch문을 벗어난다.
// //     ... 
//      default : 
// //      조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
// //     ... 
//    }


public class Basic_Switch {

	public static void main(String[] args) {
		
		System.out.println("현재 월을 입력하세요 = ");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt(); 
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 입력한 " + month + "월의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 입력한 " + month + "월의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 입력한 " + month + " 월의 계절은 가을입니다.");
			break;
		default:
			System.out.println("현재 입력한 월의 계절은 겨울입니다.");
		}
	}
}
