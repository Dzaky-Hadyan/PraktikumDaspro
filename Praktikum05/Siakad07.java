import java.util.Scanner;
public class Siakad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama, nim;
        String kelas;
        byte absen;
        String nilaiAkhirHuruf = " ";
        String kualifikasi = " ";
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = (0.2 * nilaiKuis + 0.15 * nilaiTugas + 0.3 * nilaiUTS + 0.35 * nilaiUAS);
        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilaiAkhirHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }
        else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilaiAkhirHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilaiAkhirHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir <= 39) {
            nilaiAkhirHuruf = "E";
            kualifikasi = "Gagal";
        }
        System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")" + "kelas " + kelas + "nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        sc.close();
    }
}