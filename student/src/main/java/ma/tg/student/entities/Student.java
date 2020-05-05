package ma.tg.student.entities;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.tg.student.forms.StudentForm;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStudent;
	private String firstName;
	private String lastName;
	private Date birthDate;

	public void setData(StudentForm studentForm) throws ParseException {
		String f_name = studentForm.getFirstName();
		String l_name = studentForm.getLastName();
		Date date = new SimpleDateFormat("dd.MM.yyyy").parse(studentForm.getBirthDate());
		if (f_name != null) {
			setFirstName(f_name);
		}
		if (l_name != null) {
			setLastName(l_name);
		}
		if (date != null) {
			setBirthDate(date);
		}

	}

}
