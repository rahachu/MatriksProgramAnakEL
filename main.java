public class main {
    public static void main(String[] args) {
        matriks a = new matriks();
        matriks c = new matriks();
        double [] b = new double[a.getBaris()];
        a.baca();
        c=a;
        c.tulis();
       eliminasiGauss.makeEselonRed(c);
       c.tulis();
      solusiSPL.BanyakGauss(c).tulis();
    
       /*for(int i = 0; i<a.getBaris(); i++){
           x = i+1;
           System.out.print("X"+ x +": ");
           System.out.println(b[i]);
       }*/
}
}