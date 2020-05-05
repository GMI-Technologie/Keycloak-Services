package ma.tg.student.feignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import ma.tg.student.modelFeign.Classroom;

@FeignClient(value = "classroom" ,url = "http://localhost:8082")
public interface ClassroomFiegnClient {
	
	
	@GetMapping(value = "/api/classroom")
	public List<Classroom> getClassroom();

}
