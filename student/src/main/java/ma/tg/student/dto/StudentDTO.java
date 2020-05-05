package ma.tg.student.dto;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class StudentDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idStudent;
	private String firstName;
	private String lastName;
	private String birthDate;

}
