package com.example.springbootmongodb.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/all")
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        return employeeRepository.save(employee);
    }

    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable String id) {
        System.out.println(id);
        return employeeRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable String id) {
        System.out.println(id);
        employeeRepository.deleteById(id);
        return "deleted employee with id : " + id;
    }

}
