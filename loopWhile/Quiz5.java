package loopWhile;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.앞면");
			System.out.print(" / 2.뒷면");
			System.out.println(" / 3.나가기");
			System.out.print(">>> ");
			
			int user;
			try {
				user = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
				continue;
			}
			
			if(user == 3) {
				System.out.println("프로그램을 종료합니다."); 
				System.exit(0);
			}
			
			if( !(user == 1 || user == 2))
				continue;
			
			int com = (int)(Math.random() * 2) + 1;
			System.out.println("com : " + com);
			
			if(user == com) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}



