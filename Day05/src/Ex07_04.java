/*
 *  각 단이 아래로 출력되지 않고 오른쪽으로 출력 되도록 구구단 프로그램을 작성하시오.(Ex07_04.java->이중for문) 
 */
public class Ex07_04 {

	public static void main(String[] args) {
		
		for(int a = 2; a<=9;a++) {
			for(int b=1;b<=9;b++) {
				
				System.out.print(a+"*"+b +"=" +(a*b)+"\t");
			}
			System.out.println();
		}
		

	}

}
