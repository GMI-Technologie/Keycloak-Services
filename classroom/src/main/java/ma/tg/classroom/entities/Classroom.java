package ma.tg.classroom.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.tg.classroom.forms.ClassroomForm;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Classroom implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int Num;
	
	
	
	public void setData(ClassroomForm classroomForm) {
		
		setNum(classroomForm.getNum());
		
	}
	
	
	
	
	

}
