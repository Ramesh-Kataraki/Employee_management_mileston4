package com.Employee.Employee.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class EmployeeManagementApplication {
	@GetMapping("/Employee Management")
	public String welcome()
	{
		return "Employee Management";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
		ArrayList<Employee> employee=new ArrayList<>();
		employee.add(new Employee(1,"Ram", 20000));
		employee.add(new Employee(2,"Ramesh", 30000));
		employee.add(new Employee(3,"Rajkumar", 40000));
		employee.add(new Employee(4,"arjun", 50000));
		employee.add(new Employee(5,"manoj", 10000));
		employee.add(new Employee(6,"shiva", 25000));
		employee.add(new Employee(7,"jeeva", 28000));
		employee.add(new Employee(8,"Raj", 22000));
		employee.add(new Employee(9,"santhosh", 33000));
		employee.add(new Employee(10,"Ram", 42000));
		for(Employee e:employee)
		{
			System.out.println(e);
		}
	}

}
