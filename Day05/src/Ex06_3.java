/*
 * No.20 3번 문제
 * 10 부터 1사이의 짝수를 10,8,6,4,2로 출력하는 자바 프로그램을 만들어 본다.(단,  출력하고 ,가 출력안되게 해야 한다.)
 * while 반복문을 사용
 */
public class Ex06_3 {

	public static void main(String[] args) {
		
		int i = 10;
		while(i>=4) {
			System.out.print(i+",");
			i-=2;
		}
		System.out.print(i);
		
	}

}
