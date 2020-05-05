package ma.tg.classroom;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import ma.tg.classroom.entities.Classroom;
import ma.tg.classroom.repositories.ClassroomRepository;


@Configuration
@Slf4j
public class LoadDataBase {

	
	
	
	
	@Bean
	CommandLineRunner initDatabase(ClassroomRepository classroomRepository) {
				return args -> {
					classroomRepository.save(new Classroom(null, 24));
					classroomRepository.save(new Classroom(null,1));
				
					classroomRepository.findAll().forEach(classroom -> {
				log.info(""+classroom);
				});
				};
	}
}
