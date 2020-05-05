package ma.tg.classroom.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ma.tg.classroom.dto.ClassroomDTO;
import ma.tg.classroom.entities.Classroom;

@Service
public class ClassroomMapperList {

	public List<ClassroomDTO> listClassroomToListClassroomDTO(List<Classroom> classrooms) {

		List<ClassroomDTO> classroomsDto = new ArrayList<>();

		classrooms.forEach(classroom -> {
			classroomsDto.add(ClassroomMapper.INSTANCE.classroomToClassroomDto(classroom));

		});
		return classroomsDto;
	}

}
