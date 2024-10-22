import java.util.Scanner;

public class squareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();

        for (int i=1; i<=angka; i++ ) {
            for (int j=1; j<=angka; j++) {
                if (i>1 && j>1 && i<angka && j<angka) {
                    System.out.print("  ");
                } else {
                    System.out.print(angka + " ");
                }
            } System.out.println();
        }
    }
}
