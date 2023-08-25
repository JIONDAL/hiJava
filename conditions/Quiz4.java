package conditions;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 세 수 중 최대/최소 값 구하는 프로그램 작성
		 */
		int data1, data2, data3, max, min;

		System.out.print("세 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		data3 = sc.nextInt();

		max = data1;
		min = data2;
		if (data1 < data2) {
			max = data2;
			min = data1;
		}
		
		if (max < data3)
			max = data3;
		else if(min > data3)
			min = data3;
		
		System.out.println(data1 + ", " + data2 + ", "+data3 + "중 최대값은 " + max + "입니다.");
		System.out.println(data1 + ", " + data2 + ", "+data3 + "중 최소값은 " + min + "입니다.");
		
		/*
		정수를 입력받아 아래와 같이 출력하시오.
			1) 3의배수이면서, 4의배수에도 해당 => [ ]은(는) 3의 배수이면서, 4의 배수입니다.
			2) 3의배수에만 해당 => [ ]은(는) 3의 배수입니다.
			3) 4의배수에만 해당 => [ ]은(는)4 의 배수입니다.
			4) 3의배수도, 4의배수도 해당안됨 => [ ]은(는) 3의배수도 4의배수도 아닙니다.
			5) ( 0 입력 시 다시 입력)
			=======>입력 받은 값에 따라 출력 되게 만드세요.<======
		*/
		
		System.out.print("수 입력 : ");
		data1 = sc.nextInt();
		
		if(data1 == 0) {
			System.out.println("다시 입력하세요.");
		}else if(data1 % 12 == 0) {
			System.out.println("[" + data1  +"]은(는) 3의 배수이면서, 4의 배수입니다.");
		}else if(data1 % 3 == 0) {
			System.out.println("[" + data1  +"]은(는) 3의 배수입니다.");
		}else if(data1 % 4 == 0) {
			System.out.println("[" + data1  +"]은(는) 4의 배수입니다.");
		}else {
			System.out.println("[" + data1  +"]은(는) 3의배수도 4의배수도 아닙니다.");
		}
		
	}
}









