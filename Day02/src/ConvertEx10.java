/*비트연산자
 * 
 */
public class ConvertEx10 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 20;
		int c;
		
		c = a & b;
		System.out.println(a+" & "+b+" = "+c);
		//12를 2로 나눈다. 이진수 구하는 법 나머지를 반대로 읽으면 된다.
		
		
		c = a | b;
		System.out.println(a+" | "+b+" = "+c);
		
		c = a ^ b;
		System.out.println(a+" ^ "+b+" = "+c);
		
		c = ~a;//비트전환, 1이면 0이나오고 반대로 0이면 1이 나온다.
		System.out.println("~a : "+c);
		
		
		
	}

}
