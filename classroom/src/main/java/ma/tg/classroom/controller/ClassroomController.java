package ma.tg.classroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.tg.classroom.dto.ClassroomDTO;
import ma.tg.classroom.forms.ClassroomForm;
import ma.tg.classroom.service.ClassroomSerivce;



@RestController
@RequestMapping("api/classroom")
public class ClassroomController {
	
	@Autowired
	private ClassroomSerivce classService;
	
	@GetMapping
	public List<ClassroomDTO> getClassroom(){
		return classService.getClassrom();
	}
	
	@PostMapping
	public ClassroomDTO addClassroom(ClassroomForm classroomForm) {
		return classService.addClassroom(classroomForm);
	}
	
	@GetMapping(value = "/{id}")
	public ClassroomDTO getClassroomById(@PathVariable(value = "id") Long id) {
		return classService.getClassroomById(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean deleteClassroom(@PathVariable(value = "id") Long id) {
		return classService.deleteClassroom(id);
	}

	
}
