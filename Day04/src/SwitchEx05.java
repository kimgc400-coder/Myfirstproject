/*중첩 스위치 케이스 문 사용예 */

import java.util.Scanner;

public class SwitchEx05 {
	public static void main(String[] args) {
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력(981025-2812345)>>");
		String juminNumber = scan.nextLine();
		char juNo = juminNumber.charAt(7);//charAt(7) 내장메서드는 첫 문자를 0부터 시작해서 주민번호 뒷자리 첫번째 단일문자를 구함 즉 8번째
		//단일 문자를 구함
		
		switch(juNo) {
		case '1': case '3':
			switch(juNo) {
			case '1' : System.out.println("당신은 2000년 이전에 태어난 남자입니다."); break;
			case '3' : System.out.println("당신은 2000년 이후에 태어난 남자입니다."); break;
			
			}
		break;
		
		case'2' : case'4':
			switch(juNo) {
			case '2' : System.out.println("당신은 2000년 이전에 태어난 여자입니다."); break;
			case '4' : System.out.println("당신은 2000년 이전에 태어난 여자입니다."); break;
			}
		break;
		
		default : System.out.println("유효하지 않은 주민번호 입니다.");
		}//비낕쪽 스위치 케이스 문*/
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		/*
		 * 문제
		 * 스위치 케이스 다중조건문을 중첩 if else if 다중 선택문(조건문)으로 변경해 보자.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력(981025-2812345)>>");
		String juminNumber = scan.nextLine();
		char juNo = juminNumber.charAt(7);//charAt(7)
		
		if(juNo == '1' || juNo == '3') { if(juNo == '1') {
			if(juNo == '1') {
				System.out.println("당신은 2000년 이전에 태어난 남자입니다.");
			}else if(juNo == '3') {
				System.out.println("당신은 2000년 이후에 태어난 남자입니다.");
			}
		}else if(juNo == '2' || juNo == '4') {
			if(juNo == '2') {
				System.out.println("당신은 2000년 이전에 태어난 여자입니다.");
			}
		}else if(juNo == '4') {
			System.out.println("당신은 2000년 이후에 태어난 여자입니다.");
		}
		
			
		
		}else {
			System.out.println("유효하지 않은 주민번호 입니다.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
