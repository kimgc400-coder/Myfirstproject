/*switch ~ case 다중 선택문(조건문)형식 : 
 * switch(정수식) {
 * 	case 값 : 실행문장; break
 * 	..
 * default : 해당사항 없을 때 실행; 
 * }
 * 
 * 정수식과 case 값이 일치하면 해당 실행문장을 
 * 수행 후 break문을 만나서 switch~case문을 종료한다. 
 * 해당사항이 없다면 default 문장을 수행한다.
 * 
 */

// switch ~ case 문에 break문을 생략한 관리자 단 등급 처리에 관한 실습

import java.util.Scanner;

public class OprTest10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("관리자 등급 6~9사이 입력>>");
		int grade = Integer.parseInt(scan.nextLine());//문자열로 입력받아서 정수 숫자로 바꿔서 저장
		
		if(grade >= 6 && grade <= 9) {
			System.out.print("입력하신 등급 " + grade +"는(은) ");
			
			switch(grade) {
			case 9: System.out.println("최고 관리자 등급입니다.");
			case 8: System.out.println("관리자 등급입니다.");
			case 7: System.out.println("중간 관리자 등급입니다.");
			case 6: System.out.println("사용자 등급입니다.");
			}
		}else {
			System.out.println("6~9사이 관리자 등급만 입력하세요!");
		}
		
		

	}

}
