package loopFor;

import java.util.Scanner;

public class Quiz8 {
	public static void main(String[] args) {
		
		 /*
		  * 3x + 2y = 10의 해를 구하세요. 단 x, y는 정수이며, 0<= x, y <= 10을 만족함.
		 */
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(3*x + 2*y == 10)
					System.out.println(x + ", " + y);
			}
		}
		
		/*
		 * 2에서부터 입력된 어떤 수까지 내에 있는 소수를 찾는 프로그램을 작성하라.
		 */ 
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int end = sc.nextInt();
		for(int i = 2; i <= end; i++) {
			
			boolean result = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0)
					result = false;
			}
			
			if(result) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}
}
