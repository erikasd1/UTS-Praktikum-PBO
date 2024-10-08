package reservasiHotel;

public class DeluxeRoom extends Kamar{
    private String fasilitas;
    
    public DeluxeRoom(String nomorKamar, boolean tersedia, double harga){
        super(nomorKamar, "Deluxe Room", tersedia, harga);
        this.fasilitas = "Large Room, Mini-bar";
    }
    
    @Override
    public void tampilkanDetailKamar(){
        super.tampilkanDetailKamar();
        System.out.println("Fasilitas Tambahan: " +fasilitas);
    }
}
