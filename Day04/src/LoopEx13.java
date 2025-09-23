/*
 * 스캐너와 이중 for 반복문
 */

import java.util.Scanner;

public class LoopEx13 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("#을 출력할 라인 줄수를 입력>>");
		int lineNumber = Integer.parseInt(scan.nextLine());
		
		
		/*
		 * 문제) 이중 for 반복문을 활용하여 #을 다음과 같게 출력되게 만든다.
		 */
		
		
		for(int i = 1;i<=lineNumber;i++) {
			
			for(int j = 6; j>i  ;j--) {
				System.out.print(" #");
			}
			System.out.println();
		}
		
	}
}
