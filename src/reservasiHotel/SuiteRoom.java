package reservasiHotel;

public class SuiteRoom extends Kamar{
    private String fasilitas;
    
    public SuiteRoom(String nomorKamar, boolean tersedia, double harga){
        super(nomorKamar, "Suite Room", tersedia, harga);
        this.fasilitas = "Private Pool, King-size Bed";
    }
    
    @Override
    public void tampilkanDetailKamar(){
        super.tampilkanDetailKamar();
        System.out.println("Fasilitas Tambahan: " +fasilitas);
    }
}
