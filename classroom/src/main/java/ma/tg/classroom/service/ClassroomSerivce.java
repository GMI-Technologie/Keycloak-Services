package ma.tg.classroom.service;

import java.util.List;

import ma.tg.classroom.dto.ClassroomDTO;
import ma.tg.classroom.forms.ClassroomForm;

public interface ClassroomSerivce {
	
	
	
	
	public List<ClassroomDTO> getClassrom();
	
	public ClassroomDTO getClassroomById(Long id);
	
	public ClassroomDTO addClassroom(ClassroomForm classroomForm);
	
	public boolean deleteClassroom(Long id);
	
	public ClassroomDTO updateClassroom(Long id, ClassroomForm classroomForm);

}
