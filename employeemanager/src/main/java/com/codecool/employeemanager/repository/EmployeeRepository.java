package com.codecool.employeemanager.repository;

import com.codecool.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Transactional
    @Modifying
    @Query("delete from Employee e where e.id= :id")
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
