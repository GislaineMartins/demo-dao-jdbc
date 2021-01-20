package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.dao.DaoFactory;
import model.dao.SellerDao;
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
        
    }
    
}
