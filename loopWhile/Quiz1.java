package loopWhile;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 영문자 ‘q’가 입력될 때 까지 반복을 수행하세요.
		 */
		while(true) {
			System.out.print("입력 : ");
			char data = input.next().toLowerCase().charAt(0);
			System.out.println(data);
			if(data == 'q') {
				break;
			}
		}
		
		/*
		 * 입력된 수의 각 자리수의 합을 구하는 프로그램을 작성하라.
		*/
		System.out.print("\n수 입력 : ");
		int i = input.nextInt();
		int total = 0;
		int tmp = i;
		while (true) {
			total = total + tmp % 10;
			tmp = tmp / 10;
			if (tmp == 0)
				break;
		}
		System.out.println(i + "의 합계 : " + total);
		
	
	/*
	 *입력된 수를 거꾸로 정수형 변수에 담아 출력하시오.(예 123 -> 321) 
	 */
		System.out.print("\n수 입력 : ");
		i = input.nextInt();
		total = 0;
		tmp = i;
		while (true) {
			/*
			 123
			 123 % 10 = 3
			 total(3) = total(0) + 3
			 total(30) = total(3) * 10;
			 
			 12 % 10 = 2
			 total(32) = total(30) + 2;
			 total(320) = total(32) * 10;
			 
			 1 % 10 = 1
			 total(321) = total(320) + 1;
			 */
			total = total + tmp % 10;
			tmp = tmp / 10;
			if (tmp == 0)
				break;
			total *= 10;
		}
		System.out.println(i + "의 거꾸로 된 정수 : " + total);
	}
}



