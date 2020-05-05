package ma.tg.student.services;

import java.text.ParseException;
import java.util.List;

import ma.tg.student.dto.StudentDTO;
import ma.tg.student.forms.StudentForm;

public interface StudentService {

	public List<StudentDTO> getStudents();

	public StudentDTO getStudentById(Long id);

	public StudentDTO saveStudent(StudentForm studentForm);

	public boolean deleteStudent(Long id);

	public StudentDTO updateStudent(Long id, StudentForm studentForm)throws ParseException;
}
