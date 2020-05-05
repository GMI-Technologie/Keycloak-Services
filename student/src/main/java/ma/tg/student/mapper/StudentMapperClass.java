package ma.tg.student.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ma.tg.student.dto.StudentDTO;
import ma.tg.student.entities.Student;


@Service
public class StudentMapperClass {

	public List<Student> listStudentDtoToListStudent(List<StudentDTO> studentsDTOs) {

		List<Student> students = new ArrayList<>();
		studentsDTOs.forEach(student -> {
			students.add(StudentMapper.INSTANCE.studentDTOToStudent(student));
		});

		return students;
	}

	public List<StudentDTO> listStudentToListStudentDto(List<Student> students) {

		List<StudentDTO> studentsDto = new ArrayList<>();
		students.forEach(student -> {
			studentsDto.add(StudentMapper.INSTANCE.studentToStudentDTO(student));
		});

		return studentsDto;
	}
	
	
	

}
