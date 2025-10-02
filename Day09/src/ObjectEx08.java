/* 자바에서 OOP(Object-Oriented Programming)인 객체 지향 프로그래밍을 사용하는 목적)
 *  1. 높은 재사용성
 *  2. 중복코드 제거
 */
public class ObjectEx08 {
	public static void main(String[] args) {

		int[] numArr = new int[10];
		
		//배열원소 초기화
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i+1;//1부터 10까지 정수숫자로 배열원소값 저장
		}//for
		
		//일반 for반복문으로 numArr배열원소값 출력
		for(int i=0;i<numArr.length;i++) {
			System.out.printf("numArr["+i+"] = %d\n", numArr[i]);
		}//for
		
		System.out.println("\n ==================== > \n");
		
		//향상된 확장 for 반복문으로 배열원소값 출력
		for(int n:numArr) {
			System.out.print(" "+n);
		}//for -> 배열원소값을 출력할 때 마다 반복적 코드가 이루어짐
		System.out.println("\n ====================> \n");
		
		//객체지향언어 OOP를 활용해서 반복적인 코드를 안함
		Arr08 arr=new Arr08();
		arr.printNumArr(numArr);//numArr 배열원소값을 출력할 때 마다 해당 메서드만 호출하면 된다.
		arr.printNumArr(numArr);
	}//main()
}//ObjectEx08 class

class Arr08{
	void printNumArr(int[] arr) {
		for(int k:arr) {
			System.out.print(" "+k);
		}
		System.out.println("\n ===================> \n");
	}//printNumArr()
}//Arr08 class
