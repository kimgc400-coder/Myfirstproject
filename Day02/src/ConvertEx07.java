import java.util.Scanner;

public class ConvertEx07 {

	public static void main(String[] args) {
		
/*문제
 * 스캐너를 활용해서 다음과 같은 "Seoul"이라는 문자열을 입력받아서 맨 앞 첫 단일문자를 구한 다음 삼항조건 연산자를
 * 활용해서 구한 첫 단일문자가 영문대문자인지 소문자인지 판별하는 자바 프로그램 코드를 작성하시오
 */
		
	Scanner scan = new Scanner(System.in);//쓸 수 있는 도구를 만들어준다.
	System.out.print("\"Seoul\" 문자열 입력>>");//화면에 보이게 해주고
	String cityName = scan.nextLine();//직접 쓰게 만들어주고
	char firstCityName = cityName.charAt(0); //첫 단일문자를 구함 처음한거 
	
	String resultString = (firstCityName >= 'A' && firstCityName <= 'Z') ? "영문 대문자이다." : "영문 소문자이다.";//문자열을 변수에 넣을때는 String을 쓰고, 정수를 받을때는 int와 인티져를 쓴다.
	//String resultAnswer = "" 이거는 변수 초기화를 해준거다. 그냥 위에처럼 한줄로 써도 상관없다.
	System.out.println("입력하신 문자 \'"+cityName+"\' 에서 첫 단일문자 인  \'"+firstCityName+"'는 "+resultString);
	
	
		
		
		
		
		
		
		
		
		
		

	}

}
