/*
 * 06장.반복문.pdf No.19 2번문제
 * 1부터 입력받은 숫자값까지 홀수를 출력하는 프로그램을 작성(단, 하나는 for반복문에서 1씩 증가 하면서 if조건문과%나머지 연산을 사용해야 하고,
 * 또 다른 하나 for반복문은 2씩증가하면 된다.)
 */

import java.util.Scanner;

public class Ex06_2_A {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("숫자 입력>>");
	int count = Integer.parseInt(scan.nextLine());
	
	for(int i =1; i<=count;i++) {
		if(i%2 == 1) {
			System.out.print(" "+i);
		}
		System.out.println("\n ===============\n");
		
		}
	}
	}
