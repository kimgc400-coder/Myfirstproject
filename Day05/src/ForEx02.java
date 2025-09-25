/*
 * 삼중 for 반복문
 */
public class ForEx02 {
	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1;i<=3;i++) {
			for(j=1;j<=3;j++) {
				for(k=1;k<=3;k++) {
					System.out.println(""+i+j+k);//""+1에서 문자를 우선해서 숫자 1을 문자열 "1'로 변경한다 그래서 덧셈연산을 하지않고 문자를 서로 연결한다.
				}
			}
		}

	}

}
