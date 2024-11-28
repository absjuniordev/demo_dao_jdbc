package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.creatSellerDao();

		System.out.println("=== TEST 1:  seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println();

		System.out.println("=== TEST 2:  seller findDepartmentId ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);

		System.out.println();

		System.out.println("=== TEST 3:  seller findAll ===");
		list = sellerDao.findALl();
		list.forEach(System.out::println);

		System.out.println();

		System.out.println("=== TEST 4:  seller insert ===");
		Seller newSeller = new Seller(null, "Junior", "jr@gmail.com", new Date(), 4500.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id= " + newSeller.getId());

		System.out.println();

		System.out.println("=== TEST 5:  seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Matha Waine");

		sellerDao.update(seller);
		System.out.println("Seller update");

	}

}
