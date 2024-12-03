package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("=== Insert ===");
//		Department newDepartment = new Department(null, "Recursos Humanos"); 		
//		departmentDao.insert(newDepartment);
//		System.out.println("\nInserted! New id= " + newDepartment.getId());
//		
//		System.out.println("=== Update ===");
//		System.out.print("Enter with the id to update: ");
//		int id = sc.nextInt();
//		Department dep = departmentDao.findById(id);
//		dep.setName("Software");			
//		departmentDao.update(dep);
//		System.out.println("\nUpdate sucess");
//		
//		System.out.println("=== FindById ===");
//		System.out.print("Enter with the id to find: ");
//		id = sc.nextInt();
//		dep =  departmentDao.findById(id);
//		System.out.println("\nFind sucess: " + dep);
//		
//		System.out.println("=== DeleteById ===");
//		System.out.print("Enter with the id to delete: ");
//		 id = sc.nextInt();
//		departmentDao.deleteById(id);
//		System.out.println("\nDelete sucess" );
		
		System.out.println("=== DeleteById ===");
				
		List<Department> dep = departmentDao.findALl();
		
		dep.forEach(System.out::println);
		System.out.println("\nDelete sucess" );
		
		sc.close();
		
		

	}

}
