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
    public double [] getElmtBaris(int brs){
        double [] temp = new double[kolom];
        for (int i = 0; i < baris; i++){
                temp[i] = getELmt(brs, i);
            }
    
        return temp;
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

    public void setElmt(int brs ,int klm, double elmt) {
        matriks[brs][klm]=elmt;
    }
    public void setBaris(int brs, double[] el){
        
        for(int i = 0; i<baris;i++){
            setElmt(brs, i, el[i]);
        }
    }
    //Operasi Baris Elementer
    public void tambahBaris(double kali,int baris1, int baris2) {
        for (int i = 0; i < kolom; i++) {
            matriks[baris1][i] += (matriks[baris2][i]*kali);
        }
    }

    public void bagiBaris(int baris1,double x) {
        for (int i = 0; i < kolom; i++) {
            matriks[baris1][i] /= x;
        }
    }

    public boolean kolom0(int brs,int klm) {
        boolean ans=true;
        for (int i = brs; i < getBaris(); i++) {
            if (getELmt(i, klm)!=0) {
                ans = false;
            }
        }
        return ans;
    }
    public boolean baris0(int brs) {
        boolean ans =true;
        for (int i = 0; i < getKolom(); i++) {
            if (getELmt(brs, i)!=0) {
                ans = false;
            }
        }
        return ans;
    }
    public int firstn0(int brs,int klm) {
        int i=brs;
        while (getELmt(i, klm)==0 && i<getBaris()) {
            i++;
        }
        return i;
    }
}
