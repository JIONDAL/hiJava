package loopFor;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 1~1000까지의 합을 구하시오. 
		 * 단 3의 배수는 제외하고 3의 배수이면서 5의 배수는 제외하지 않는 조건으로 구하시오
		 */
		int i, total = 0;
		for (i = 1; i <= 1000; i++) {
			if(i % 3 != 0)
				total = total + i;
			else if(i % 5 == 0)
				total = total + i;
		}
		System.out.println("합계 : " + total);

		/*
		 * 1부터 시작하여 홀수의 합을 구하면서 그 합이 10000을 넘지 않는 마지막 홀수를 구하는 프로그램을 작성하시오.
		 */
		total = 0;
		for(i = 1; ;i+=2) {
			total += i;
			if(total >= 10000)
				break;
		}
		System.out.println("합계 : " + total + ", 홀수 : " + i);
		
		total = 0;
		for(i = 1; total < 10000 ;i+=2) {
			total += i;
		}
		System.out.println("합계 : " + total + ", 홀수 : " + (i-2));
	}

}







