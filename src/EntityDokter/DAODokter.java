/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDokter;

import com.klinik3.util.HibernateUtil;
import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.Order;

/**
 *
 * @author albi
 */
public class DAODokter {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    
   public Session membukaSession(){
   return session.openSession();
   }
   
   public  List<Dokter> getData() {
        Session sess = this.membukaSession();
        Criteria c = sess.createCriteria(Dokter.class).addOrder(Order.asc("kdDokter"));
        List<Dokter> data = c.list();
       return data;
}
   public  void simpanDokter(Dokter d){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
   sess.saveOrUpdate(d);
   t.commit();
   }
   
   public Dokter cariDokterByKd(String kdDokter){
   Session sess = membukaSession();
   return (Dokter) sess.load(Dokter.class, kdDokter);
   }
   
   public  void deletDokter(String kd){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
 Dokter dokter =  (Dokter) sess.get(Dokter.class, new String(kd));
  sess.delete(dokter);// save ke database
        t.commit();  
   }
 
    

}
