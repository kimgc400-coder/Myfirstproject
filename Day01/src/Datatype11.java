/*자바 확장 특수 출력문자(escape sequence) 종류 : 
 * \n -> 줄바꿈, \t->탭키만큼 수평으로 띄움, \'->작은 따옴표, \"=>큰따옴표, //->경로구분 \
 * \b-> 백스페이스, \f -> 연속용지에서 페이지 넘김, \r -> 커서를 현재줄 맨 앞으로
 * 
 */
public class Datatype11 {

	public static void main(String[] args) {
		
		System.out.println("\'대전시\'");
		System.out.println("\"자바\"");
		System.out.println("홍길동\t이순신\t강감찬");
		System.out.println("\n");
		System.out.println("D:\\");// 이런 모양으로 D:\로 표현 -> 많이 쓰임
	}

}
