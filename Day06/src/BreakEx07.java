/*while 무한루프문을 사용한 점심 메뉴 선택 예제*/


import java.util.Scanner;

public class BreakEx07 {

	public static void main(String[] args) {
		
		int menu = 0;//선택한 메뉴번호
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1- 물냉면");
			System.out.println("2- 순대국밥");
			System.out.println("3- 짜장밥");
			System.out.print("원하는 점심메뉴(1~3)를 선택하세요.(종료:0)>>");
			
			menu = Integer.parseInt(scan.nextLine());//문자열로 입력받아 정수 숫자로 변경해서 저장
			
			if(menu == 0) {
				System.out.println("점심 메뉴 선택프로그램을 종료합니다.");
				break;//while 무한루프문 종료
			}else if(!(menu >=1 && menu <=3)) {
				System.out.print("점심 메뉴번호를 잘못 선택했습니다.!(종료:0>>)");
				continue;//아래문장을 수행 안하고 다음 반복을 위해서 반복문 처음으로 돌아가 다음 반복을 계속한다.
			}//if else if 다중조건문
			
			System.out.println("선택한 메뉴번호는 "+menu+" 번 입니다.");
		}



	}

}
