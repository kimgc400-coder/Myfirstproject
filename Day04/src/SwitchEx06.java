/*자바 12(jdk12버젼)에서 스위치 케이스 다중선택문에서 표현식 문법인 "->" 화살표 연산자가 추가되었고,
 *자바 13버젼에서 tield키워가 추가되어 서 반환값을 지정할 수 있게 되었다.
 * 
 */
public class SwitchEx06 {

	public static void main(String[] args) {
		
		int day = 2;
		
		/*
		 * 스위치 케이스문에 표현식인 화살표 연산자를 사용하면 코드가 간결해 진다. 이를 토해 값을 반환해서 변수를 초기화
		 * 할 수 있다.
		 */
		
		String dayName = switch(day) {
		case 1 -> "월요일";
		case 2 -> "화요일";
		case 3 -> "수요일";
		default -> "알 수 없는 요일";
		};
		
		System.out.println("반환된 요일 : " + dayName);
		System.out.println("\n ======================> \n");
		
		var day02 = 1;
		/*1. 자바 10버젼에서 도입된 var키워드는 생성자나 메서드내에 선언된 지역변수 타입을 추론할 수 있게 해준다.
		 * 자바 13에서 도입된 yield 키워드는 스위치 케이스 블록내에서 반환값을 명시적으로 지정할 수 있게 해준다. 이경우는 반드시 default문이 있어야한다.
		 * 
		 */
		
	String dayName2 = switch(day02) {
	
	case 1 -> {
		String name = "월요일";
		yield name;
	}
	case 2 -> "화요일";
	case 3 -> "수요일";
	default -> "알수없는 요일";
	};
	
	System.out.println("반환된 요일 : " + dayName2);

	}

}
