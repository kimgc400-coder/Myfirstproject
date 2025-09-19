package 제3장문제풀이;

/* 03장.자료형.pdf No.33 3번문제 */
public class DataEx03 {
	public static void main(String[] args) {

		byte var01 = 127;
		short var02= 128;
		int var03=128;
		long var04=128L;
		
		var04 = var01; //1바이트 크기가 8바이트 long타입으로 암시적인 자동형 변환
		System.out.println("var01="+var01+",var04="+var04);
		
		var01 = (byte)var03;//4바이트가 1바이트로 명시적인 형변환(byte), 저장되는 값이 byte형 최대값 범위를 벗어나서 최소값이 저장
		System.out.println("var01="+var01+",var03="+var03);
		
		float var05 = 123456.789123F;
		double var06 = 123456.789123;
		System.out.println("var05="+var05);
		
		var05 = (float)var06;
		System.out.println("var05="+var05);
		System.out.println("var06="+var06);
		
		//5번 문제풀이
		//boolean false; //false는 키워드로 변수명으로 사용못함
		//int default; //default도 키워드이다. 변수명으로 사용못함.
		String _object;
		//double a-class; //변수명에 -를 포함할 수 없다.
	}
}







