/*
 * 영문 소문자 'a'를 영문 대문자 'A'로 변환하는 자바 프로그램을 만들어 보세요. 힌트는 단일문자에 해당하는 십진수 정수값을 활용하면 된다.
 */
public class ConvertEx15 {

	public static void main(String[] args) {
		char lowerCase = 'a';//97
		
		//char A = 65;
		//System.out.printf("'%c' = %d\n",A,(int)A);
	
		//System.out.printf("'%c' --> '%c'\n",lowercase,A);
		
		char upperCase = (char)(lowerCase - 32);
		System.out.println("영어 소문자 'a'를 대문자로 변경 = "+ upperCase);
		
		char upper = (char)(lowerCase - ('a'-'A'));//'a' - 'A' = 97-65=32 지금 정수를 알파벳으로 바꾸려고 하기 때문에 해당하는 숫자를 구하는 것이다.
		System.out.printf("'%c'에 해당하는 영문대문자는 '%c'이다.\n",lowerCase,upper);
		
		
		
	}

}
