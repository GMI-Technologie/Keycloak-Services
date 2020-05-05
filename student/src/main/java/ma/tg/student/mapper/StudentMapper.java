package ma.tg.student.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ma.tg.student.dto.StudentDTO;
import ma.tg.student.entities.Student;
import ma.tg.student.forms.StudentForm;

@Mapper(componentModel = "spring")
public interface StudentMapper {

	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	@Mapping(source = "birthDate", dateFormat = "dd.MM.yyyy", target = "birthDate")
	public Student studentDTOToStudent(StudentDTO studentDTO);

	public StudentDTO studentToStudentDTO(Student student);
	
	@Mapping(source = "birthDate", dateFormat = "dd.MM.yyyy", target = "birthDate")
	public Student studentFormToStudent(StudentForm studentForm);

}
