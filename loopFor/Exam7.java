package loopFor;

public class Exam7 {
	public static void main(String[] args) {
		int i, j, line, star, space;
		line = 8;
		star = 1;
		space = line-1;
		for (i = 0; i < line; i++) {
			
			for (j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < star; j++)
				System.out.print("*");
			
			System.out.println();
			
			star += 2;
			space--;
		}

	}
}
