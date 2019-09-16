import java.util.*;

public class matriks {
    Scanner scan = new Scanner(System.in);
    private int baris;
    private int kolom;
    private double[][] matriks;

    //Konstruktor matriks
    public void setMatriks() {
        matriks = new double [baris][kolom];
    }

    //Selektor

    public int getBaris(){
        return baris;
    }
    public int getKolom(){
        return kolom;
    }
    public double getELmt(int brs, int klm){
        return (matriks[brs][klm]);
    }

    //Setter matriks
    public void baca() {
        System.out.print("Masukan jumlah baris:");
        baris = scan.nextInt();
        System.out.print("Masukan jumlah kolom:");
        kolom = scan.nextInt();
        matriks = new double [baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j]= scan.nextDouble();
            }
        }
    }

    public void setBaris(int x) {
        baris = x;
    }

    public void setKolom(int x) {
        kolom = x;
    }

    public void tulis() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void setElmt(int brs ,int klm, Double elmt) {
        matriks[brs][klm]=elmt;
    }

    //Operasi Baris Elementer
    public void tambahBaris(int kali,int baris1, int baris2) {
        for (int i = 0; i < kolom; i++) {
            matriks[baris1-1][i] += (matriks[baris2-1][i]*kali);
        }
    }

    public void bagiBaris(int baris1,int x) {
        for (int i = 0; i < kolom; i++) {
            matriks[baris1-1][i] /= x;
        }
    }
}
