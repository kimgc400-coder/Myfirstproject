public class ConvertEx04 {
/* 자바의 비교/관계 연산자 종류)
 *  1.비교연산자 결과값은 true or false 인 boolean 타입이다.
 *  2.비교연산자 종류:
 *    >(~보다 크다), >=(~보다 크거나 같다), <(~보다 작다), <=(~보다 작거나 같다), ==(같다), !=(같지 않다)
 */
	public static void main(String[] args) {
        
		boolean flag = false;
		flag = (7>2);
		System.out.printf("7 > 2 : %b \n", flag);//%b는 boolean 타입 출력형태
		
		flag = (7 == 2);
		System.out.println(" 7 == 2 : "+ flag);//false
		
		flag = (7 != 2);
		System.out.println(" 7 != 2 : "+ flag);//true
		
		int a=10;
		int b=3;
		flag = (a+b) < (a-b);
		System.out.println((a+b) + " < "+(a-b) + " : "+ flag);//false
	}
}

