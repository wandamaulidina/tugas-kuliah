import java.util.Scanner;

public class latihan1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String grade;

        System.out.print("Kehadiran: ");
        double absen = input.nextDouble();

        System.out.print("Nilai: ");
        int nilai = input.nextInt();

        double validasi = 21 * 75.0 / 100.0;
        if (nilai >= 80){
            grade = "A";
        } else if (nilai >= 70){
            grade = "B";
        } else if (nilai >= 60){
            grade = "C";
        } else if (nilai >= 55){
            grade = "D";
        } else {
            grade = "E";
        }
        if (absen >= validasi){
            System.out.println("Nilai: " + nilai);
            System.out.println("Grade: " + grade);
        } else {
            if (nilai >= 55){
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("Kehadiran kurang dari 75%");
            System.out.println("Nilai: " + nilai);
            System.out.println("Grade: " + grade);
            System.out.println("Kamu tidak lulus");
        }
    }
}