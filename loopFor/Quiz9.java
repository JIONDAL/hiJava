package loopFor;

public class Quiz9 {
	public static void main(String[] args) {

		/*
		 * 1~1000사이에 있는 자연수에 대하여 자기 자신의 수를 제외한  
		 * 모든 약수의 합이 자신과 같아지는 수(완전수)를 구하여라. 
		 * 예) 6의 약수 = 1, 2, 3, 6 
		 * 1+2+3 = 6(완전수)
		 */
		
		for(int i = 1; i <= 1000; i++) {
			int total = 0;
			
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					total += j;
				}
//				if(i == 496 && i % j == 0) {
//					System.out.println(i + " % " + j + " = " + (i%j));
//				}
			}
			
			if(i == total)
				System.out.println(i);
		}
	}
}



