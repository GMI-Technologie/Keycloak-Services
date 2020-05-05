package ma.tg.student;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import ma.tg.student.entities.Student;
import ma.tg.student.repositories.StudentRepository;

@Configuration
@Slf4j
public class LoadDataBase {

	@Bean
	CommandLineRunner initDatabase(StudentRepository studentRepository) {
				return args -> {
					studentRepository.save(new Student(null, "Baggins", "burglar",new Date()));
					studentRepository.save(new Student(null,"Frodo", "Baggins", new Date()));
				
				studentRepository.findAll().forEach(student -> {
				log.info("information " + student);
				});
				};
	}

}
