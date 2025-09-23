/*중첩 if else if 다중조건문을 활용한 A+,A0,A-등 학점 구하기
 * 
 */
import java.util.Scanner;
public class SwitchEx01 {
	public static void main(String[] args) {
		
		
		int score = 0;//점수
		char grade = ' ';//학점
		char opt = ' ';//

		Scanner scan = new Scanner(System.in);
		System.out.print("0부터 100사이 점수만 입력>>");
		score = Integer.parseInt(scan.nextLine());
		
		if(!(score >= 0 && score <= 100)) {
			System.out.println("0부터 100사이 점수만 입력하세요!");
		}else {
			if(score >= 90) {
				grade = 'A';
				if(score >= 96 && score <= 100) {
					opt = '+';
				}else if (score >= 90 && score <= 93) {
					opt = '-';
				}//나머지인 94점이상 96점 이하는 A0
			}else if(score >= 80) {
				grade = 'B';
				if(score >= 87 && score <= 89) {
					opt = '+';
				}else if(score >=80 && score <= 83) {
					opt = '-';
				}
			}else if(score >= 70) {
				grade = 'C';
				if(score >= 77 && score <= 79) {
					opt = '+';
				}else if(score >= 70 && score <= 73) {
					opt = '-';
				}
			}else if(score >= 60) {
				grade = 'D';
				if(score >= 67 && score <= 69) {
					opt = '+';
				}
			}else {
				grade = 'F';
			}//if else if
			
			if(grade != 'F') {
				System.out.printf("당신이 입력하신 점수 %d는(은) %c%c학점입니다.", score,grade,opt);
			}else {
				System.out.println("당신이 입력하신 점수 " + score + "는(은) " + grade+"학점입니다.");
			}
		}
		

	}

}
