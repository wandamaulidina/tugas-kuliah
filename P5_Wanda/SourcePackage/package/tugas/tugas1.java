import java.util.Scanner;
public class tugas1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double totalPertemuan, hadir;
        double tugas, uts, uas;
        String grade;

        System.out.print("Total pertemuan:");
        totalPertemuan = input.nextDouble();
        System.out.print("Jumlah hadir:");
        hadir = input.nextDouble();
        System.out.print("Nilai tugas:");
        tugas = input.nextDouble();
        System.out.print("Nilai UTS:");
        uts = input.nextDouble();
        System.out.print("Nilai UAS:");
        uas = input.nextDouble();

        double totalNilai;

        double minimhadir = totalPertemuan * 75.0 / 100.0;
        double nilaihadir = hadir / totalPertemuan * 10;
        double nilaitugas = tugas * 0.20;
        double nilaiuts = uts * 0.30;
        double nilaiuas = uas * 0.40;

        totalNilai = nilaihadir + nilaitugas + nilaiuts + nilaiuas;

        if(hadir< minimhadir && totalNilai > 55){
            totalNilai = 55;
        }

        if(totalNilai >= 80){
            grade = "A";
        } else if(totalNilai >= 70){
            grade = "B";
        } else if(totalNilai >= 60){
            grade = "C";
        } else if(totalNilai >= 55){
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Kehadiran: "+hadir + " dari " + totalPertemuan + " pertemuan");
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("Grade: " + grade);

        if(totalNilai >= 60){
            System.out.println("Kamu lulus");
        } else {
            System.out.println("Kamu tidak lulus");
        }

        input.close();
    }
}