import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("input Realisasi: ");
        float realisasi = input.nextFloat();

        System.out.print("input Kehadiran: ");
        float kehadiran = input.nextFloat();

        System.out.print("Tugas: ");
        float tugas = input.nextFloat();

        System.out.print("UTS: ");
        float uts = input.nextFloat();

        System.out.print("UAS: ");
        float uas = input.nextFloat();


        float b_kehadiran = (kehadiran / realisasi) * 10;
        float b_tugas = tugas * 20 / 100;
        float b_uts = uts * 30 / 100;
        float b_uas = uas * 40 / 100;

        float total = b_kehadiran + b_tugas + b_uts + b_uas;


        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Kehadiran: " + kehadiran + " Dari realisasi: " + realisasi);
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS  : " + uts);
        System.out.println("Nilai UAS  : " + uas);
        System.out.println("-------------------------");
        System.out.println("TOTAL NILAI: " + total);
    }
}