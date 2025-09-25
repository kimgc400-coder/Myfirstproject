/*
 * 이중 for 반복을 사용한 구구단
 */
public class ForEx01 {
	public static void main(String[] args) {
		
		
		//첫번째 구구단
		int i,j; //반복문 제어변수
		for(i=2; i <= 9; i++) {
			System.out.println(">>>>>" + i + "<<<<<");
			for (j = 1; j<=9 ; j++) {
				System.out.printf("%d x %d = %d \n", i,j,i*j);
			}//inner for -> 안쪽 for
			System.out.println("\n ======================\n");
		}//outer for
		
		//두번째 구구단
		int k = 2;
		while(k <= 9) {
			System.out.print(k+ "단\t");
			k++;
			
		
		}//while 반복문
		System.out.println("\n ============================================== \n");
		
		/*문제) 이중 for 반복문을 사용해서 다음과 같이 구구단이 출력되게 마들어본다.
		 * 2*1=2 3*1 = 3....중략 9*1=9
		 * 
		 */
		for(j=1;j<=9;j++) {
			for(i=2;i<=9;i++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
