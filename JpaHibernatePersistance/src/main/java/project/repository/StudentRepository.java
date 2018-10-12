package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.model.student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}