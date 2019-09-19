import java.util.Scanner;

public class arrayPoint {
    Scanner scan = new Scanner(System.in);
    private int Neff;
    private point[] arrPoints;

    public arrayPoint() {
        System.out.print("Masukan jumlah titik: ");
        Neff = scan.nextInt();
        for (int i = 0; i < Neff; i++) {
            arrPoints[i]= new point();
        }
    }
    public titikToArray(point[] a){
        matriks mtrx = new matriks();
        mtrx.setBaris(a.Neff);
        mtrx.setKolom(a.Neff+1);
        for(int i = 0; i<Neff; i++){
            for(int j = 0; j <= Neff; j++){
                if(j<Neff){
                    
                }
            }
        }
    }
}