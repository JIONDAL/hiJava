package conditions;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		입력한 데이터가 3의 배수인 경우 출력하시오
		System.out.print("입력 : ");
		int data = sc.nextInt();
		if(data % 3 == 0) {
			System.out.println(data + "는/은 3의 배수이다.");
		}
		
//		입력한 수의 절대 값을 구하는 프로그램을 작성하시오
		System.out.print("입력 : ");
		data = sc.nextInt();
		int result = data;
		if(data < 0)
			result = -data;
		System.out.println(data +"의 절대 값은 " + result + "이다.");
		
//		두 수를 입력 받아 큰 수를 출력 하시오
		System.out.print("입력 : ");
		data = sc.nextInt();
		int data2 = sc.nextInt();
		
		int max = data;
		if(max < data2)
			max = data2;

		System.out.println(data + "과/와 " + data2 + " 중 큰 수는 "+ max + "입니다.");
		
	}
}




