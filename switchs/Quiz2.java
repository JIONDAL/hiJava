package switchs;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 날짜를 입력 받아 2023년 4월의 1~30일을 입력 받아 
    	  월요일 ~ 일요일까지 요일을 출력 하시오.
		 */
		System.out.print("2023년 04월 : ");
		int day = sc.nextInt();
		
		switch(day % 7) {
			case 0 : System.out.println("금요일"); break;
			case 1 : System.out.println("토요일"); break;
			case 2 : System.out.println("일요일"); break;
			case 3 : System.out.println("월요일"); break;
			case 4 : System.out.println("화요일"); break;
			case 5 : System.out.println("수요일"); break;
			case 6 : System.out.println("목요일"); break;
		}
	}
}




