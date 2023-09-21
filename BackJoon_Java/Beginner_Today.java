package BackJoon_Java;

import java.time.LocalDateTime;

public class Beginner_Today {

		public static void main(String[] args) {
			
			String today = LocalDateTime.now().toString();
			
			System.out.println(today.substring(0, 10));
	}

}
