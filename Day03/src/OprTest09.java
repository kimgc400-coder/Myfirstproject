/*if else if 다중 조건문으로 학점구하기 실습*/

import java.util.Scanner;

public class OprTest09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100 사이 정수숫자 점수만 입력>>");
		
	int score = Integer.parseInt(scan.nextLine());
	
	char grade = ' ';//학점,단일문자는 공백을 남녀놔야한다.
	
	if(!( 0<= score && score <= 100)) {
		System.out.printf("%s \n", "0부터 100사이 점수 숫자만 입력하세요!");//%s는 문자열 출력형태 여기서 %s에 해당하는 것은 ,다음의 문자열인가???
	}else {
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score <= 89) {
			grade = 'B';
		}else if(score >= 70 && score <=79) {
			grade = 'c';
		}else if(score >= 60 && score <=69) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("당신이 입력하신 %d점은(는) %c학점입니다.\n", score, grade);
	}
		

	}

}
