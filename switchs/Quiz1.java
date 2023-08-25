package switchs;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String home = "", company = ""; 
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>> ");
			String select = sc.next();
			sc.nextLine();
			switch(select) {
				case "1" : 
					System.out.print("집 등록 : ");
					home = sc.nextLine();
					break;
				case "2" : 
					System.out.print("회사 등록 : ");
					company = sc.nextLine();
					break;
				case "3" : 
					System.out.println("우리 집 : " + home);
					System.out.println("회사  : " + company);
					break;
				case "4" : System.out.println("프로그램을 종료합니다."); System.exit(0);
				default : System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
	}
}




