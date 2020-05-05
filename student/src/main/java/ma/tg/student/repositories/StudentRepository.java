package ma.tg.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.tg.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
