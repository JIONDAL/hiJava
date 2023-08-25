package loopFor;

public class Exam1 {

	public static void main(String[] args) {
		int i;
		// 1, 2,3,4,5,6,7,8
		for(i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
		}
		System.out.println("for문이 끝나고 i의 데이터 : " + i);

		//5,4,3,2,1
		for(i = 5; i > 0; i--) {
			System.out.println("i : " + i);
		}
		System.out.println("for문이 끝나고 i의 데이터 : " + i);
		
		System.out.println();
		for(i = 11; i <= 20; i++)
			System.out.print(i + " ");
		System.out.println();
		
		for(i = 20; i > 10; i--)
			System.out.print(i + " ");
		System.out.println();
	}

}








