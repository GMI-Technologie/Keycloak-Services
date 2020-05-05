package ma.tg.student.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.tg.student.dto.StudentDTO;
import ma.tg.student.forms.StudentForm;
import ma.tg.student.services.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<StudentDTO> getStudents() {
		return studentService.getStudents();
	}

	@GetMapping(value = "/{id}")
	public StudentDTO getstudent(@PathVariable(value = "id") Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping
	public StudentDTO saveStudent(@RequestBody StudentForm studentForm) {
		return studentService.saveStudent(studentForm);
	}

	@DeleteMapping(value = "/{id}")
	public boolean deleteStudent(@PathVariable(value = "id") Long id) {
		return studentService.deleteStudent(id);
	}

	@PutMapping(value = "/{id}")
	public StudentDTO updateStudent(@PathVariable(value = "id") Long id, 
			@RequestBody StudentForm studentForm) throws ParseException{
		return studentService.updateStudent(id, studentForm);
	}

}
