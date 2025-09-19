/* 자바언어에서 텍스트 콘솔 모드에서 입력한 데이터를 쉽게 읽어 들이기 위해서는 
 * jdk 1.5에서 추가된 java.utill패키지의 
 * Scanner내장 api클래스를 사용하면 된다. 
 * 외부 패키지 폴더의 api를 읽어들일 때 즉 임포트(import)할때 사용하는 이클립스 단축키는 ctrl + shift + 영문자 o 이다.
 * 
 */

import java.util.Scanner;

public class DataType10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/* 1. System.in은 키보드 입력장치와 연결됨. System.out과는 반대->모니터 장치와 연결
		 * 2.new키워드로 새로운 객체명 scan 생성
		 * 
		 */
		
		System.out.print("점심 식사메뉴 입력(예:물냉면, 순대국밥)>>");
		String lunch_food = scan.nextLine();//입력받은 값을 문자열로 읽어들림.
		
	    System.out.println("오늘 먹을 점심메뉴는?"+lunch_food);
	    
		

	}

}
