/* 10장.메서드.pdf No.10 1번,2번 문제) 
 */

import java.util.Scanner;

public class ObjectEx01 {

	static void name_print(String name) {
		System.out.println("성 이름 : " + name);
	}//name_print()
	
	public static void main(String[] args) {

		/* 1번 문제)스캐너로 부터 자기 자신 성,이름을 입력받아서 매개변수 인자값으로 전달해서 출력하는 다음과 같은 정적메서드를 정의해 본다.
		 * 
		 *    static void name_print(String name){
		 *        실행 문장;
		 *    }
		 */

		Scanner scan = new Scanner(System.in);

        System.out.print("자기 성이름 입력(홍길동)>>");
        String name = scan.nextLine();
        
        ObjectEx01.name_print(name);
        
        System.out.println("\n ========================= \n");
        
        /* 2번 문제) 스캐너로 부터 입력받은 정수 숫자를 정적 메서드 인자값으로 전달해서 해당 숫자 구구단을 구하는 다음과 같은 메서드를 별도로
         *         만들어 보자.
         *         
         *         static void gu(int guguDan){
         *            메서드 실행문장으로 if ~ else 조건문을 활용해서 2부터 9사이 숫자가 아닌 경우는 '2부터 9사이 정수 숫자만 입력하세요!'
         *            라는 유효성 검증 메시지(validate)를 띄우고 2부터 9사이 정수 숫자를 입력한 경우는 해당 숫자 구구단을 구하는 자바 코드를
         *            완성한다. 단 구구단 제목도 출력하고 구구단을 구할 때는 for반복문만 사용한다. 
         *         }
         */
        System.out.print("구할 구구단 숫자 입력(2~9)>>");
        gu(Integer.parseInt(scan.nextLine()));
	}//main()
	
	static void gu(int guguDan) {
		if(!(guguDan >= 2 && guguDan <9)) {
			System.out.printf("%s \n", "2부터 9사이 정수 숫자만 입력하세요!");
		}else {
			System.out.println(">>>>>>>>>> "+guguDan+"단 <<<<<<<<<<");
			System.out.println("==================================");
			
			for(int i=1;i<=9;i++) {
				System.out.printf("%d x %d = %d \n", guguDan, i, guguDan * i);
			}//for
		}//if~else
	}//gu()	
}

