/*while 조건식을 true로 설정하면 영원히 반복하는 무한루프 반복문이 된다.스캐너로 정수 숫자를 입력받아서 누적합을 구하고,
 * 0을 입력한 경우 조건식을 거짓으로 해서 무한루프문을 종료시킨다.*/

import java.util.Scanner;
public class ForEx04 {
	public static void main(String[] args) {
		
		int number = 0;
		int sum = 0;//누적합
		boolean flag = true;//while 조건식에 설정할 boolean 타입 변수
		
		System.out.println("누적합을 구할 숫자를 입력하세요. 반복문을 끝내려면 0을 입력하세요.");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner scan = new Scanner(System.in);
			String inputNumber = scan.nextLine();//스캐너를 사용해서 문자열로 입력받는다. inputNumber라는 변수에 문자열을 저장하고
			number = Integer.parseInt(inputNumber);//입력받은 문자열 숫자를 정수 숫자로 변경, 문자열을 메서드에 넣으면 정수로 바꿔서 number에다가 대입한다.
			
			if(number != 0) {
				sum += number;
			}else {//입력값이 0일때 실행
			flag = false;	
			}
	
			
		}//while
	
System.out.println("누적합 = "+sum);	
	
}


}
