import java.util.*;

public class matriks {
    Scanner scan = new Scanner(System.in);
    private int baris;
    private int kolom;
    private double[][] matriks;

    //Konstruktor matriks
    public matriks() {
        System.out.print("Masukan jumlah baris:");
        baris = scan.nextInt();
        System.out.print("Masukan jumlah kolom:");
        kolom = scan.nextInt();
        matriks = new double [baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j]= scan.nextInt();
            }
        }
    }

    //Selektor

    public int getBaris(){
        return baris;
    }
    public int getKolom(){
        return kolom;
    }
    public double getELmt(int brs, int klm){
        return (matriks[brs-1][klm-1]);
    }

    //Setter matriks
    public void tulis() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void setElmt(int brs ,int klm) {
        matriks[brs-1][klm-1]=scan.nextInt();
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

    public void buat1Utama(int baris1) {
        
    }

    //Gauss

    //Gauss Jordan
    public void gaussJordan() {
        //gauss();
        for (int i = kolom-2; i >= 0; i--) {
            for (int j = baris-1; j >= 0; j++) {
                if (getELmt(j, i)!=0) {
                    //obe;
                }
            }
        }
    }

}
