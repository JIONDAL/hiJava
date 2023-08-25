package inputs;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		sc.nextLine();// buffer 청소
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();
		System.out.println("주소 : " + addr);
		
		sc.close();
	}

}





