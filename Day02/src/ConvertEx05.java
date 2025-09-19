import java.util.Scanner;

public class ConvertEx05 {
/*삼항 조건연산자 정의 :
 * 조건신 ? 조건식이 참이면 실행: 조건식이 거짓이면 실행;
 */
	//스캐너로 부터 첫번째 정수, 두번째 정수값을 각각 입력받아서 정수숫자로 변경한 다음 삼항 조건연산자로 두 수 중 더 큰수를 구하는 실습예제
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*컨트롤 쉬프트 영문자 오 단축키로 외부 패키지인 java.util 패키지의 api를 임포트 즉 읽어들인다.
         * jdk 1.5에서 추가된 Scanner 내장 api 클래스는 텍스트 콘솔모드로 부터 입력받은 값을 읽어들일 때 사용한다.
         * System.in은 키보드 입력장치와 연결된다.
         * new 키워드로 새로운 객체명 scan 생성
         * 
         */
        
        System.out.print("첫번째 정수숫자 입력>>");
        String num01 = scan.nextLine();//문자열로 읽어들인다.
        int number01 = Integer.parseInt(num01);
        //읽어들인 문자열을 parseInt()정적 내장메서드로 정수 숫자로 변경
        
        System.out.print("두번째 정수숫자 입력>>");
        int number02 = Integer.parseInt(scan.nextLine());//18,19번째 줄을 합친게 이거다.
        
        int max = (number01 > number02) ? number01: number02;
        System.out.println(number01+"과 "+number02+"중 더 큰수는 ? "+ max);
	}

}
