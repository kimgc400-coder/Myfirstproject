/*스타(*)로역삼각형을출력하는프로그램을작성하시오.(Ex07_05.java-> 이중 for)
 * 
 */
public class Ex07_05 {

	public static void main(String[] args) {
		
		for(int a = 0; a < 5; a++) {
			for(int b = 5; b>a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
