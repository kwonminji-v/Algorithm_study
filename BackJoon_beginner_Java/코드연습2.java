package BackJoon_beginner_Java;

public class 코드연습2 {
	
	class Book {
		
		String nameString = "수험서";
		
		void getPrice(String name) {
			System.out.println("name = " + name);
		}
	}
	
	class Price extends Book {
		
		String price = "10,000원";
		
		void getPrice(String name) {
			super.getPrice(name);
			System.out.println("price : " + price);
		}
	}

	public static void main(String[] args) {

		Book book = new Price();
		book.getPrice("정보처리기사");
		
	}

}
