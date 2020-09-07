package kr.smhrd;

public class MyUtil {
	// 1~10까지의 총 합을 구하
	public int hap() {
		int sum = 0;
		for (int i=1;i<=10;i++) {
			// 왜수정이 안되누
			sum+=i;
		}
		return sum;
	}
}
