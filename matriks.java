import java.util.*;

public class matriks {
    Scanner scan = new Scanner(System.in);
    private int baris;
    private int kolom;
    private int[][] matriks;

    public matriks() {
        System.out.print("Masukan jumlah baris:");
        baris = scan.nextInt();
        System.out.print("Masukan jumlah kolom:");
        kolom = scan.nextInt();
        matriks = new int [baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j]= scan.nextInt();
            }
        }
    }

    public void tulis() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }

    

}
