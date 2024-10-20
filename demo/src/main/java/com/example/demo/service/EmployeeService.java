package com.example.demo.service;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public Employee postEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

}
