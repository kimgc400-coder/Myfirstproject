
//이곳으로 흘러들어온 값들은 request를 처리하는 동안만 살아있는 지역변수이다.
// 다오의 메서드에서 만들어지는 객체들의 참조를 담는 변수나/ doPost(); doGet(); servicer();등 
//모두 메서드를 끝내면 참조가 사라지기 때문에 DTO에 값이 계속 저장되어있지는 않는다는 것이다.
//객체가 GC의 대상이 되어서 사라지니까
package net.daum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDTO {
	
		private String test_id;
		private String test_title;
		private String test_cont;
		private String test_pass; 
		private String test_name;
		private String test_phone;
		private String test_email;
		
		}
