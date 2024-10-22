import java.util.Scanner;

public class rataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nilai, totalNilai, rataNilai;

        int i=1;
        while (i<=5) {
            System.out.println("input nilai mahasiswa ke " + i);
            totalNilai=0;
            for (int j=1; j<=5; j++) {
                System.out.print("nilai ke-" + j + " = ");
                nilai=sc.nextFloat();
                totalNilai+=nilai;
            } rataNilai = totalNilai/5;
            System.out.println("rata-rata nilai mahasiswa ke-" + i + " adalah " + rataNilai);
            i++;
        }
    }
}
