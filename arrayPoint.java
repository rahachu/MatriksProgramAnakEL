import java.util.Scanner;

public class arrayPoint {
    Scanner scan = new Scanner(System.in);
    public int Neff;
    public point[] arrPoints;

    // konstraktor
    public void makeArray(arrayPoint a, int x){
       a.arrPoints = new point [x];
       a.Neff =x;
    }
    // selektor
    public int getNeff(){
        return Neff;
    }
    public int getElmtX(int i){
        return arrPoints[i].x;
    }
    public int getElmtY(int i){
        return arrPoints[i].y;
    }
    //set NEff
    public void setElmtArr(arrayPoint a, point x, int i){
        a.arrPoints[i] = x;
    }
    //Baca
    public void bacaPoint(){
        int k = 0;
        System.out.print("Masukan Total Pengulangan: ");
        k = scan.nextInt();
        arrayPoint a = new arrayPoint();
        makeArray(a, k);
        for(int j = 0; j <a.getNeff(); j++){
            System.out.println("titik ke-" + j);
            point x = new point();
            setElmtArr(a,x, j);    
        }
    }
    // primitif lain
    static matriks titikToArray(arrayPoint a){
        matriks temp = new matriks();
        temp.setBaris(a.getNeff());
        temp.setKolom(a.getNeff()+1);
        temp.setMatriks();
        for(int i = 0; i<a.getNeff(); i++){
            for(int j = 0; j <= a.getNeff(); j++){
                if(j<a.getNeff()){
                    temp.setElmt(i, j, Math.pow(a.getElmtX(j),j));
                    
                }
                if(j == a.getNeff()){
                    temp.setElmt(i,j, a.getElmtY(j));
                }
            }
        }
        return temp;
    }
    
}