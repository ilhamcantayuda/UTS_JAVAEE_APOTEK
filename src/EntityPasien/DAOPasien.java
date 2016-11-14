/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityPasien;

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
public class DAOPasien {
     static SessionFactory session = HibernateUtil.getSessionFactory();
    
   public Session membukaSession(){
   return session.openSession();
   }
   
   public  List<Pasien> getData() {
        Session sess = this.membukaSession();
        Criteria c = sess.createCriteria(Pasien.class).addOrder(Order.asc("kdPasien"));
        List<Pasien> data = c.list();
       return data;
}
   public  void simpanPasien(Pasien d){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
   sess.saveOrUpdate(d);
   t.commit();
   }
   
   public Pasien cariPasienByKd(String kdPasien){
   Session sess = membukaSession();
   return (Pasien) sess.load(Pasien.class, kdPasien);
   }
   
   public  void deletPasien(String kd){
   Session sess = this.membukaSession();
   Transaction t = sess.beginTransaction();
 Pasien pasien =  (Pasien) sess.get(Pasien.class, new String(kd));
  sess.delete(pasien);// delete Database
        t.commit();  
   }
}
