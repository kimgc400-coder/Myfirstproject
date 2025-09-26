/*
 * 1부터 50까지의 자연수 중에서 4의 배수만 뺀 누적합을 구하는 자바 프로그램을 만들어 보자. 단, while 반복문만 사용해야 한다.
 */


public class Ex08_02 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int a = 0;
		
		
		while(a<50) {a++;
			if(a%4==0) {
				continue;	
			}sum += a;	
			
		}
		System.out.println("누적합 : "+ sum);
		System.out.println("==============================");
		
		
		//문제)for 무한루프문과 java.utill패키지의 random 유틸리티 클래스 하위의 nextInt(6) 내장메서드를 활용해서 임의의 주사위수를 구하는 자바
		//프로그램을 만들어보고, 임의의 주사위 수가 4일때 for 무한루프문을 종료시켜 보자, 임의의 주사위 정수는 난수가 된다. 
		
		for(;;) {
		int dice = (int)(Math.random() * 12) + 1;//random()메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생시킴
		if(dice == 4) {
			break;
			
			}System.out.println("주사위의 눈금이 "+dice);
		}
		System.out.println("주사위의 눈금이 4입니다. 프로그램이 종료됩니다.");
	}

}
