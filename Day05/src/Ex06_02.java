/*
 * 06장.반복문.pdf No.19 2번문제
 * 1부터 입력받은 숫자값까지 홀수를 출력하는 프로그램을 작성(단, 하나는 for반복문에서 1씩 증가 하면서 if조건문과%나머지 연산을 사용해야 하고,
 * 또 다른 하나 for반복문은 2씩증가하면 된다.)
 */

import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String inputNum = scan.nextLine();
		num = Integer.parseInt(inputNum);
		
		for(int i = 1; i<=num; i++) {
			if(i%2==1) {
				System.out.println("출력 : 홀수" );
			}else {
				System.out.println("출력 : 짝수");
			}
		}
	
		
		
		
		

	}

}
