import java.util.Scanner;

public class arrayPoint {
    Scanner scan = new Scanner(System.in);
    public int Neff;
    public point[] arrPoints;

    // konstraktor
    public void makeArray(int x){
       arrPoints = new point [x];
       Neff =x;
    }
    // selektor
    public int getNeff(){
        return Neff;
    }
    public double getElmtX(int i){
        return arrPoints[i].x;
    }
    public double getElmtY(int i){
        return arrPoints[i].y;
    }
    //set NEff
    public void setElmtArr( point x, int i){
        arrPoints[i] = x;
    }
    //Baca
    public void bacaPoint(){
        int k = 0;
        System.out.print("Masukan Total Pengulangan: ");
        k = scan.nextInt();
        makeArray(k);
        for(int j = 0; j <getNeff(); j++){
            System.out.println("titik ke-" + (j+1));
            point x = new point();
            setElmtArr( x, j);   
        }
    }
    // primitif lain
   public matriks titikToArray(){
        matriks temp = new matriks();
        temp.setBaris(getNeff());
        temp.setKolom(getNeff()+1);
        temp.setMatriks();
    for(int i = 0; i < getNeff(); i++){
        for(int j = 0; j <= getNeff(); j++){
            if(i < getNeff()){
                temp.setElmt(i, j, Math.pow(getElmtX(i),j));
            }
            if(j == getNeff()){
                temp.setElmt(i, j, getElmtY(i));
            }
        }
    }

        return temp;
    }
   public void tulisPoint(){
        for(int i = 0; i<Neff; i++){
            System.out.print(arrPoints[i].x);
                    
        }
    }
    public void tulisSolusiInterpolasi(double [] a){
        for(int i = 0; i < getNeff(); i++){
            System.out.print(a[i] + " ");
            if(i !=0){
                System.out.print(a[i] + " ");
                System.out.print("X^" + i + " + ");
            }
        }
    }
}