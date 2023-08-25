package conditions;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*
		학점을 입력 받아 구문하여 문자열 출력.
		입력 데이터는 문자 A - F
		A와B는 “참 잘했어요“
		C와D는 “분발합시다.“
		F는 아무것도 출력하지 않는다.
	 */
		
//		System.out.print("학점 입력(A-F) : ");
//		char grade = sc.next().toUpperCase().charAt(0);
//		
//		if(grade == 'A' || grade == 'B') {
//			System.out.println("참 잘했어요.");
//		}else if(grade == 'C' || grade =='D') {
//			System.out.println("분발합시다.");
//		}
		
		System.out.print("학점 입력(A-F) : ");
		String grade = sc.next().toUpperCase();
		if(grade.equals("A") || grade.equals("B")) {
			System.out.println("참 잘했어요.");
		}else if(grade.equals("C") || grade.equals("D")) {
			System.out.println("분발합시다.");
		}
		
	/*
		년도를 입력 받아 윤년/평년 판별해주는 프로그램을 작성하시오.
		연수가 4로 나누어 떨어지는 해는 윤년 
		(1988년, 1992년, 1996년, 2004년, 2008년, 2012년, 2016년, 2020년…)
		연수가 4, 100으로 나누어 떨어지는 해는 평년
		 (1900년, 2100년, 2200년, 2300년, 2500년...) 
		연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. 
		(2000년, 2400년...)
	 */
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		String message = "평년";
		
		if(year % 4 == 0) {
			message = "윤년";
			if(year % 100 == 0) {
				message = "평년";
				if(year % 400 == 0)
					message = "윤년";
			}
		}
		System.out.println(year +"년은 " + message+"입니다.");
	}
}









