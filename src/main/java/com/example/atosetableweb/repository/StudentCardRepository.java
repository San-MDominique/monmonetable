package com.example.atosetableweb.repository;

import com.example.atosetableweb.model.StudentCards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCardRepository extends JpaRepository<StudentCards, Long> {
}
