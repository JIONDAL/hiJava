package inheritance3;

public class PartTime extends Employee{
	private int time;
	private int pay;
	
	public PartTime(String name, int time, int pay) {
		super.setName(name);
		this.time = time;
		this.pay = pay;
	}
	
	@Override
	public int getSalary(){
		return time * pay;
	}
}



