package constructor;

public class Student {
	private String name;
	private int kor, eng, math, total;
	private double average;  
	
	/*
	 *  기본생성자(default Constructor)
	 *  - 생성자 한 개도 없으면 자동으로 만들어짐
	 *  - 생성자가 한 개라도 있다면 자동으로 만들어지지 않음
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 : new Student(); 클래스를 인스턴스로 만들때 한번 동작
	// 데이터는 딱한번만 입력 가능
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		total = kor + eng + math;
		return total;
	}
	
	public double getAverage() {
		average = total / 3.0;
		String tmp = String.format("%.2f", average);
		average = Double.parseDouble(tmp);
		return average;
	}

}
















