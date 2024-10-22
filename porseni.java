import java.util.Scanner;

public class porseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlpoltek;
        String nama;

        System.out.print("Masukkan jumlah politeknik yang mengikuti porseni: ");
        jmlpoltek = sc.nextInt();

        for (int i=1; i<=jmlpoltek; i++) {
            System.out.println("Atlet politeknik ke-" + i);
            sc.nextLine();
            for (int j=1; j<=5; j++) {
                System.out.print("atlet badminton ke-" + j + ": ");
                nama = sc.nextLine();
                if (j==5) {
                    System.out.println();
                }
            } for (int k=1; k<=5; k++) {
                System.out.print("atlet tenis meja ke-" + k + ": ");
                nama = sc.nextLine();
                if (k==5) {
                    System.out.println();
                }
            } for (int l=1; l<=5; l++) {
                System.out.print("atlet basket ke-" + l + ": ");
                nama = sc.nextLine();
                if (l==5) {
                    System.out.println();
                }
            } for (int m=1; m<=5; m++) {
                System.out.print("atlet voly ke-" + m + ": ");
                nama = sc.nextLine();
                if (m==5) {
                    System.out.println();
                }
            }
        }
    }
}
