package methodExam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 절대 값을 구하는 함수를 정의하시오  (Absolute.java)
		 * 
		 * 점수를 입력 받아 A~F학점을 출력하시오. (Grade.java)
		 *  - 90이상 A, 80이상 B, 70이상 C, 60이상 D, 그 외 F
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Absolute absolute = new Absolute();
		System.out.print("정수 입력 : ");
		absolute.setData(sc.nextInt());
		System.out.println(absolute.getData() + "의 절대 값은 " + absolute.getAbs() + "입니다.");
		
		Grade grade = new Grade();
		System.out.print("점수 입력 : ");
		grade.setScore(sc.nextInt());
		System.out.println(grade.getScore() + "점은 " + grade.getGrade() + "학점 입니다.");
	}
}
