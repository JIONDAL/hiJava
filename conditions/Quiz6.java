package conditions;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coffee, cost, snack, time;

		System.out.println("커피의 개당 가격은 2000원이다. 10개 초과하면 초과하는 양에 대해서만");
		System.out.println("개당 1500원씩 받는다. 커피의 개수를 입력 받아 금액을 출력하시오.");
		System.out.print("커피 수량 : ");
		coffee = sc.nextInt();
		cost = coffee * 2000;

		if (coffee > 10)
			cost = cost - ((coffee - 10) * 500);

		System.out.println("커피 " + coffee + "잔에 " + cost + "원 입니다.");

		System.out.println("\n과자 1개에 1000원, 한 번에 10개 이상을 사면 전체 금액의 10%할인 그리고");
		System.out.println("100개 이상을 사면 전체 금액의 12%할인한다. 개수를 입력 받아서 금액을 계산하는 프로그램 작성");
		System.out.print("과자 수량 : ");
		snack = sc.nextInt();
		cost = snack * 1000;
		
		if (snack >= 100) {
			cost = (int)(cost * 0.88);
		} else if (snack >= 10) {
			cost = cost * 90 / 100;
		}
		System.out.println("과자 " + snack + "봉지에 " + cost + "원 입니다.");
	}
}









