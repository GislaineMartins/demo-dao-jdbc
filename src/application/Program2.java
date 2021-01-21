package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.etities.Department;

/**
 *
 * @author Gislaine
 */
public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TEST 1: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findAll =======");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 4: department insert ====");
        Department newDepartment = new Department(null, "Clothes");
        departmentDao.insert(newDepartment);
        System.out.println("Inserido! Novo id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: update =======");
        Department dep2 = departmentDao.findById(7);
        dep2.setName("Toys and Games");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }

}
