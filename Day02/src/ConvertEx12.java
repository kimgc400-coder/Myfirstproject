/*자바의 산술연산자*/
public class ConvertEx12 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + $d = %d \n", a,b, a+b);
		
		int result = a*b;
		System.out.println(a+" * "+b+" = "+ result);
		
		result = a/b;
		System.out.printf("%d / %d = %d\n", a,b,result);
		
		result = a%b;
		System.out.println(a+" %"+b+" = "+ result);
		
	/*문제 int 타입 b변수값을 double타입으로 형변환해서 나누셈 한 결괄값을 소수점 이하 6자리까지 구하는 자바코드를 해보시오.	
	   printf()메서드를 활용한다.*/
		
		double result1 = b;
		int result2 = a;
		double result3 = result2/result1;
		
		System.out.printf("%d / %f = %f\n",result2,result1,result3);
		
		System.out.printf("%d / %f = %f\n",a,(double)b, a/(double)b);// int / double는 자동산술법에 의해서 더큰 타입으로 자동형변환이 된다.
		//double/double=double이 되어서 실수 숫자를 나눗셈하면 몫과 나머지를 함께 구한다.
		
		
	}

}
