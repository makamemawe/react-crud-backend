package com.mawe.employeemng.repository;

import com.mawe.employeemng.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
