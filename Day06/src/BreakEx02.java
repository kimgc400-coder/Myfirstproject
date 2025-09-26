/*자바의 이중 for반복문에서 맨 안쪽 반복문 안에서 break문을 사용하면 가장 근접한 안쪽 반복문만 중단하고바깥 반복문은 중단 못한다.
 * 이런 경우 바깥 반복문까지 모두 중단하고 싶을 땐 맨 바깥 반복문 위에 임의의 레이블명을 지정하면 된다.
 * 
 */
public class BreakEx02 {

	public static void main(String[] args) {
		
		int a,i;//반복문 제어변수
		
		//이중 반복문에서 맨 안쪽 반복문만 중단
		for(a=1;a<10;a++) {
			for(i=1;i<=10;i++) {
				if(i % 3 == 0) {
					break;//안쪽 반복문만 중단
				}
				System.out.print("i->"+i+" ");//12
			}//inner for(안쪽 for)
			System.out.println("\n a->"+a);//바깥 반복문은 중단 못함
		}//outter for(바깥 for)
		
		System.out.println("\n=================================\n");
		
		//이중반복문 중단
		exit_for://임의의 레이블명 지정
		for(a=1;a<9;a++) {
			for(i=1;i<9;i++) {
				if(i%3 == 0) {
					break exit_for;//이중 for 반복문 중단
				}
				System.out.print("i->"+i);
			}//inner for
			System.out.println("\n a->"+a);
		}
	}

}
