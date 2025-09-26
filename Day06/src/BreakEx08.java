/*while, for 무한루프문을 사용한 여름음식 메뉴 선택 프로그램
 * 다중 반복문을 중단하기 위해서 임의의 이름붙는 반복문인 레이블명을 지정한다.
 */


import java.util.Scanner;
public class BreakEx08 {

	public static void main(String[] args) {
		
		int menuNumber = 0;//메뉴번호
		int moneyPrice = 0;//계산할 값

		Scanner scan = new Scanner(System.in);
		
		exit_loop://다중 반복문을 중단하기 위한 임의의 레이블명 지정
			while(true) {
				System.out.println("1 - 밀면");
				System.out.println("2 - 물냉면");
				System.out.println("3 - 삼계탕");
				System.out.println("원하는 여름음식 메뉴(1~3)번호를 선택하세요.(종료:0)>>");
				
				menuNumber = Integer.parseInt(scan.nextLine());
				
				if(menuNumber == 0) {
					System.out.println("여름음식 선택 메뉴판을 종료합니다.");
					break;//무한루프문 종료
				}else if(!(1 <= menuNumber && menuNumber <= 3)) {
					System.out.println("잘못된 메뉴번호를 선택했습니다.");
					continue;
				}//if else if
				
				for(;;) {
					System.out.print("계산할 값 입력(계산 종료:0, 전체 종료:99)>>");
					moneyPrice = Integer.parseInt(scan.nextLine());
					
					if(moneyPrice == 0) {
						break;//for 무한루프문 종료, 즉 계산 종료
					}
					
					if(moneyPrice == 99) {
						break exit_loop;//전체 종료 -> while,for 무한루프문 모두 종료
					}
					switch(menuNumber) {
					case 1 : System.out.println("밀면 값 : "+ moneyPrice); break;
					case 2 : System.out.println("물냉면 값 : "+ moneyPrice); break;
					case 3 : System.out.println("삼계탕 값 : "+ moneyPrice); break;
					}
					
				}//for 무한루프문
			}//while 무한루프문 

	}

}
