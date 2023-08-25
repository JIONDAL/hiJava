package loopWhile;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 쌀 102통(1통 == 1KG)이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다. 
		 쥐 한마리가 하루에 20g씩의 쌀을 먹고, 10일(10,20,30)마다 쥐의 수가 2배씩 증가한다. 
		 며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇 마리 인가?
		 */
		
		int rice = 102 * 1000;
		int mouse = 2;
		int day = 0;
		while(true) {
			day++;
			rice = rice - mouse * 20;
			
			if(day % 10 == 0)
				mouse *= 2;
			
			if(rice <= 0) 
				break;
		}
		
		System.out.println("쥐는 " + mouse +"마리, " + day + "일, 쌀은 " + rice);
		/*
		 * 1*2 – 2*3 + 3*4 – 4*5 + 5*6 - …와 같은 규칙으로 합계를 구할 때 
		 * 합이 100이 넘는 마지막 수 2개를 구하는 프로그램을 작성하여라
		 */

		int data = 1;
		int total = 0;

		while(true) {
			if(data % 2 == 1) {
				total = total + data * (data+1);
			}else {
				total = total - data * (data+1);
			}
//			System.out.println(data + " x " + (data+1) + " = " + total);
			if(total > 100)
				break;
			
			data++;
		}
		System.out.println(data + ", " + (data+1));
		System.out.println("합계 : " + total);
	}
}



