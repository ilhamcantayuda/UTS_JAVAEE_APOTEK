package EntityObat;
// Generated Nov 14, 2016 1:47:38 AM by Hibernate Tools 4.3.1



/**
 * Obat generated by hbm2java
 */
public class Obat  implements java.io.Serializable {


     private String kdObat;
     private String nmObat;
     private String jenisobat;
     private String tglkadaluarsa;
     private String harga;

    public Obat() {
    }

	
    public Obat(String kdObat, String jenisobat, String tglkadaluarsa, String harga) {
        this.kdObat = kdObat;
        this.jenisobat = jenisobat;
        this.tglkadaluarsa = tglkadaluarsa;
        this.harga = harga;
    }
    public Obat(String kdObat, String nmObat, String jenisobat, String tglkadaluarsa, String harga) {
       this.kdObat = kdObat;
       this.nmObat = nmObat;
       this.jenisobat = jenisobat;
       this.tglkadaluarsa = tglkadaluarsa;
       this.harga = harga;
    }
   
    public String getKdObat() {
        return this.kdObat;
    }
    
    public void setKdObat(String kdObat) {
        this.kdObat = kdObat;
    }
    public String getNmObat() {
        return this.nmObat;
    }
    
    public void setNmObat(String nmObat) {
        this.nmObat = nmObat;
    }
    public String getJenisobat() {
        return this.jenisobat;
    }
    
    public void setJenisobat(String jenisobat) {
        this.jenisobat = jenisobat;
    }
    public String getTglkadaluarsa() {
        return this.tglkadaluarsa;
    }
    
    public void setTglkadaluarsa(String tglkadaluarsa) {
        this.tglkadaluarsa = tglkadaluarsa;
    }
    public String getHarga() {
        return this.harga;
    }
    
    public void setHarga(String harga) {
        this.harga = harga;
    }




}


