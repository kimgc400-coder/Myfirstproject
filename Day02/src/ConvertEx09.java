
public class ConvertEx09 {
/*자바 증가 감소 연산자 종류
 * ++i(선생 증가-> 먼저 1증가), i++(후행 증가->나중에 1증가)
 * --i(선생 감소-> 먼저 1감소), i--(후행 감소->나중에 1감소)
 * 참고로 i++는 복합대입연산자인 i+=과 같은 기능을 가진다. 마잔가지로 i--는 i-=1과 기능이 같다.
 */
	public static void main(String[] args) {
		int a= 10, b=10;
		++a;//선행
		System.out.printf("a = %d \n", a);
		
		a--;
		System.out.println("a = "+ a);
		
		System.out.println(b++);
		System.out.printf("b = %d \n", b);
		
		int result = ++b;
		System.out.println("result = "+ result);
	}

}
