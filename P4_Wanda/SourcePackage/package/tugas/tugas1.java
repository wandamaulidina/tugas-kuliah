import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {

        // S1: INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        String barang = input.nextLine();

        System.out.print("Masukkan harga: ");
        int harga = input.nextInt();

        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();

        // P1: PROSES
        int total = harga * jumlah;

        // S2: OUTPUT
        System.out.println("Barang: " + barang);
        System.out.println("Total bayar: " + total);
    }
}
