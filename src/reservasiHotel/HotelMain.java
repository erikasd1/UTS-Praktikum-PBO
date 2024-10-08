package reservasiHotel;

import java.util.Scanner;

public class HotelMain {
    public static void main (String[] args){
        Kamar kamar1 = new Kamar("01", "Standard Room",true, 500000);
        Kamar kamar2 = new SuiteRoom("02", true, 1500000);
        Kamar kamar3 = new DeluxeRoom("03", true, 2000000);
        Kamar kamar4 = new SuiteRoom("04", true, 1700000);
        Kamar kamar5 = new DeluxeRoom("05", true, 2500000);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------------- WELCOME ---------------");
        System.out.print("User anda (ADMIN/CUSTOMER)  : " );
        String user = scanner.nextLine();

        switch(user){
            case "ADMIN":
            case "CUSTOMER":
                System.out.print("Masukkan Nama Anda          : ");
                String name = scanner.nextLine();
                
                Akses akses = new Akses(name, user);
                if(akses.login(name)){
                    switch(user){
                        case "ADMIN":
                            System.out.println("Login berhasil.");
                            System.out.println("\nHalo " +name+ " Anda dapat mengelola kamar.");
                            System.out.println("\n--- Daftar Kamar Hotel ---");
                            kamar1.tampilkanDetailKamar();
                            kamar2.tampilkanDetailKamar();
                            kamar3.tampilkanDetailKamar();
                            kamar4.tampilkanDetailKamar();
                            kamar5.tampilkanDetailKamar();
                            System.out.print("\nPilih nomor kamar untuk di kelola (01-05): ");
                            String nomorKamarAdmin = scanner.nextLine();
                            Kamar kamarKelola;
                            
                            switch(nomorKamarAdmin){
                                case "01":
                                    kamarKelola = kamar1; break;
                                case "02": 
                                    kamarKelola = kamar2; break;
                                case "03":
                                    kamarKelola = kamar3; break;
                                case "04":
                                    kamarKelola = kamar4; break;
                                case "05":
                                    kamarKelola = kamar5; break;
                                default:
                                    System.out.println("NOMOR KAMAR TIDAK VALID!");
                                    return;
                            }
                            akses.kelolaKamar(kamarKelola);
                            break;
                            
                        case "CUSTOMER":
                            System.out.println("Login berhasil.");
                            System.out.print("\nHalo " +name+ " ingin memesan kamar hotel (y/n): ");
                            String pesan = scanner.nextLine();
                            
                            switch(pesan){
                                case "y":
                                    System.out.println("\n--- Daftar Kamar Hotel ---");
                                    kamar1.tampilkanDetailKamar();
                                    kamar2.tampilkanDetailKamar();
                                    kamar3.tampilkanDetailKamar();
                                    kamar4.tampilkanDetailKamar();
                                    kamar5.tampilkanDetailKamar();
                                    System.out.print("\nPilih nomor kamar hotel untuk dipesan (01-05): ");
                                    int nomorKamar = scanner.nextInt();
                                    Kamar kamarDipilih;
                                    
                                    switch(nomorKamar){
                                        case 1:
                                            kamarDipilih = kamar1; break;
                                        case 2:
                                            kamarDipilih = kamar2; break;
                                        case 3: 
                                            kamarDipilih =kamar3; break;
                                        case 4:
                                            kamarDipilih = kamar4; break;
                                        case 5:
                                            kamarDipilih = kamar5; break;
                                        default:
                                            System.out.println("NOMOR KAMAR TIDAK VALID!");
                                            return;
                                    }
                                    akses.pesanKamar(kamarDipilih);
                                    
                                    System.out.print("\nApakah Anda ingin melihat pesanan Anda (y/n): ");
                                    String detail = scanner.next();
                                    switch(detail){
                                        case "y":
                                            akses.detailPesanan(); break;
                                        default:
                                            System.out.println("Pesanan tidak ditampilkan."); break;
                                    }
                                    break;
                                case "n":
                                    System.out.println("Pemesanan kamar dibatalkan. Terima Kasih.");
                                    return;
                                default:
                                    System.out.println("PILIHAN TIDAK VALID!");
                            }
                            break;
                    }
                }else{
                    System.out.println("Login gagal.");
                }
                break;
            default:
                System.out.println("USER TIDAK VALID!");
                return;
        }
        kamar1.tampilkanDetailKamar();
        kamar2.tampilkanDetailKamar();
        kamar3.tampilkanDetailKamar();
        kamar4.tampilkanDetailKamar();
        kamar5.tampilkanDetailKamar();
    }
}
