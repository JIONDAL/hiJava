package switchs;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		/*
		switch(정수 또는 문자열){
			case ? : 실행할 문장; 실행할 문장; break;
			case ? : 실행할 문장; 실행할 문장; break;
			default :  실행할 문장; 실행할 문장;
		}
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int select = sc.nextInt(); // 97, 65, 48
//		char select = sc.next().charAt(0);
		switch (select) {
			case 'a':	
					System.out.println("case a : " + select); 
					break;
			case 'A':	System.out.println("case A : " + select); break;
			case '0':	System.out.println("case 0 : " + select); break;
			default: System.out.println("default : a, A, 0이 아닌 수");
		}

		System.out.println("다음 문장");
	}

}
