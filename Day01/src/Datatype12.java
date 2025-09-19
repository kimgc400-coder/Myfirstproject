/* double 타입 실수 숫자값을 강제캐스팅 연산자인(int)로 형변환하면 소수점 이하는 반올림을 하지 않고 버린다.
 * 
 */
public class Datatype12 {

	public static void main(String[] args) {
		
		double score = 89.9;
		int result_score = (int)score;//89.9점에서 소수점 이하 0.9는 반올림 하지 않고 버린다.
		
		System.out.printf("실제 취득한 점수 = %f %n", score);
		//--------------------------------------------->%f(십진수 실수값을 출력, 소수점 이하 7자리에서 반올림의) 형태로 보여줘라, 스코어변수에 있는 숫자를 ->이렇게 해석하면 됨
		
		System.out.println("공무원 합격점수(90점이상이면 합격, 90점 미만이면 불합격) = "+ result_score);
		//--------------------------------------------->이건 캐스팅된 것이기 때문에 (int)로 변형된 것을 보여줘라.
		
		

	}

}
