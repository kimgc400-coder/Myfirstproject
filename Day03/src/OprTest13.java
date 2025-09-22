//if 조건문에 관한 실습
/*문제)스케너를 활용해서 정수숫자를 입력받은 다음 if조건문을 사용하여 숫자0을
		 * 입력했을 때는 "입력한 숫자는 0입니다."라고 출력되게 하고
		 * 또 다른 if 조건문을 활용해서 0이 아닐때는 "입력하신 숫자는 0이 아닙니다."
		 * 라고 출력되게 하는 자바 프로그램을 만들어 본다.
		 *ctrl+A로 전체 선택하고 ctrl+i단축키를 누르면 자동정렬된다.
		 */

import java.util.Scanner;

public class OprTest13 {
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("정수숫자를 입력하세요>>");
		
		String num1 = scan.nextLine();
		int num2 = Integer.parseInt(num1);

		if(num2 == 0) {
			
			System.out.print("입력한 숫자는 0입니다.");	
		}
		
		if(!(num2==0)) {
			System.out.print("입력한 숫자는 0이 아닙니다.");
		}
		

	}

}
