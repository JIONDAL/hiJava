package arrays;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] subjects = new String[] {"국어", "영어", "수학"};
		int[] scores = new int[subjects.length + 1];
		
		for(int i = 0; i < subjects.length; i++) {
			while(true) {
				System.out.print(subjects[i] + " 점수 : ");
				
				try {
					scores[i] = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
					continue;
				}
				
				if(scores[i] >= 0 && scores[i] <= 100)
					break;
			}
			scores[subjects.length] += scores[i];
		}
		
		System.out.println("총점 : " + scores[subjects.length]);
		System.out.println("평균 : " + scores[subjects.length] / (double)subjects.length);
	}
}








