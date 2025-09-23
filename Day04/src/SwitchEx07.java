/*자바 17버젼까지는 스위치케이스 문의 표현값이 null인 경우 예외 오류가 발생했지만
 *자바 21버전부터는 null을 지정해도 예외오류가 발생하지 않아서 처리할 수 있게 되었다. 
 */
public class SwitchEx07 {
	private static void method01(String s) {
		//private 키워드는 내 자신 클래스내에서만 접근가능하게 한다.
		switch(s) {
		case null -> System.out.println("null");
		case "a","b" -> System.out.println("a or b");
		case "c" -> System.out.println("c");
		default -> System.out.println("해당 사항 없다.");
		}
	}//method01
	private static void method02(String s) {
		switch(s) {
		case "a","b" -> System.out.println("a or b");
		case "c" -> System.out.println("c");
		case null, default -> System.out.println("null or 해당사항 없다.");
		}
	}//method02()
	
	public static void main(String[] args) {
		method01(null);
		method02("d");
		method02(null);
	}

}
