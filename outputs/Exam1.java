package outputs;

public class Exam1 {
	// main method : 프로그램을 시작하면 첫번째로 실행되는 메서드
	// 예약어 : 어떤 기능을 갖고 있다.
	// 매개변수 : parameter, argument
	// : 메서드를 실행하기 직전에 전달할 데이터를 저장하는 공간.
	public static void main(String[] args) {
		System.out.println("println 메서드");
		System.out.println("System & out 클래스"); 
		System.out.println(" . 참조연산자 : 내부에 들어간다. ");
		// 코드 실행 : Ctrl + F11
		
		/*
		System.out.print("print 메서드\n");
		System.out.print("이름 : ");
		System.out.print("\n나이 : ");
		*/
		System.out.printf("printf 메서드\n");
		System.out.printf("%d원\n", 10000);
		System.out.printf("%d년 %02d월 %02d일\n", 2023, 4, 9);
		System.out.printf("%.1f달러\n", 101.12);
		/*
		 서식문자열(format string)
		  %d : 정수 데이터
		  %f : 실수 데이터
		  %s : 문자열 데이터
		 */
		
		System.out.println("이름\t주소");
		System.out.println(" \"이름\" ");
		// "" 문자열 데이터의 시작과 끝
		System.out.println(" \\이름\\ ");
		
	}
}










