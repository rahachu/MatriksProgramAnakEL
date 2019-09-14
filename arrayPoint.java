import java.util.Scanner;

public class arrayPoint {
    Scanner scan = new Scanner(System.in);
    private int Neff;
    private point[] arrPoints;

    public arrayPoint() {
        System.out.print("Masukan jumlah titik:");
        Neff = scan.nextInt();
        for (int i = 0; i < Neff; i++) {
            arrPoints[i]= new point();
        }
    }
}