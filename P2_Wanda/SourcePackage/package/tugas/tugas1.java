import java.util.Scanner;
// Masukkan nama barang, harga, dan jumlah, lalu hitung total bayar
public class tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        String barang = input.nextLine();

        System.out.print("Masukkan harga: ");
        int harga = input.nextInt();

        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();

        int total = harga * jumlah;

        System.out.println("Barang: " + barang);
        System.out.println("Total bayar: " + total);
    }
}
