package ma.tg.student.controllers;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.tg.student.feignClient.ClassroomFiegnClient;
import ma.tg.student.modelFeign.Classroom;

@RestController
public class FeignCotroller {
	
	
	@Autowired
	private ClassroomFiegnClient classroomFiegnClient;
	 @Autowired
	private KeycloakRestTemplate keycloakRestTemplate;
	
	 
	 private String url ="http://localhost:8082/api/classroom";
	 
	 
	 @GetMapping("api/classroom")
	 public List<Classroom> getClassroom(){
		 return classroomFiegnClient.getClassroom();
	 }

	 
	 
	 
	
	 @GetMapping("api/classrooms")
	 public Collection<Classroom> getClassrooms(){
		    ResponseEntity<Classroom[]> entity = keycloakRestTemplate.getForEntity(url, Classroom[].class);
		    return Arrays.asList(entity.getBody());
		}
					
	                

	        

	       
}
