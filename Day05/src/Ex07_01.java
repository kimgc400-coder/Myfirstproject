/*07장 제어문의 다양한 활용 No.8 1문제)
 * 22부터 76까지의 짝수의 개수와 그 합을 구하는 프로그램을 작성하시오. 일반 for문
 * 짝수 ->28
 * 그 합 -> 1372
 * 짝수의 개수를 구할땐 ++증가 연산자를 활용한다.
 * 2씩 증가된 for 반복문과 1씩 증가된 for 반복문을 각각 사용한다. 특히 1씩 증가된 반복문 안에서는 if문과 나머지 연산%,== 같다 비교연산자등을 
 * 사용한다.
 * 
 */



public class Ex07_01 {
	public static void main(String[] args) {
		
		int i;
		int count = 0;
		int sum = 0;
		
		for(i=22;i<=76;i+=2) {
			count++;
			sum+=i;
		}
		
		System.out.printf("짝수들의 개수 = %d\n", count);
		System.out.printf("짝수들의 누적합 = %d\n", sum);
		
		
		System.out.println("\n=============================================\n");
		
		int j,cnt,total;//반복문 제어변수, 짝수드르이 개수, 짝수들의 누적합
		
		//1씩 증가
		
		for(j=22,cnt=0,total=0;j<=76;j++) {
			if(j%2 == 0) {
				cnt++;
				total=total+j;
			}
		}
		
		System.out.printf("짝수들의 개수 = %d\n", cnt);
		System.out.printf("짝수들의 누적합 = %d\n", total);
		
		
		
		
		
		/*for(int a = 22 ; a<=76 ; a++ ) {
			if(a%2==0) {
				count++;
			}
		}System.out.println("짝수의 개수 :" + count);
		
		for (int a= 22 ; a<=76 ; a++ ) {
			if(a%2==0) {
				
			}
		}System.out.println("짝수의 합 :" + sum);*/
		
		
		
		
		

	}

}
