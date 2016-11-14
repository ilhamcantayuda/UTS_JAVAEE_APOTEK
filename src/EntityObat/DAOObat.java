/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityObat;

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
public class DAOObat {
     static SessionFactory session = HibernateUtil.getSessionFactory();
    
   public Session membukaSession(){
   return session.openSession();
   }
   
   public  List<Obat> getData() {
        Session sess = this.membukaSession();
        Criteria c = sess.createCriteria(Obat.class).addOrder(Order.asc("kdObat"));
        List<Obat> data = c.list();
       return data;
}
   public  void simpanObat(Obat d){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
   sess.saveOrUpdate(d);
   t.commit();
   }
   
   public Obat cariObatByKd(String kdObat){
   Session sess = membukaSession();
   return (Obat) sess.load(Obat.class, kdObat);
   }
   
   public  void deletObat(String kd){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
 Obat obat =  (Obat) sess.get(Obat.class, new String(kd));
  sess.delete(obat);// delete Database
        t.commit();  
   }
}
