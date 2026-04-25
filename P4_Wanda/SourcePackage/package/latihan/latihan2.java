import java.util.scanner;
public class latihan2 {
    public static void main(String[] args){
        scanner input = new scanner(System.in);

        System.out.printf("Input Data Pengeluaran");
        System.out.printf("Makan: ");
        float makan = input.nextFloat();

        System.out.printf("Transport: ");
        float transport = input.nextFloat();

        System.out.printf("Belanja: ");
        float belanja = input.nextFloat();

        float total = makan + transport + belanja;

        float p_makan = (makan/total) * 100;
        float p_transport = (transport/total) * 100;
        float p_belanja = (belanja/total) * 100;

        System.out.println("Presentase Makan : %.1f%%\n", p_makan);
        System.out.println("Presentase Transport : %.1f%%\n", p_transport);
        System.out.println("Presentase Belanja : %.1f%%\n", p_belanja);
        
    }
}