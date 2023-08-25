package loopFor;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 다음과 같이 출력하시오.
			1. hello
			2. hello
			3. hello
			4. hello
		 */
		int i;
		for(i = 1; i <= 4; i++)
			System.out.println(i +". hello");
		/*
			1 ~ 100 까지의 합 중에서 그 합이 528 일 때 i의 값을 출력 하시오
		 */
		int total = 0;
		for(i = 1; i <= 100 ;i++) {
			total += i;
			if(total == 528)
				System.out.println("합계 : " + total +", i의 데이터 : " + i);
		}
		/*
			for문을 이용하여 아래와 같이 출력 하시오.
			1	2	3	4	5	
			6	7	8	9	10	
			11	12	13	14	15	
			16	17	18	19	20	
			21	22	23	24	25
		 */
		for(i = 1; i < 26 ;i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0)
				System.out.println();
		}
	}

}








