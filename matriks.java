import java.util.*;

public class matriks {
    Scanner scan = new Scanner(System.in);
    private int baris;
    private int kolom;
    private double[][] matriks;

    //Konstruktor matriks
    public void setMatriks() {
        //Membuat matriks dengan ukuran baris x kolom
        matriks = new double [baris][kolom];
    }

    //Selektor

    public int getBaris(){
        //Mengembaikan jumlah baris
        return baris;
    }
    public int getKolom(){
        //Mengembalikan jumlah kolom
        return kolom;
    }
    public double getELmt(int brs, int klm){
        //Mengembalkan nilai elemen ke baris x kolom
        return (matriks[brs][klm]);
    }
    public double [] getElmtBaris(int brs){
        //Mengembalikan array berisi elemen baris ke brs
        double[] temp = new double [kolom];
        for (int i = 0; i < baris; i++){
                temp[i] = getELmt(brs, i);
            }
    
        return temp;
    }

    //Setter matriks
    public void baca() {
        //Membaca matriks yang merupakan input dari user
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
        //Menetapkan baris sesuai nilai x
        baris = x;
    }

    public void setKolom(int x) {
        //Menetapkan kolom sesuai nilai x
        kolom = x;
    }

    public void tulis() {
        //Menuliskan matriks ke layar
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void setElmt(int brs ,int klm, double elmt) {
        //Menentukan nilai elemen baris x kolom sesuai elmt
        matriks[brs][klm]=elmt;
    }
    public void setBaris(int brs, double[] el){
        //Menentukan baris
        
        for(int i = 0; i<baris;i++){
            setElmt(brs, i, el[i]);
        }
    }

    //Operasi Baris Elementer
    public void tambahBaris(double kali,int baris1, int baris2) {
        //Menambahkan baris
        for (int i = 0; i < kolom; i++) {
            matriks[baris1][i] += (matriks[baris2][i]*kali);
        }
    }


    public void bagiBaris(int baris1,double x) {
        //Membagi baris dengan x
        for (int i = 0; i < kolom; i++) {
            matriks[baris1][i] /= x;
        }
    }

    public boolean kolom0(int brs,int klm) {
        //Mengecek apakah kolom kosong
        boolean ans=true;
        for (int i = brs; i < getBaris(); i++) {
            if (getELmt(i, klm)!=0) {
                ans = false;
            }
        }
        return ans;
    }
    public boolean baris0(int brs) {
        //Mengecek apakah baris kosong
        boolean ans =true;
        for (int i = 0; i < getKolom(); i++) {
            if (getELmt(brs, i)!=0) {
                ans = false;
            }
        }
        return ans;
    }
    public int firstn0(int brs,int klm) {
        //Mengembalikan indeks pertama yang kosong
        int i=brs;
        while (getELmt(i, klm)==0 && i<getBaris()) {
            i++;
        }
        return i;
    }

    public matriks tranpos() {
        //Menukarkan elemen baris x kolom dengan elemen kolom x baris
        matriks temp = new matriks();
        temp.setKolom(getBaris());
        temp.setBaris(getKolom());
        temp.setMatriks();

        for (int i = 0; i < getBaris(); i++) {
            for (int j = 0; j < getKolom(); j++) {
              temp.setElmt(j, i, getELmt(i, j));
            }
        
       
    }
     return temp;
}
    static matriks kali(matriks a, matriks b){
        //Mengalikan dua buah matriks
        matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(b.getKolom());
        temp.setMatriks();
        for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < b.getKolom(); j++) {
                int x = 0;
                for (int k = 0; k < b.getBaris(); k++) {
                    x += a.getELmt(i,k) * b.getELmt(k,j);
                }
                temp.setElmt(i,j,x);
            }
        }
        return temp;
    }
}
