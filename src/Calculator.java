import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("testing");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator sederhana");
        System.out.println("1. Jumlah");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        Integer input = scanner.nextInt();

//        System.out.println(scanner);
        if (input.equals(1)){
            System.out.println("Akan melakukan Penjumlahan");
            System.out.print("Masukan angka pertama : ");
            var angka1 = scanner.nextInt();
            System.out.print("Masukan angka kedua : ");
            var angka2 = scanner.nextInt();
            var hasil = angka1 + angka2;
            System.out.println("Hasil Penjumlahan nya adalah "+ hasil);
        } else if (input.equals(2)) {
            System.out.println("Akan melakukan Pengurangan");
            System.out.print("Masukan angka pertama : ");
            var angka1 = scanner.nextInt();
            System.out.print("Masukan angka kedua : ");
            var angka2 = scanner.nextInt();
            var hasil = angka1 - angka2;
            System.out.println("Hasil Pengurangan nya adalah "+ hasil);
        } else if (input.equals(3)) {
            System.out.println("Akan melakukan Perkalian");
            System.out.print("Masukan angka pertama : ");
            var angka1 = scanner.nextInt();
            System.out.print("Masukan angka kedua : ");
            var angka2 = scanner.nextInt();
            var hasil = angka1 * angka2;
            System.out.println("Hasil Perkalian nya adalah "+ hasil);
        } else if (input.equals(4)) {
            System.out.println("Akan melakukan Pembagian");
            System.out.print("Masukan angka pertama : ");
            var angka1 = scanner.nextInt();
            System.out.print("Masukan angka kedua : ");
            var angka2 = scanner.nextInt();
            var hasil = angka1 / angka2;
            System.out.println("Hasil Pembagian nya adalah "+ hasil);
        }else {
            System.out.println("INPUT ERROR SILAHKAN JALANKAN PROGRAM LAGI");
        }

//        Integer input = scanner.nextInt();
    }
}
