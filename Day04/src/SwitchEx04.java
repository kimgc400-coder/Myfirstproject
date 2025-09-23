/*switch ~ case 다중 선택문을 활용해서 주민번호 뒷자리 첫번째 값이 1,3인 경우는 남자, 
 *2,4인 경우는 여자를 구하는 소스예) 
 * 
 */

import java.util.Scanner;

public class SwitchEx04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("샘플 주민번호 입력(990810-1234567)>>");
		char juminNo = scan.nextLine().charAt(7);//첫 주민번호를 0부터 시작해서 8번째주민번호 단일문자 하나를 구함.
		
		switch(juminNo) {
		case '1' :
		case '3' : System.out.println("당신은 남자입니다."); break;
		case '2' :
		case '4' : System.out.println("당신은 여자입니다."); break;
		default : System.out.println("유효하지 않은 주민번호 입니다."); break;
		}
		
		

	}

}
