package conditions;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time, cost, kor, eng, math;
		double average;
		String message = null;
		
		System.out.println("\n국,영,수 점수를 입력 받아 평균 60점 이상,");
		System.out.println("과목 점수가 40점 이상이면 합격이다.");
		System.out.println("그 외는 불합격, 불합격 일 경우는 사유를 출력한다.");
		System.out.println("\"평균 불합격\", \"어떤 과목 불합격\"");
		
		System.out.print("국어 점수 입력: "); kor = sc.nextInt();
		System.out.print("영어 점수 입력: "); eng = sc.nextInt();
		System.out.print("수학 점수 입력: "); math = sc.nextInt();
		average = (kor+eng+math) / 3.0;
		if(average >= 60) {
			if(kor < 40) {
				message = "국어 불합격";
			}else if(eng < 40) {
				message = "영어 불합격";
			}else if(math < 40) {
				message = "수학 불합격";
			}else{
				message = "합격";
			}
		}else {
			message = "평균 불합격";
		}
		
		System.out.println(message + " : " + average);
		System.out.printf("%s: %.2f\n", message, average);
		
		System.out.println("\n주차장 기본 요금은 30분에 3000원이며,");
		System.out.println("10분 단위로 추가요금 500원씩 부가된다. ");
		System.out.println("이용 시간을 입력하여 요금 계산기를 만드시오.");
		System.out.print("이용 시간 : ");
		time = sc.nextInt();
		cost = 3000;
		if (time > 30)
			cost = cost + (time - 21) / 10 * 500;
		else if(time < 0)
			cost = 0;
		System.out.println("이용 시간은 " + time + "분이고, 비용은 " + cost + "원 입니다.");
	}
}









