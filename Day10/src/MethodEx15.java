/*
 *  2025년 8월 27일
 *  개발자 : 홍길동
 *  
 *  참조타입 배열 매개변수
 */
public class MethodEx15 {
	public static void main(String[] args) {

		int[] arr = {3,2,1,6,5,4};
		
		printArr(arr);
		/* 문제01) 자바 5에서 추가된 향상된 확장 for 반복문을 사용해서 다음과 같이 배열원소값이 출력되게 static void printArr(int[] arr){
		 * 
		 * } 정적메서드를 작성한다.
		 * 
		 * 출력예)  [3,2,1,6,5,4,]
		 *        =============== 
		 */		
		MethodEx15 mt15 = new MethodEx15();
		
		int total = mt15.sumArr(arr);
		/* 문제02) 일반 for반복문을 사용해서 배열원소 총합을 구해서 반환한 다음 출력하는 코드를 완성해 본다. 
		 * 주의)자바 OOP에서 mt15가 ?(mt15는 MethodEx15 클래스의 객체명->객체주소를 저장한 참조변수)
		 */
		System.out.printf("arr배열원소 총합=%d \n", total);
	}//main()
	
	//2번문제 풀이
    int sumArr(int[] arr) {
    	int sum = 0;//배열원소 총합
    	
    	for(int i=0;i<arr.length;i++) {
    		sum += arr[i];
    	}
    	
		return sum;
	}//sumArr()

	//1번문제 풀이
	static void printArr(int[] arr) {
		System.out.print("[");
		//향상된 확장 for
		for(int k:arr) {
			System.out.print(k+",");
		}
		System.out.print("]");
		System.out.println("\n =============== ");
	}//printArr()
}
