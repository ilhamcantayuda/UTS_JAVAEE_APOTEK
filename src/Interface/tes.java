/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import EntityResep.Resep;
import com.klinik3.util.HibernateUtil;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author albi
 */
public class tes {
     public static void main(String[] args) {
         

        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        Query query = session.createQuery("from Resep order by index DESC");
                       query.setMaxResults(1);
    Resep last = (Resep) query.uniqueResult();
             // One to many query, get all dosen
            //ambil nama dosen wali
            System.out.println("Nama Dosen "+last.getIndex());
            int a = last.getIndex()+1;
            System.out.println(a);
  
        
}
}
