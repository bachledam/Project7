import java.util.Collections;
import java.util.ArrayList;

public class HW8 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(111, "Jimmy Dean", 5256.32, 0);  
		Employee emp2 = new Employee(598, "Jen Johnson", 47370, 5); 
		Employee emp3 = new Employee(920, "Jan Jones", 47834.25, 1); 
			   
			  System.out.println(emp1.equals(emp3)); 
			 
			  ArrayList<Employee> list = new ArrayList<>(); 
			 
			  list.add(emp1); 
			  list.add(emp2); 
			  list.add(emp3); 
			 
			  Collections.sort(list);
			   
			  for (Employee e : list) 
			   System.out.println(e);
			}
	}
//-------------------------------------------------------------------------------------------------------------------
		class Employee implements Comparable<Employee>{
			private int id;
			private String name;
			private double salary;
			private int numberOfDependent;
		
		public Employee(int id, String name, double salary, int numberOfDependent) {
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getName(){
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary(){
			return salary;
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
		public int getNumberOfDependent(){
			return numberOfDependent;
		}
		public void setNumberofDependent(int numberOfDependent) {
			this.numberOfDependent=numberOfDependent;
		}
		@Override
		public String toString() {
			double netSalary = salary*0.91 + (numberOfDependent *0.01*salary);
				return "[" + id + ", " + name + ", " + netSalary + "]";
		}
		@Override
		public boolean equals(Object object) {
			Employee employee = (Employee) object;
			double netSalary1 = salary * 0.91 + (numberOfDependent * 0.01 * salary);
			double netSalary2 = employee.salary * 0.91 + (employee.numberOfDependent * 0.01 * employee.salary);
			  return Double.compare(netSalary1, netSalary2)  == 0;
		}
		@Override
		public int compareTo(Employee employee) {
			double netSalary1 = salary * 0.91 + (numberOfDependent * 0.01 * salary);
			double netSalary2 = employee.salary * 0.91 + (employee.numberOfDependent * 0.01 * employee.salary);
				return Double.compare(netSalary1, netSalary2);
		}
		}