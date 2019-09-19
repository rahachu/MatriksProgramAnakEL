import java.util.*;

public class point {
    Scanner scan = new Scanner(System.in);

    public void point() {
        int a = scan.nextInt();
        System.out.print("Masukan nilai x y: ");
        double[][] temp = new double[a][2];
        for(int i = 0; i<a; i++){
            for(int j = 0; j<2; j++){
            temp[i][j] = scan.nextInt();
            }
        }
    }
    public void pointToMatriks(matriks a){
        int x;
        matriks save = new matriks();
        for(int i = 0; i< a.getBaris(); i++){
            for(int j = 0; j<2; j++){
            double tempx = a.getELmt(i, j);
            
                for(int k = 0; k<=a.getBaris(); k++){
                    if(k<a.getBaris() && j ==0 ){
                    save.setElmt(i, k, Math.pow(tempx,k));
                    }
                    else{
                        save.setElmt(i,a.getKolom(),tempx);
                    }
                }
            }
        }
        

        
    }
}