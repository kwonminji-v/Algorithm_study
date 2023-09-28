package BackJoon_beginner_Java;

public class 코드연습_6회차 {

	public static void main(String[] args) {
		
		int i, j;
		int sum = 0;
		int arr[3][3];
		
		for(i=0; i<3; i++) {
			for(j=0;j<3;j++) {
				arr[i][j] = i+j;
				
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0;j<3;j++) {
				sum += arr[i][j];
				
			}
		}

		System.out.println(sum);
	}

}
