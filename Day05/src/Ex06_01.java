/*
 * 06장.반복문.pdf No.18 1번문제
 * 문자와 숫자를 입력받아 문자를 입력받은 숫자만큼 반복출력하는 자바프로그램 코드를 만들어 보자
 * for 반복문 활용
 */

import java.util.Scanner;

public class Ex06_01 {
	public static void main(String[] args) {


		int num = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("문자와 숫자를 입력하세요");
		String inputNumber = scan.nextLine();
		System.out.print("반복할 횟수 숫자 입력>>");
		num = Integer.parseInt(inputNumber);

		for(int i =1;i<=num;i++) {
			System.out.println(i+"번"+ inputNumber);
		}


	}

}
