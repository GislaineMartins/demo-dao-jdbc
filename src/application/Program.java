/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.etities.Department;
import model.etities.Seller;

/**
 *
 * @author gimcj
 */
public class Program {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Department obj = new Department(1, "Books");
        Seller s = new Seller(21, "Bob", "bob@gmil.com", new java.sql.Date(sdf.parse("06/06/1990").getTime()), 3000.0, obj);
        System.out.println(s);
    }
    
}
