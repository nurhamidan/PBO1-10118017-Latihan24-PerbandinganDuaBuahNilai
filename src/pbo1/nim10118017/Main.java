package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Membandingkan dua buah nilai yang dimasukkan user.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        boolean ulangi;
        do {
            ulangi = false;
            Scanner scanner = new Scanner(System.in);
            
            //Memasukkan nilai.
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = scanner.nextInt();
            
            //Menentukan kondisi nilai.
            if (nilai1 > nilai2) {
                System.out.println(nilai1 + " Lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println(nilai1 + " Lebih kecil dari " + nilai2);
            } else {
                System.out.println(nilai1 + " Sama dengan " + nilai2);
            }
            
            //Mendapatkan data untuk proses pengulangan.
            boolean valid = false;
            do {
                scanner = new Scanner(System.in);
                String jawaban;
                System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
                jawaban = scanner.nextLine().toUpperCase();
                switch (jawaban) {
                    case "YA":
                        valid = true;
                        ulangi = true;
                        break;
                    case "TIDAK":
                        valid = true;
                        ulangi = false;
                        break;
                    default:
                        valid = false;
                        System.out.println("Maaf, silakan coba lagi.");
                        break;
                }
            } while (!valid);
            
        } while (ulangi);
        
        System.out.println(FOOTER);
    }
    
}
