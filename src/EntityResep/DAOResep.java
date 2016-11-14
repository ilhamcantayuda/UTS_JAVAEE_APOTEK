/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityResep;

import com.klinik3.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author albi
 */
public class DAOResep {
     static SessionFactory session = HibernateUtil.getSessionFactory();
    
   public Session membukaSession(){
   return session.openSession();
   }
   
   public  List<Resep> getData() {
        Session sess = this.membukaSession();
        Criteria c = sess.createCriteria(Resep.class).addOrder(Order.asc("kdResep"));
        List<Resep> data = c.list();
       return data;
}
   public  void simpanResep(Resep r){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
   sess.saveOrUpdate(r);
   t.commit();
   }
   
   public Resep cariResepByKd(String kdResep){
   Session sess = membukaSession();
   return (Resep) sess.load(Resep.class, kdResep);
   }
   
   public  void deletPasien(String kd){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
 Resep resep =  (Resep) sess.get(Resep.class, new String(kd));
  sess.delete(resep);// delete Database
        t.commit();  
   }
}
