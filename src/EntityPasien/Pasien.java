package EntityPasien;
// Generated Nov 14, 2016 1:47:38 AM by Hibernate Tools 4.3.1



/**
 * Pasien generated by hbm2java
 */
public class Pasien  implements java.io.Serializable {


     private String kdPasien;
     private String nmPasien;
     private String jeniskelamin;
     private String up;
     private String alamat;
     private String tlp;

    public Pasien() {
    }

    public Pasien(String kdPasien, String nmPasien, String jeniskelamin, String up, String alamat, String tlp) {
       this.kdPasien = kdPasien;
       this.nmPasien = nmPasien;
       this.jeniskelamin = jeniskelamin;
       this.up = up;
       this.alamat = alamat;
       this.tlp = tlp;
    }
   
    public String getKdPasien() {
        return this.kdPasien;
    }
    
    public void setKdPasien(String kdPasien) {
        this.kdPasien = kdPasien;
    }
    public String getNmPasien() {
        return this.nmPasien;
    }
    
    public void setNmPasien(String nmPasien) {
        this.nmPasien = nmPasien;
    }
    public String getJeniskelamin() {
        return this.jeniskelamin;
    }
    
    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    public String getUp() {
        return this.up;
    }
    
    public void setUp(String up) {
        this.up = up;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getTlp() {
        return this.tlp;
    }
    
    public void setTlp(String tlp) {
        this.tlp = tlp;
    }




}


