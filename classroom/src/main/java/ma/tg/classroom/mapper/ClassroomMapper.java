package ma.tg.classroom.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ma.tg.classroom.dto.ClassroomDTO;
import ma.tg.classroom.entities.Classroom;
import ma.tg.classroom.forms.ClassroomForm;

@Mapper(componentModel = "spring")
public interface ClassroomMapper {

	
	ClassroomMapper INSTANCE = Mappers.getMapper(ClassroomMapper.class);
	
	
	
	
	public Classroom classroomDtoToClassroom(ClassroomDTO classroomDTO);
	public ClassroomDTO classroomToClassroomDto(Classroom classroom);
	public Classroom classroomFormToClassroom(ClassroomForm classroomForm);
	
}
