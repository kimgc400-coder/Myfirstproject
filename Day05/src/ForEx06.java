/*1.for 반복문 안에 if ~ else 조건문과 % 나머지 연산을 사용한 홀수/짝수들의 누적합
 *2.for 반복문을 각각 사용해서 짝수/홀수들의 누적합
 */




public class ForEx06 {
	public static void main(String[] args) {
		
		
		int i;
		int odd_tot, even_tot;//홀수 누적합, 짝수 누적합
		
		//for,if~else,%
		for(i=1,odd_tot=0,even_tot=0;i<=10;i++) {
			if(i%2 == 1) {//나머지가 1일때는 홀수일때 실행
				odd_tot = odd_tot + i;//홀수들의 누적합
			}else {//나머지가 2일때는 짝수일때 실행
				even_tot += i;//짝수들의 누적합
			}
		}//for
		
		System.out.printf("홀수들의 누적합 = %d\n", odd_tot);
		System.out.println("짝수들의 누적합 = "+ even_tot);
		
		//홀수들의 누적합
		for(i=1, odd_tot=0; i<=10; i+=2) {
			odd_tot += i;
		}
		System.out.println("홀수들의 누적합 = "+odd_tot);
		
		//짝수들의 누적합
		for(i=2,even_tot=0;i<=10; i=i+2) {
			even_tot = even_tot + i;
		} System.out.println("짝수들의 누적합 =" +even_tot);

	}

}
