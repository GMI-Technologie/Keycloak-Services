package ma.tg.student.serviceImpl;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ma.tg.student.dto.StudentDTO;
import ma.tg.student.entities.Student;
import ma.tg.student.forms.StudentForm;
import ma.tg.student.mapper.StudentMapper;
import ma.tg.student.mapper.StudentMapperClass;
import ma.tg.student.repositories.StudentRepository;
import ma.tg.student.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentMapperClass studentMapperClass;

	@Override
	public List<StudentDTO> getStudents() {

		return studentMapperClass.listStudentToListStudentDto(studentRepository.findAll());
	}

	@Override
	public StudentDTO getStudentById(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		return StudentMapper.INSTANCE.studentToStudentDTO(student.get());
	}

	@Override
	public StudentDTO saveStudent(StudentForm studentForm) {
		Student student =StudentMapper.INSTANCE.studentFormToStudent(studentForm);
		studentRepository.save(student);
		return StudentMapper.INSTANCE.studentToStudentDTO(student);
	}

	@Override
	public boolean deleteStudent(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		if(student!=null) {
			studentRepository.delete(student.get());
			return true;
		}
		return false;
	}

	@Override
	public StudentDTO updateStudent(Long id, StudentForm studentForm) throws ParseException {
		Optional<Student> students = studentRepository.findById(id);
		Student student =students.get();
		student.setData(studentForm);
		studentRepository.save(student);
		return StudentMapper.INSTANCE.studentToStudentDTO(student);
	}

}
