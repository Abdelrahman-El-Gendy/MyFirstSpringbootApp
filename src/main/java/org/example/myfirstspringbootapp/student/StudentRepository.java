package org.example.myfirstspringbootapp.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * This Interface is responsible for data access -->> Data Access Layer
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s where s.email=?1")
    Optional<Student> findStudentByEmail(String email);

}
