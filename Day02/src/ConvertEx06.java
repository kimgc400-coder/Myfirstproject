import java.util.Scanner;

public class ConvertEx06 {
/*자바의 논리연산자 종류)
 *  1.논리연산자 결과값은 boo;ea 타입인 true or fales이다.
 *  2.논리 연산자 종류)
 *   가.&&(논리곱) : 입력값 모두 true이면 결과값도 true이다. 나머지는 모두 false이다.
 *   나.||(논리합) : 2개의 조건 중 하나라도 참이면 결과값도 참(true)이다.
 *   다.!(논리부정) : 입력값이 true이면 결과값은 false이고, 반대로 입력값이 false이면 결과값은 true이다.
 * 
 */
	public static void main(String[] args) {

		boolean result = false;
		result = (true && true);
		System.out.printf("%b &&%b: %b\n", true,true,result);//첫번째 %b는 는 첫번째 true를 불러다 쓰고 두번째는 두번째 true를 불러다 쓰고 마지막 %b는 result값을 불러온다.
		
		result = (false || false);
		System.out.println("false || false : "+ result);
		
		result = !false;
		System.out.println("!false : "+result);
		
		Scanner scan = new Scanner(System.in);
		String resultAnswer = "";
		
		System.out.print("나이 입력>>");
		int age = Integer.parseInt(scan.nextLine());
		
		resultAnswer = (age >= 20 && age <= 29) ? "20대이다." : "20대가 아니다.";//삼항 조건연산자
		System.out.println(age+"세는 "+resultAnswer);
	}

}
