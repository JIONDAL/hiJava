package constructor;

//3명의 이름, 시간, 시급 입력

public class PartTime {
	private String name;
	private int time;
	private int pay;
	
	public PartTime(String name, int time, int pay) {
//		super();// 부모의 생성자를 호출
//		this(); // 자신의 생성자를 호출
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary(){
		return time * pay;
	}
}



