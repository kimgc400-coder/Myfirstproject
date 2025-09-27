/*
 * 자바에서 다양한 배열 생성법과 복수개의 배열 원소값을 쉽게 읽어오는 용도로만 사용하는 jdk1.5버전에서 추가된 향상된 확장 for 반복문을 사용하는 예)
 */

import java.util.Arrays;

public class ArrayEx06 {
	public static void main(String[] args) {
		
		
		//다양한 배열 생성
		int[] iArr01 = new int[10];//배열 크기가 10인 iArr01 배열 생성
		int[] iArr02 = new int[] {100, 99, 100, 90, 100};//new int[]은 생략가능
		int[] iArr03 = {100, 100, 85, 95, 90};
		char[] chArr = {'a','b','c','d','e'};
		
		//iArr01 배열 원소값을 일반 for반복문을 사용해서 1부터 10까지 초기화하고 출력
		for(int i = 0; i < iArr01.length;i++) {
			iArr01[i] = i+1;//배열 원소값으로 1부터 10까지 저장->배열은 변수와 달리 이렇게 하면 값이 10개가 0~9번까지 인덱스에 대입되어진다.□□□□□□□□□□
			System.out.print(" "+ iArr01[i]);
		}//for
		
		System.out.println("\n===============================\n");
		
		
		
		//자바 5버젼(jdk1.5)에서 추가된 향상된 확장 for 반복문을 이용해서 배열원소값을 쉽게 읽어옴
		for(int k:iArr02) {
		System.out.print(" "+k);
		}//for
		System.out.println("\n===============================\n");
		
		
		System.out.println(Arrays.toString(iArr03));//자바 내장 api를 사용해서 배열원소값을 문자열로 반환
		System.out.println(chArr);//단일문자 배열원소값 출력
		
		

	}

}
