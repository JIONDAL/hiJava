package inheritance5;

import java.util.ArrayList;

public class PermanentMain {
	public static void main(String[] args) {
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Permanent("김변수", 3000000));
		emps.add(new Permanent("이상수", 4000000));
		emps.add(new Permanent("박참조", 5000000));
		emps.add(new PartTime("김파트", 160, 9500));
		emps.add(new PartTime("이파트", 160, 10000));
		emps.add(new PartTime("박파트", 160, 15000));
		
		for(Employee emp : emps) { 
			System.out.println("이름 : " + emp.getName());
			
//			System.out.println("급여 : " + emp.getSalary()+"원");
			if(emp instanceof Permanent) {
				Permanent p = (Permanent)emp;
				System.out.println("급여 : " + p.getSalary()+"원");
			}else {
				PartTime p = (PartTime)emp;
				System.out.println("급여 : " + p.getSalary()+"원");
			}
		}
		
	}
}







