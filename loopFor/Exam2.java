package loopFor;

public class Exam2 {

	public static void main(String[] args) {
		int i, total = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
			total = total + i;
		}
		System.out.println("1~10 합계 : " + total);
		
		total = 0;
		for(i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println("1~100 합계 : " + total);
		
		total = 0;
		for(i = 111; i <= 222; i++) {
			total = total + i;
		}
		System.out.println("111~122 합계 : " + total);
		
		total = 0;
		for(i = 1; i <= 100; i+=2) {
			total = total + i;
		}
		System.out.println("1~100 홀수 합계 : " + total);
		
		total = 0;
		for(i = 2; i <= 100; i+=2) {
			total = total + i;
		}
		System.out.println("1~100 짝수 합계 : " + total);
		
		int evenTotal = 0;
		int oddTotal = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0)
				evenTotal = evenTotal + i;
			else 
				oddTotal += i;
		}
		System.out.println("1~100 짝수 합계 : " + evenTotal);
		System.out.println("1~100 홀수 합계 : " + oddTotal);
		
	}

}








