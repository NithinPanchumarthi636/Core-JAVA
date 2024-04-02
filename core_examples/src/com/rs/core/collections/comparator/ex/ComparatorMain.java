package com.rs.core.collections.comparator.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// 1.
		List<Employee> employees = new ArrayList<>();

		// 2.
		employees.add(new Employee(5, "Ravi", 90000));
		employees.add(new Employee(3, "Nithin", 65000));
		employees.add(new Employee(6, "Sanjay", 53000));
		employees.add(new Employee(2, "Sai", 40000));
		employees.add(new Employee(7, "Neelima", 50000));
		employees.add(new Employee(1, "Pranitha", 60000));
		employees.add(new Employee(4, "Sowjanya", 70000));

		// 3.
		System.out.println("Iterate without sort");
		Iterator<Employee> iterator = employees.iterator();

		Employee employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			System.out.println(employee.getId() + "  , " + employee.getName() + " and " + employee.getSalary());
		}
		System.out.println("Iterate based on ID");
		Collections.sort(employees, new EmployeeIDComparator());

		iterator = employees.iterator();

		while (iterator.hasNext()) {
			employee = iterator.next();

			System.out.println(employee.getId() + "  , " + employee.getName() + " and " + employee.getSalary());

		}

		System.out.println("Iterate based on Salary");
		Collections.sort(employees, new EmployeeSalaryComparator());

		iterator = employees.iterator();

		while (iterator.hasNext()) {
			employee = iterator.next();

			System.out.println(employee.getId() + "  , " + employee.getName() + " and " + employee.getSalary());
		}

	}
}
