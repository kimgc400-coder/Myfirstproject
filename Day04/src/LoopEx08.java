/*
 * 명확한 반복횟수가 정해진 경우 사용하는 for반복문 형식
 * for(조건식; 조건식; 증감식){
 * 조건식이 참일동안만 반복;
 * }
 */
public final class LoopEx08 {

	public static void main(String[] args) {
			
		int i;//반복문 제어변수
		for(i=1; i<=5;i++) {
			System.out.print(i+"번 java");
		}//for
	System.out.println("\n========================================================\n");
	
	
	for(i=5; i>=5;i--) {
		System.out.print("\t" + i);
		}
	System.out.println("\n========================================================\n");
	
	

	for(i=2; i<=10;i+=2) {
		System.out.print(i+" ");
	

	 System.out.println("\n========================================================\n");}
	 

	 for(i=1; i<10 ; i=i+2) {

			System.out.print(i+" ");}
	 }
}
