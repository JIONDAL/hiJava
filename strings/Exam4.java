package strings;

public class Exam4 {

	public static void main(String[] args) {
		String str = new String(" Have a nice day   ");

		String result = str.trim(); // 왼쪽 오른쪽 끝에 공백제거
		System.out.println("--" + str + "--");
		System.out.println("--" + result + "--");
		
		String[] datas = result.split(" ");
		for(int i = 0; i < datas.length; i++)
			System.out.println(datas[i]);
		
		/*
		 *  향상 for문
		 *  for(변수 : 데이터들) {
			
			}
		 */
		System.out.println("향상 for문 결과");
		
		for(String data : datas) {
			System.out.println(data);
		}
		
		String replace = result.replace(" ", "^");
		System.out.println("result : " + result);
		System.out.println("replace : " + replace);
	}

}






