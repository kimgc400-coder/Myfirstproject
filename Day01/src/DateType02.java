/*자바의 변수 선언법
 * 자료형(타입) 변수명; //;(세미콜론)은 자바언어에서 한 문장 끝을 의미한다.
 * 변수명을 선언하고 최초값을 저장하는 것을 변수 초기화라고 한다.
 */
public class DateType02 {

	public static void main(String[] args) {
		
		int age; // 4바이트 int타입 age변수 선언
		age = 25; //=은 오른쪽 정수숫자값 25를 좌측변수 age에 대입하라는 대입(할당)연산자이다.
		System.out.println("나이:"+age);//+는 문자열 연결 연산기호
		
		age=27;//age변수명에는 단 하나의 값만 저장할 수 있다. 마지막에 저장된 값만 남는다.
		System.out.println("변경된 나이:"+age);

	}

}
