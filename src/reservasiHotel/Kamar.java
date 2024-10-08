package reservasiHotel;

public class Kamar {
    private String nomorKamar;
    private String tipeKamar;
    private boolean tersedia;
    private String pemesan;
    private double harga;
    
    public Kamar(String nomorKamar, String tipeKamar, boolean tersedia, double harga){
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.tersedia = tersedia;
        this.pemesan = "";
        this.harga = harga;
    }
    
    public String getNomorKamar(){
        return nomorKamar;
    }
    public String getTipeKamar(){
        return tipeKamar;
    }
    
    public boolean isTersedia(){
        return tersedia;
    }
    
    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;
    }
    
    public String getPemesan(){
        return pemesan;
    }
    
    public void setPemesan(String pemesan){
        this.pemesan = pemesan;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void tampilkanDetailKamar(){
        System.out.println("\nKamar No. " +nomorKamar);
        System.out.println("Tipe: " +tipeKamar);
        System.out.println("Status: " +(tersedia ? "Tersedia " : "Tidak Tersedia."));
        System.out.println("Harga: " +harga);
    }
}
