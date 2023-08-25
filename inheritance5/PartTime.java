package inheritance5;

public class PartTime extends Employee implements IEmployee{
	private int time;
	private int pay;
	
	public PartTime(String name, int time, int pay) {
		super.setName(name);
		this.time = time;
		this.pay = pay;
	}

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public int getSalary() {
		return pay * time;
	}
	

}



