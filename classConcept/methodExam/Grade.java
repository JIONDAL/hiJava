package methodExam;

public class Grade {
	private int score;
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}

	public char getGrade() {
		char grade = 'F';
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade ='D';
		
		return grade;
	}
}
