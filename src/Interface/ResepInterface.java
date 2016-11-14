/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import EntityDokter.DAODokter;
import EntityResep.DAOResep;
import EntityDokter.Dokter;
import EntityObat.DAOObat;
import EntityObat.Obat;
import EntityPasien.DAOPasien;
import EntityPasien.Pasien;
import EntityResep.Resep;
import com.klinik3.util.HibernateUtil;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;

/**
 *
 * @author albi
 */
public class ResepInterface extends javax.swing.JInternalFrame {
ResultSet rs;
    java.util.List list;
    DefaultTableModel modelpasien;
    DefaultTableModel modeldokter;
    DefaultTableModel modelobat;
    /**
     * Creates new form ResepInterface
     */
    public ResepInterface() {
        initComponents();
        modeldokter = (DefaultTableModel) tbldokter.getModel();
        modelobat = (DefaultTableModel) tblobat.getModel();
        modelpasien = (DefaultTableModel) tblpasien.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkdresep = new javax.swing.JTextField();
        txtkddokter = new javax.swing.JTextField();
        txtkdpasien = new javax.swing.JTextField();
        txtjp = new javax.swing.JTextField();
        tglresep = new com.toedter.calendar.JDateChooser();
        txtkdobat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldokter = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpasien = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblresep = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblobat = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setText("jLabel1");

        jLabel2.setText("Kode Resep");

        jLabel3.setText("Kode Dokter");

        jLabel4.setText("Kode Pasien");

        jLabel5.setText("Jenis Penyakit");

        jLabel6.setText("Tanggal Resep");

        jLabel7.setText("Kode Obat");

        tbldokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Dokter", "Nama Dokter"
            }
        ));
        tbldokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldokter);

        tblpasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Pasien", "Nama Pasien"
            }
        ));
        tblpasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpasienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpasien);

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");

        tblresep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Resep", "Kode Dokter", "Kode Pasien", "Jenis Penyakit", "Tanggal Resep", "Kode Obat"
            }
        ));
        jScrollPane4.setViewportView(tblresep);

        tblobat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Obat", "Nama Obat", "Tangal Kadaluarsa"
            }
        ));
        tblobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblobatMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblobat);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkddokter, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkdresep, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtjp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tglresep, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkdpasien, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkdobat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtkdresep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtkddokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtkdpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtjp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tglresep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtkdobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsimpan)
                            .addComponent(jButton2))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        Session session = HibernateUtil.getSessionFactory().openSession();
       
 

        DAOResep daoResep = new DAOResep();
        Resep r = new Resep();
           String tampilan ="yyyy-MM-dd" ; 
SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
String tanggal = String.valueOf(fm.format(tglresep.getDate()));
      try{
        r.setKdResep(txtkdresep.getText());
        r.setKdDokter(txtkddokter.getText());
        r.setKdPasien(txtkdpasien.getText());
        r.setJp(txtjp.getText());
        r.setTglresep(tanggal);
        r.setKdObat(txtkdobat.getText());
        daoResep.simpanResep(r);
    JOptionPane.showMessageDialog (null, "Berhasil Menyimpan", "Title", JOptionPane.INFORMATION_MESSAGE);
bersih();
      } 
      catch (Exception E){
       JOptionPane.showMessageDialog (null, "Gagal Menyimpan", "Title", JOptionPane.INFORMATION_MESSAGE);
      }
         
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void tbldokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldokterMouseClicked
        txtkddokter.setText(String.valueOf(tbldokter.getValueAt(tbldokter.getSelectedRow(), 0)));
    }//GEN-LAST:event_tbldokterMouseClicked

    private void tblobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblobatMouseClicked
      txtkdobat.setText(String.valueOf(tblobat.getValueAt(tblobat.getSelectedRow(), 0)));
    }//GEN-LAST:event_tblobatMouseClicked

    private void tblpasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpasienMouseClicked
       txtkdpasien.setText(String.valueOf(tblpasien.getValueAt(tblpasien.getSelectedRow(), 0)));
    }//GEN-LAST:event_tblpasienMouseClicked
  
    public  void tampiltabelobat(){
   DAOObat daoObat = new DAOObat();
    while(modelobat.getRowCount()> 0){
    modelobat.removeRow(0);
    }
    List<Obat> data = daoObat.getData();
    Iterator it = data.iterator();
    Obat obat = null;
        while (it.hasNext()) {
           obat = (Obat) it.next();
          modelobat.addRow(new Object[]{obat.getKdObat(),obat.getNmObat(),obat.getTglkadaluarsa()});   
        }
    
 }
        public  void tampiltabelpasien(){
    DAOPasien daoPasien = new DAOPasien();
    while(modelpasien.getRowCount()> 0){
    modelpasien.removeRow(0);
    }
    List<Pasien> data = daoPasien.getData();
    Iterator it = data.iterator();
   Pasien pasien = null;
        while (it.hasNext()) {
           pasien = (Pasien) it.next();
          modelpasien.addRow(new Object[]{pasien.getKdPasien(),pasien.getNmPasien()});   
        }
 }
    public  void tampiltabeldokter(){
    DAODokter daoDokter = new DAODokter();
    while(modeldokter.getRowCount()> 0){
    modeldokter.removeRow(0);
    }
    List<Dokter> data = daoDokter.getData();
    Iterator it = data.iterator();
    Dokter dok = null;
        while (it.hasNext()) {
           dok = (Dokter) it.next();
           modeldokter.addRow(new Object[]{dok.getKdDokter(),dok.getNmDokter()});   
        }
 }
    public void bersih(){
    txtkdresep.setText("");
    txtkddokter.setText("");
    txtkdpasien.setText("");
    txtjp.setText("");
    tglresep.setDate(null);
    txtkdobat.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tbldokter;
    private javax.swing.JTable tblobat;
    private javax.swing.JTable tblpasien;
    private javax.swing.JTable tblresep;
    private com.toedter.calendar.JDateChooser tglresep;
    private javax.swing.JTextField txtjp;
    private javax.swing.JTextField txtkddokter;
    private javax.swing.JTextField txtkdobat;
    private javax.swing.JTextField txtkdpasien;
    private javax.swing.JTextField txtkdresep;
    // End of variables declaration//GEN-END:variables
}