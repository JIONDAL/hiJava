package outputs;

public class Exam2 {

	public static void main(String[] args) {
		System.out.println(100 + 100);
		System.out.println(200.22 + 200);
		System.out.println(200.11 + 100.22);
		
		// "" 쌍따옴표로 데이터를 표현하면 문자열 데이터
		System.out.println("100" + 100);
		System.out.println("200.22" + 200);
		System.out.println(200.11 + "100.22");
		
		System.out.println("결과 : " + 10000 + "원");
		System.out.println("결과 : 10000원");
		System.out.printf("결과 : %d원", 10000);
	}

}
