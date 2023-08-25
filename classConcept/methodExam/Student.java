package methodExam;

public class Student {
	private String name;
	private int kor, eng, math, total;
	private double average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		setTotal();
		return total;
	}
	
	private void setTotal() {
		total = kor + eng + math;
	}
	
	public double getAverage() {
		average = total / 3.0;
		String tmp = String.format("%.2f", average);
		average = Double.parseDouble(tmp);
		return average;
	}

}
















