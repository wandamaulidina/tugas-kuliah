import java.util.Scanner;

abstract class LivingThing {
    public void breath() {
        System.out.println("Bernafas melalui hidung.");
    }

    public void eat() {
        System.out.println("Makan melalui mulut.");
    }

    public abstract void walk();
}

class Human extends LivingThing {
    public void walk() {
        System.out.println("Berjalan dengan 2 kaki.");
    }
}

class Cat extends LivingThing {
    public void walk() {
        System.out.println("Berjalan dengan 4 kaki.");
    }
}

public class latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        Human manusia = new Human();
        Cat kucing = new Cat();

        System.out.println("\nNama: " + nama);

        System.out.println("\nManusia :");
        manusia.breath();
        manusia.eat();
        manusia.walk();

        System.out.println();

        System.out.println("Kucing :");
        kucing.breath();
        kucing.eat();
        kucing.walk();

        input.close();
    }
}