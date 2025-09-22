/*자바의 char타입 단일문자형을 활용한 비교연산자 예제*/

public class OprTest01 {

	public static void main(String[] args) {

		System.out.printf("'0' == 0 \t %b \n", '0' == 0);//%b는 boolean 타입인 true or false 출력형태 지시자이다.
		//\t 는 탭키만큼 수평을 띄운다. \n은 줄바꿈 해준다. '0' 단일문자형은 십진수 정수 48이다. 결국 48 == 0 --->false
		
		System.out.printf("'A' == 65 \t %b \n", 'A' == 65);//'A'는 십진수 정수 65이다. 결국 65 == 65 ---> true
		
		System.out.printf("'A' > 'B' \t %b \n", 'A' >'B');//'B'는 십진수 정수 66이다. 결국 65 > 66 -> false
		
		System.out.printf("'A' + 1 != 'B' \t %b \n", 'A'+1 != 'B');//65+1 != 66 ->false
	}//위의 문장 어떻게 해석하는지 알아보기

}
