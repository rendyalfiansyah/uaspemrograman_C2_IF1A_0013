import java.util.Scanner;
public class UAS {}
    // 1. Deklarasi Variable dan scanner
    Scanner sc = new Scanner(System.in);
    String[]namaPenyewa = new String[3];
    String[]jenisKendaraan = new String[3];
    double[]jumlahHariSewa = new double[3];
   
    // 2. Membuat Method untuk menampilkan Menu
    public void tampilkanMenu() {
        System.out.println("\n===== Menu Program =====");
        System.out.println("1. Mencatat Penyewaan kendaraan");
        System.out.println("2. Menampilkan seluruh data penyewaan");
        System.out.println("3. Menampilkan Ringkasan Rental");
        System.out.println("4. Keluar Program");
        System.out.print("Pilih menu (1-4): ");
    }

    // 3. Membuat fungsi input
    public int inputPilihan() {
        try {
            int pilihan = sc.nextInt();
            sc.nextLine();
            return pilihan;
        } catch (Exception e) {
            sc.nextLine();
            return -1;
        }
    }

    // 4. Membuat method 
    public void KategoriPenyewaan() {
        System.out.println("\n===== Kategori Penyewaan =====");
        if (kategori <= 300.000) {
         kategori1 = "(Ekonomis)";
      } else if (kategori <=300.000;>=750.000) {
         kategori2= "(Standar)";
      } else {
         kategori3 = "(Premium)";
      }
    

    // 5. Membuat method untuk menampilkan biaya
    public void tampilkanSemuabiaya() {
        System.out.println("\n===== Biaya =====");
       switch (kategori) {
            case 1:
               kategori1 = kategori1;
               biayaSewa = <=300.000";
               break;
            case 2:
               kategori2 = kategori2;
               biayaSewa = 300.000-750.000";
               break;
            case 3:
               kategori3 = kategori3;
               biayaSewa = >=750.000";
               break;
            case 4 :
                break;
    }

    // 6. Membuat method untuk menghitung biaya sewa
    public void hitungKelulusan() {
        System.out.println("\n===== Biaya Sewa =====");
        if (!biayaSewa) {
            System.out.println("Data belum tersedia. Silakan input data terlebih dahulu.");
            return;
        } else {

            int ekonomis <=300000;
            int Premium >= 750000;

            for (int i = 0;) {
                if (KategoriPenyewaan[i] <=300000) {
                    Ekonomis++;
                    System.out.println(KategoriPenyewaan[i] + " (Nilai: " + KategoriPenyewaan[i] + ") - Ekonomis");
                } else {
                    Premium;
                    System.out.println(KategoriPenyewaan[i] + " (Nilai: " + KategoriPenyewaan[i] + ") - Premium");
                }
            }

            System.out.println("\nRingkasan:");
            System.out.println("biayaEkonomis:"+ Ekonomis);
            System.out.println("biayaStandart:"+ Standart);
            System.out.println("biayaPremium:"+ Premium);
            
        }
    }

    // 7. Membuat fungsi untuk mengulangi program
    public boolean tanyaUlangi() {
        System.out.print("\nApakah ingin mengulang program? (ya/tidak): ");
        String jawab = sc.nextLine().toLowerCase();

        while (!jawab.equals("ya") && !jawab.equals("tidak")) {
            System.out.print("Input tidak valid. Masukkan 'ya' atau 'tidak': ");
            jawab = sc.nextLine().toLowerCase();
        }

        return jawab.equals("ya");
    

    public static void main(String[] args) {
        // 8. Membuat object
        UAS obj = new UAS();

        boolean lanjut = true;

        // 9. Membuat perulangan untuk mengulangi program
        while (lanjut) {
            obj.tampilkanMenu();
            int pilihan = obj.inputPilihan();

            // 10. Membuat Switch Case
            switch (pilihan) {
                case 1:
                    obj.MencatatPenyewaankendaraan();
                    break;
                case 2:
                    obj.Menampilkanseluruhdatapenyewaan();
                    break;
                case 3:
                    obj.MenampilkanRingkasanRental();
                    System.err.println("ringkasan belum dapat di tampilkan");
                    break;
                case 4:
                    break;
        }
    }