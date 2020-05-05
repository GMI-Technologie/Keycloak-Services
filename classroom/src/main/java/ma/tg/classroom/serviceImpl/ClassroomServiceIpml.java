package ma.tg.classroom.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.tg.classroom.dto.ClassroomDTO;
import ma.tg.classroom.entities.Classroom;
import ma.tg.classroom.forms.ClassroomForm;
import ma.tg.classroom.mapper.ClassroomMapper;
import ma.tg.classroom.mapper.ClassroomMapperList;
import ma.tg.classroom.repositories.ClassroomRepository;
import ma.tg.classroom.service.ClassroomSerivce;


@Service
public class ClassroomServiceIpml implements ClassroomSerivce{
	
	@Autowired
	private ClassroomMapperList classroomMapperList;
	
	@Autowired
	private ClassroomRepository classroomRepository;

	@Override
	public List<ClassroomDTO> getClassrom() {
		List<Classroom> classrooms =classroomRepository.findAll();
		return classroomMapperList.listClassroomToListClassroomDTO(classrooms);
	}

	@Override
	public ClassroomDTO getClassroomById(Long id) {
		Optional<Classroom> classroom = classroomRepository.findById(id);
		return ClassroomMapper.INSTANCE.classroomToClassroomDto(classroom.get());
	}

	@Override
	public ClassroomDTO addClassroom(ClassroomForm classroomForm) {
		Classroom classroom = ClassroomMapper.INSTANCE.classroomFormToClassroom(classroomForm);
		classroomRepository.save(classroom);
		return ClassroomMapper.INSTANCE.classroomToClassroomDto(classroom);
	}

	@Override
	public boolean deleteClassroom(Long id) {
		Optional<Classroom> classroom = classroomRepository.findById(id);
		if(classroom!=null) {
			classroomRepository.delete(classroom.get());
			return true;
		}
		return false;
	}

	@Override
	public ClassroomDTO updateClassroom(Long id, ClassroomForm classroomForm) {
		Optional<Classroom> classrooms = classroomRepository.findById(id);
		Classroom classroom =classrooms.get();
		classroom.setData(classroomForm);
		return ClassroomMapper.INSTANCE.classroomToClassroomDto(classroom);
	}

}
