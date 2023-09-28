package BackJoon_beginner_Java;

public class C언어연습 {

	
	int Soojebi(int num) {
		int i;
		for(i=2; i<num; i++) {
			if(num % i == 0)
				return 0;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		int cnt = 0;
		int i;
		
		for(i=2; i<num; i++) 
			cnt += Soojebi(i);
		System.out.println(cnt);

	}

}
