/*
 * 문제) for반복문과 continue, if조건문을 활용해서 1부터 10까지 자연수 중에서 4의 배수만 빼고 누적 합을 구하는 자바 프로그램을 만들어 본다.
 * 
 */
public class BreakEx06 {
	public static void main(String[] args) {
		
		
		int i = 0;
		int sum = 0;
		
		for(i= 0; i<=10;i++) {
			
			if(i%4 == 0) {
				continue;//아래 문장 수행 안하고 다음 반복을 위해서 반복문 처음으로 돌아가서 계속 반복한다.
			}
			sum += i;
		}
		
		System.out.println("누적 합 : " + sum);
		

	}

}
