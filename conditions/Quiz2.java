package conditions;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1, data2, data3, max, total;

//		세 수를 입력 받아 큰 수를 출력 하시오
		System.out.print("세 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		data3 = sc.nextInt();

		max = data1;
		if (max < data2)
			max = data2;
		if (max < data3)
			max = data3;
		System.out.println(data1 + ", " + data2 + ", "+data3 + "중 큰 수는 " + max + "입니다.");
		
//		두 수를 입력 받아 큰 수가 짝수이면 출력하시오
		System.out.print("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		max = data1;
		if (max < data2)
			max = data2;
		if(max % 2 == 0)
			System.out.println(data1 + ", " + data2 + " 중 큰 수 : " + max);

//		두 수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오
		System.out.print("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		total = data1 + data2;
		if(total % 2 == 0 && total % 3 == 0) {
			System.out.println("합계 " + total + "은/는 짝수이고, 3의 배수이다.");
		}
		
	}
}





