package 제3장문제풀이;

/* 03장.자료형.pdf No.35 6번문제 */
public class DataEx06 {
	/* 6번문제는 에러가 발생한다. 에러가 나지 않도록 수정해 보고, 에러가 나는 이유에 대해서도 주석문 달아본다.
	 * 덧셈한 결과값은 byte형 범위를 벗어난다. 벗어난 값도 출력해 보고 소스를 수정해서 정상적인 덧셈 결과값도 출력해 본다.
	 */
	public static void main(String[] args) {

		byte b = 127;
		byte c = 126;
		byte d = (byte)(b + c);//자바는 덧셈연산을 할 때 가장 효율적이고 빠르고 값 손실 위험이 없는 4바이트 int타입으로 자동형 변환을 해서 연산수행을
		//한다. 결국 byte+byte->int+int=int 가 된다. 에러가 발생하는 이유는 4바이트 덧셈 결과값을 1바이트 크기 byte형 d변수에 저장할려면
		//값 손실이 발생하기 때문에 자동형 변환을 하지 않는다. 즉 명시적인 캐스팅 연산자 (byte)를 사용해서 형변환을 해야 한다.
		
		System.out.printf("%d + %d = %d\n",b,c,d);//덧셈 결과값은 byte형 최대값 범위를 벗어나서 값 손실이 발생한다.
		
		int e = b+c;
		System.out.println(b + " + "+ c + " = " + e);
	}
}
