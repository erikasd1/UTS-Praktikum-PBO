package reservasiHotel;

import java.util.Scanner;

public class Akses implements PengelolaanKamar{
    private String name;
    private String user;
    private Kamar kamarPesan;
    private boolean kamarSudahDipesan;
    
    private Kamar kamarDefault = new Kamar("00", "Tidak ada kamar dipesan.", false, 0);
    
    public Akses(String name, String user){
        this.name = name;
        this.user = user;
        this.kamarPesan = kamarDefault;
        this.kamarSudahDipesan = false;
    }
    
    public boolean login(String name){
        return this.name == name;
    }
    
    public void kelolaKamar(Kamar kamar){
        System.out.println("\nMengubah status kamar (TERSEDIA/TIDAK TERSEDIA): ");
        Scanner scanner = new Scanner(System.in);
        String inputStatus = scanner.nextLine();
        
        boolean status = false;
        switch(inputStatus){
            case "TERSEDIA":
                status = true;
                break;
            case "TIDAK TERSEDIA":
                status = false;
                break;
            default:
                System.out.println("INPUTAN TIDAK VALID!!");
                System.exit(0);
                return;
        }
        kamar.setTersedia(status);
        System.out.println("Kamar No. " +kamar.getNomorKamar()+ " status menjadi " +(status? "TERSEDIA" : "TIDAK TERSEDIA"));
        
        System.out.println("\n ---Daftar Kamar Hotel ---");
    }
    
    public void pesanKamar(Kamar kamar){
        if(kamar.isTersedia()){
            kamar.setTersedia(false);
            kamar.setPemesan(name);
            this.kamarPesan = kamar;
            this.kamarSudahDipesan = true;
            System.out.println("Kamar No. " +kamar.getNomorKamar()+ " berhasil dipesan!");
        }else{
            System.out.println("Kamar No. " +kamar.getNomorKamar()+ " sudah dipesan.");
        }
    }
    
    public void detailPesanan(){
        if(kamarSudahDipesan){
            System.out.println("\n-------- TIKET PEMESANAN -------");
            System.out.println("Nama Pemesan : " +kamarPesan.getPemesan());
            System.out.println("Nomor Kamar  : " +kamarPesan.getNomorKamar());
            System.out.println("Tipe Kamar   : " +kamarPesan.getTipeKamar());
            System.out.println("Harga Kamar  : " +kamarPesan.getHarga());
            System.out.println("----------------------------------");
        }else{
            System.out.println("Anda belum memesan kamar hotel.");
        }
    }
}
