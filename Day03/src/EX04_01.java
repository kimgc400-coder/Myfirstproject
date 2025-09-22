/*04장.연산자.pdf No.22 1번문제)
 * 
 */
public class EX04_01 {

	public static void main(String[] args) {

		/*int a = 7;
		int s = 8;
	
		String ast = (a%2 == 0) ? "짝수입니다." : "홀수입니다.";
		String sst = (s%2 == 0) ? "짝수입니다." : "홀수입니다.";
				
		System.out.println("7은 "+ast);
		System.out.println("8은 "+sst);
		*/
		
		
	    int num01 = 7, num02 = 8;
	    String result ="";//삼항연산자를 통해 값을 대입하기 전까지는 빈상태로 선언해두기 위해 사용한것입니다.
	    
	    result = (num01 % 2 == 0) ? "짝수" : "홀수";//%는 나머지 연산
	    System.out.println(num01+"은 "+result+"이다.");
	    
	    result = (num02 % 2 == 1) ? "홀수":"짝수";
	    System.out.printf("%d은 %s이다. \n",num02, result);//%s는 문자열 출력형태이다.
		
	}

}
