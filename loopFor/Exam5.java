package loopFor;

public class Exam5 {
	public static void main(String[] args) {
		int i, j, sum = 0;
		
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 3; j++) {
				sum += 1;
			}
		}
		
		System.out.println("sum: " + sum);

	}

}
