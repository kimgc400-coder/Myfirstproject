/* 12장.메서드살피기.pdf No.19의 1번 문제)
 *   p() 메서드를 오버로딩하여 두 int타입 매개변수에 대해서 두 double 매개변수에 대해서 각각 최대값을 구하는 메서드를 작성해 본다.
 *   (단, 매개변수 타입을 다르게 한 메서드 오버로딩)
 */
class Mt{
   public void p(int a,int b) {
	   if(a > b) {
		   System.out.println(a+"와 "+b+" 중 더 큰 최대값 = "+a);
	   }
   }
   
   public void p(double a,double b) {//매개변수(전달인자) 타입을 다르게 한 메서드 오버로딩
	   if(a < b) {
		   System.out.println(a+"와 "+b+" 중 더 큰 최대값 = "+b);
	   }
   }
}

public class Ex12_01 {
	public static void main(String[] args) {

		Mt mt=new Mt();
		mt.p(100, 50);
		mt.p(100.3, 200.7);
	}
}
