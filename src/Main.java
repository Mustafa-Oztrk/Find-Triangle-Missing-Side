import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aKenar, bKenar, bilinmeyen;
        System.out.println("ÜÇgeninizin bilinmeyen kenar açısını bulma ");

                System.out.println("Bilinen ilk kenar açısını giriniz");
                aKenar = scanner.nextInt();

                System.out.println("Bilininen ikinci kenar açısını giriniz");
                bKenar = scanner.nextInt();

                bilinmeyen =180 - (aKenar +bKenar);
                System.out.println("Eksik olan kenar açısı : " +bilinmeyen);



    }
}