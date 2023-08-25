package conditions;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		수를 입력 받아 5의 배수이다/아니다. 구분하여 출력
//		ex) 입력 : 10 ,  결과 : 5의 배수 입니다.
		System.out.print("입력 : ");
		int data = sc.nextInt();
		if(data % 5 != 0)
			System.out.println(data + "는/은 5의 배수가 아니다.");
		else
			System.out.println(data + "는/은 5의 배수이다.");
			
//		수를 입력 받아 0보다 크고 100보다 작으면 적중범위/비적중범위 구분하여 출력
		System.out.print("입력 : ");
		data = sc.nextInt();
		if(data > 0 && data < 100) {
			System.out.println(data + "는/은 적중범위입니다.");
		}else {
			System.out.println(data + "는/은 비적중범위입니다.");
		}
		
//		수를 입력 받아 짝수이고 3의 배수이다/아니다. 구분하여 출력
		System.out.print("입력 : ");
		data = sc.nextInt();
		if(data % 6 == 0) {
			System.out.println(data + "은/는 짝수이고, 3의 배수이다.");
		}else {
			System.out.println(data + "은/는 무엇도 아니다.");
		}
	}
}









