/* 11장.클래스와 객체.pdf No.14 2번 문제*/

class Product{
  private String name;//상품명
  private int price;//상품가격
  
  public void setName(String new_name) {
	  name = new_name;
  }//setter() 값 저장메서드
  
  public String getName() {
	  return name;
  }//getter() 값 반환메서드
  
  public void setPrice(int new_price) {
	  price = new_price;
  }
  
  public int getPrice() {
	  return price;
  }
}//Product class

public class Ex11_02 {
	public static void main(String[] args) {
      Product p01=new Product();
      Product p02=new Product();
      
      p01.setName("커피"); p01.setPrice(150);
      p02.setName("비타500"); p02.setPrice(500);
      
      System.out.println("자판기 => 제품목록");
      System.out.println(p01.getName()+ " " + p01.getPrice()+"원,");
      System.out.println(p02.getName()+ " " + p02.getPrice()+"원");
	}
}
