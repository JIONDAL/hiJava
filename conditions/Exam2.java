package conditions;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int data;
		System.out.print("입력 : ");
		data = input.nextInt();

		if (data > 10) {
			System.out.println("종속 문장 실행");
			System.out.println("종속 문장 실행");
		}
		System.out.println("다음 문장");
	}
}
