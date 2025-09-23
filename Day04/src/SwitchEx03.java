/*
 * if else if  다중 조건문을 활용한 봄,여름,가을,겨울 구하기
 */
/*문제) if else if 다중 조건문과 논리합 ||, == 같다 연산만 활용해서
			 * 입력하신 월로 봄,여름, 가을,겨울을 구하는
			 * 자바 프로그램을 만들어본다.
			 */
import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1월부터 12월사이 월만 입력>>");
		int month = Integer.parseInt(scan.nextLine());
		
		if(!(month >=1 && month <=12)) {
			System.out.println("1월부터 12월 사이 월만 입력!");
		}else {
			
			
			/*if(month==1) {System.out.print("입력하신 " + month +"월 은(는) 겨울입니다.");
			}else if(month==2) {System.out.print("입력하신 " + month +"월은(는) 겨울입니다.");
			}else if(month==3) {System.out.print("입력하신 " + month +"월은(는) 봄입니다.");
		}else if(month==4) {System.out.print("입력하신 " + month +"월은(는) 봄입니다.");
		}else if(month==5) {System.out.print("입력하신 " + month +"월은(는) 봄입니다.");
		}else if(month==6) {System.out.print("입력하신 " + month +"월은(는) 여름입니다.");
		}else if(month==7) {System.out.print("입력하신 " + month +"월은(는) 여름입니다.");
		}else if(month==8) {System.out.print("입력하신 " + month +"월은(는) 여름입니다.");
		}else if(month==9) {System.out.print("입력하신 " + month +"월은(는) 가을입니다.");
		}else if(month==10) {System.out.print("입력하신 " + month +"월은(는) 가을입니다.");
		}else if(month==11) {System.out.print("입력하신 " + month +"월은(는) 가을입니다.");
		}else {System.out.print("입력하신 월은" + month +"월은(는) 겨울입니다.");
		}
				
		

	}
*/
			if(month == 6 || month == 7 || month == 8) {
				System.out.print("입력하신 "+month+"월은 여름입니다.");
			}else if(month == 9 || month == 10 || month == 11) {
				System.out.print("입력하신 "+month+"월은 가을입니다.");
			}else if(month == 12 || month == 1 || month == 2) {
				System.out.print("입력하신 "+month+"월은 겨울입니다.");
			}
			
			
			
}
	}
	}
