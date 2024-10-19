package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
@RequireAgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee postEmployee(Employee,employee)
        return employeeRepository.save(employee)
}
