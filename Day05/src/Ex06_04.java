/*No.21 4번문제
 * a부터z사이의 알파벳 출력하는 자바 프로그램을 작성해 본다.(단, 하나는 for반복문과 int타입을 사용해야 하고, 또 다른 하나는 for반복문과 char 타입을 사용해야 한다. 
 * 자바에서 증감연산자(++,--)는 자료 손실이 없는 더 큰 타입으로 자동형 변환하는 자동 산술법이 적용 안 된다.)
 * 
 * */
public class Ex06_04 {

	public static void main(String[] args) {
		
		
	for(int i= 'A'; i<='Z';i++) {
		System.out.print(" "+((char)i));
	}
	System.out.println("\n====================================\n");
	
	for(char i = 'A';i<='Z';i++) {
		System.out.print(" "+i);
	}
		
		

	}

}
