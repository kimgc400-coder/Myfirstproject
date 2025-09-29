/*
 * 열거 타입을 사용한 소스
 */

import java.util.Calendar;

public class ArrayTest05 {
	public static void main(String[] args) {
		
		Week today = null;//week 열거 타입도 참조 타입이어서 today라는 참조변수 선언 가능.
		
		/*
		 * 자바에서 null이란 "아무 객체도 참조하지 않음"을 의미하는 값. 즉비 "비어 있는 객체 참조"를 나타내며, 변수가 어떤 객체도 가리키고 
		 * 있지 않을 때 사용
		 */
		
		Calendar cal = Calendar.getInstance();
		/*java.utill 패키지에 있는 내장api인 Calendar는 년월일 시분초 값 들을 반환한다. 컴퓨터의 날짜와 시간 정보를 가진다.*/
		
		int week = cal.get(Calendar.DAY_OF_WEEK);//이료일은 1,....,토요일은 7까지 정수숫자 반화
	
		System.out.println("반환된 week값 : " + week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;//열거 타입 변수 today에 열거 상수 대입 가능하다. 열거타입이름, 열거상수 형태로 작성한다.
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		
		}//switch~case
		
		System.out.println("오늘은 "+today);
		
		if(today == Week.SUNDAY) {//열거 타입변수 today가 특정 열거 상수 인지 비교할 때는 ==(같다 비교연산) 또는 !=(같지 않다 비교연산)}
			//를 사용한다.
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("자바 열공합니다.");
		}//if else
		

	}

}
