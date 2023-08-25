package inputs;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// String name;
		// 자료형 변수명;
		Scanner sc;
		
		// sc = 참조 값(주소)
		/*
		 new : 클래스를 실행해줘. 클래스(class)는 실행된 상태를 인스턴스(instance)
		 // 클래스 : 건물의 설계도, 인스턴스 : 설계도로 만들어진 건물
		 System.in : 운영체제 입력
		 */
		sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		sc.next();
		
		System.out.print("문자열 : ");
		sc.nextLine();
		
		System.out.print("정수 : ");
		sc.nextInt();
		sc.nextInt();
		
		System.out.print("실수 : ");
		sc.nextDouble();
		
		
		
	
		
	}

}





