package morningAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
				List<Employee> a  = new ArrayList<Employee>();
				a.add(new Employee(1, "Janice", 80000, "it"));
				a.add(new Employee(2, "Jose", 20000, "IT"));
				a.add(new Employee(3, "Maria", 90000, "Payroll"));
				a.add(new Employee(4, "Tyler", 10000, "Finance"));
				
				System.out.println("Employee with salaray > 40000");
				List<Employee> newdata= a.stream().filter((s)->s.getIncome()>40000).collect(Collectors.toList());
				for(Employee e: newdata) {
					System.out.println(e.getName().toUpperCase());
				}
				//<Employee> caps = newdata.stream().map(String::toUpperCase);
				//System.out.println(newdata);
				
				long data= a.stream().filter((s)->s.getDepartment().equalsIgnoreCase("IT")).count();
				System.out.println(data);
				
				Optional<Employee> emp = a.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getIncome)));
				System.out.println(emp);
				
				Optional<Employee> emp2 = a.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getIncome)));
				System.out.println(emp2);
			}
			
		}
	


