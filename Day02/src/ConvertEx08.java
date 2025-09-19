
public class ConvertEx08 {
/* 확장된 복합 대입 연산자 특징)
 * a+=10은 a=a+10과 같은 의미이다.
 * a-=2는 a=a-2와 같은 기능을 가진다.
 * 
 */
	public static void main(String[] args) {
         int a =10;
         a=a+10;
         System.out.println("a="+a);
         
         a=a-2;
         System.out.println("a="+a);
         
         a+=2;
         System.out.printf("a=%d \n", a);
         
         a-=7;
         System.out.printf("a=%d \n", a);
	}

}
