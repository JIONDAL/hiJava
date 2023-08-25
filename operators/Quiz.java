package operators;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		수를 입력 받아 짝/홀수를 구분하여 출력 하시오.
		System.out.print("수 입력 : ");
		int data = sc.nextInt();
		String result = (data % 2 == 0) ? "짝수" : "홀수";
		System.out.println(data + "은/는 " + result + "입니다.");
		
//		수를 입력 받아 3의 배수이다/아니다 구분해서 출력하시오.
		System.out.print("수 입력 : ");
		data = sc.nextInt();
		result = (data % 3 == 0) ? "3의 배수입니다." : "3의 배수가 아닙니다.";
		System.out.println(data + "은/는 " + result);
		
//		두 수를 입력 받아 큰 수를 출력 하시오.
		System.out.print("두 수 입력 : ");
		data = sc.nextInt();
		int data2 = sc.nextInt();
		int max = (data > data2) ? data : data2;
		System.out.println(data + "과/와 " + data2 + "중 큰 수는 " + max + "입니다.");
		
		result = (data == data2) ? data + "과/와 " + data2 + "는 동일한 수 입니다." : 
			( (data > data2) ?data + "과/와 " + data2 + "중 큰 수는 " + data + "입니다." :
				data + "과/와 " + data2 + "중 큰 수는 " + data2 + "입니다.");
		
		System.out.println(result);
	}
}














