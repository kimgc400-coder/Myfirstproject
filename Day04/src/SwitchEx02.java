/*switch ~ case  다중 선택문을 활용한 봄,여름,가을,겨울 계절 구하기
 * 
 */

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1월부터 12월 사이 월을 입력>>");
		int month = Integer.parseInt(scan.nextLine());
		
		if(month >= 1 && month <= 12) {
			switch(month) {
			case 6: case 7: case 8: System.out.println("입력하신 "+month+"월은 여름입니다.");
			break;
			case 9: case 10: case 11: System.out.println("입력하신 "+month+"월은 가을입니다.");
			break;
			case 12: case 1: case 2: System.out.println("입력하신 "+month+"월은 겨울입니다.");
			break;
			default : System.out.println("입력하신 "+month+"월은 봄입니다.");
			}
		}else {
			System.out.println("1월브터 12월 사이만 입력하세요!");
		}

	}

}
