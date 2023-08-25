package loopFor;

import java.math.BigInteger;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 1에서 1000까지의 자연수중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하시오.
		 */
		int total = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 12 == 1) {
				total += i;
			}
		}
		System.out.println("합계 : " + total);
		
		/*
		 * 첫날에 1원을 저축하고, 다음날에는 전날의 2배씩 증가하는 방식이다. 30일 동안 저축한 금액을 구하시오.
		 */
		int seed = 1;
		total = 0;
		for(int i = 1; i <= 30; i++) {
			total += seed;
			seed *= 2;
//			System.out.println("seed : " + seed);
		}
		System.out.println("금액 : " + total + "원");
		
		/*
		 * 발명자가 말하길 체스 판의 첫 번째 사각형에는 밀알을 1개, 
		 * 두 번째 사각형에는 밀알을 2개, 세 번째 사각형에는 밀알을 4개 등으로 
		 * 총 64칸에 밀알을 2배씩 채워주기를 요구했다. 
		 * 이 발명가가 요구한 밀알의 총 개수는?
		 */
		
		long milSeed = 1;
		long milTotal = 0;
		for(int i = 1; i <= 64; i++) {
			milTotal += milSeed;
			milSeed *= 2;
			System.out.println("milTotal : " + milTotal );
		}
		System.out.println("밀알 : " + milTotal + "개");
		
		BigInteger bigSeed = BigInteger.ONE;
		BigInteger bigTotal = BigInteger.ZERO;
		BigInteger two = new BigInteger("2");
		for(int i = 1; i <= 64; i++) {
			bigTotal = bigTotal.add(bigSeed);
			bigSeed = bigSeed.multiply(two);
			System.out.println("bigTotal : " + bigTotal );
		}
		
		System.out.println("밀알 : " + bigTotal + "개");
	}
}





