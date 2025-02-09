package javabean;
import java.util.Scanner;
class EmployeeMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter the ID of the employee: ");
		System.out.println("Enter the Name of the employee: ");
		System.out.println("Enter the Salary of the employee: ");
		/*
		  int id=sc.nextInt();
		e.setId(id);
		*/
		e.setId(sc.nextInt());
		/*
		String name=sc.next();
		 e.setName(name);
		 */
		e.setName(sc.next());
		 
		/* double salary=sc.nextDouble();
		 e.setSalary(salary);*/
		e.setSalary(sc.nextDouble());
		
		sc.close();
		System.out.println("Employee details are:   ");
		// System.out.println("id "+ id +" name "+name +" salary "+salary);
		System.out.println("id: "+e.getId()+" name "+e.getName() +" salary "+e.getSalary());
		 

				 
	}

}
