package strings;

public class Quiz4 {

	public static void main(String[] args) {
		/*
		 * “FF590-2DX83-M81LZ-XDM7E-MKUT4” 문자열에 있는 정수의 합계를 구하세요.
		 * ex) 590 + 283 + 81 + 7 + 4 = 965
		 */
		
		String data = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		String[] datas = data.split("-");
		int total = 0;
		
		for(int i = 0; i < datas.length; i++) {
			String tmp = datas[i].replaceAll("[^0-9]", "");
			total = total + Integer.parseInt(tmp);
		}
	
		System.out.println("합계 : " + total);
	}

}




