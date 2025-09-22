/*&&(논리곱:and), ||(논리합:or) 자바의 논리연산자의 효율적인 연사에 관한 소스예)
 * 1. ||논리합 연산에서 왼쪽 피연산자 결과가 true이면 오른쪽 피연산자 결과가 true가 되든 false가 되는지에 상관없이 결과값은 무조건 true가 된다.
 * 즉 왼쪽 피연산자 연산 결과를 true가 되게 효율적인 코드를 하면 오른쪽 피연산자 연산은 실행하지 않아서 그만큼 프로그램 실행속도가 빨라진다.
 * 
 * 2. &&논리곱 연산에서 왼쪽 연산 겨로가가 false이면 오른쪽 연산 겨로가가 true가 되든 false가 되든 상관없이 무조건 결과 연산값은 false가 된다.
 * 즉 왼쪽 연산 결과를 false가 되게 효율적인 코드를 하면 오른쪽 연산은 수행되지 않아서 그 만큼 실행속도가 빨라진다.
 * 
 * 
 */
public class OprTest02 {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d,b=%d \n", a, b);
		System.out.printf("a != 0 || ++b != 0 : %b\n", a != 0 || ++b != 0);//a !=0 -> 5!=0 -> true가 된다. 그래서 ++b 선행
		//증가 수행안함
		System.out.println("a="+a+",b="+b);//5,0
		System.out.println("\n ================= \n");
		System.out.printf("a == 0 && ++b != 0 : %b \n", a == 0 && ++b != 0);//a == 0 -> 5 == 0 -> false가 된다. 그래서)
		//++b수행안함
		System.out.printf("a=%d, b=%d, %n", a,b);
		
		
		
	}

}
