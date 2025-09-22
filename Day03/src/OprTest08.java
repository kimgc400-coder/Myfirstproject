/* if else if 다중 조건문(선택문) 형식:
 *  if(조건식1){
 *   조건식 1이 참일 떄 실행
 *  }else if(조건식 2){
 *  조건식 2가 참일 때 실행;
 *  }else{
 *  조건식 1,2 모두 거짓일 때 실행;
 *  }
 * 
 */

import java.util.Scanner;

public class OprTest08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 숫자값 입력>>");
		int a = Integer.parseInt(scan.nextLine());
		
		if(a>0) {
			System.out.println(a+"는(은) 양수이다.");
		}else if(a<0) {
			System.out.println(a+"은(는) 음수이다.");
		}else {
			System.out.println("0 이다.");
		}
		
		
		
		
	}

}
