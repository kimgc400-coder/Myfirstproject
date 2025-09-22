/*switch ~ case 문을 사용한 학점 구하기 */

import java.util.Scanner;

public class OprTest11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("0부터 100사이 자바 점수 입력>>");
		String jumsu = scan.nextLine();//문자열로 입력받음
		int score = Integer.parseInt(jumsu);//입력받은 점수를 정수숫자로 변경
		
		if(score >= 0 && score <= 100) {
			System.out.print("입력하신 점수" + score +"는(은) ");
			
			score = score / 10;//10으로 나눈 몫만 구함(자바언어에서는 정수숫자를 나눈셈하면 몫만 구한다.)
			switch(score) {
			case 10:
			case 9: System.out.println("A학점 입니다."); break;
			case 8: System.out.println("B학점 입니다."); break;
			case 7: System.out.println("C학점 입니다."); break;
			case 6: System.out.println("D학점 입니다."); break;
			default : System.out.println("F학점 입니다.");
			}//switch ~ case
		}else {
			System.out.println("0부터 100사이 점수만 입력하세요!");
		}//if else
		

	}

}
