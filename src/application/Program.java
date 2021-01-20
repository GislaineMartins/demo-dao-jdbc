package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.etities.Department;
import model.etities.Seller;

/**
 *
 * @author Gislaine
 */
public class Program {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
       // Seller s = new Seller(21, "Bob", "bob@gmil.com", new java.sql.Date(sdf.parse("06/06/1990").getTime()), 3000.0, obj);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
        System.out.println("\n=== TEST 2: seller findByIdDepartment ====");
        Department  department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("\n=== TEST 3: seller findAll ====");        
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("\n=== TEST 4: seller insert ===="); 
        Seller newSeller = new Seller(null, "Marcos", "marcos@gmil.com", new java.sql.Date(sdf.parse("22/03/1995").getTime()), 2000.0,department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido! Novo id = "+newSeller.getId());
        
        System.out.println("\n=== TEST 4: seller update ===="); 
        seller = sellerDao.findById(10);
        seller.setEmail("martinha@gmail.com"); 
        sellerDao.update(seller);
        System.out.println("alterado com sucesso");
        
        
    }
    
}
