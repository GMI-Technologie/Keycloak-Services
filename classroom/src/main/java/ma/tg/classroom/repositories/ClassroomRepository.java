package ma.tg.classroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.tg.classroom.entities.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long>{

}
