package loopWhile;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String regId, regPw, loginId, loginPw;
		regId = regPw = "";
		
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.나가기");
			System.out.print(">>> ");
			String select = sc.next();
			
			switch(select) {
			case "1" : 
					System.out.print("저장할 아이디 입력 : ");
					regId = sc.next();
					System.out.print("저장할 비밀번호 입력 : ");
					regPw = sc.next();
					break;
			case "2" : 
					System.out.print("아이디 입력 : ");
					loginId = sc.next();
					System.out.print("비밀번호 입력 : ");
					loginPw = sc.next();
					
					if(loginId.equals(regId) && loginPw.equals(regPw)) {
						System.out.println("인증 성공 !!!");
					}else
						System.out.println("인증 실패 !!!");
					break;
			case "3" : 
					System.out.println("프로그램을 종료합니다."); 
					System.exit(0);
			default : System.out.println("다시 입력하세요.");
			}
		}
	}
}



