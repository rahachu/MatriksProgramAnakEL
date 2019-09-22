public class main {
    public static void main(String[] args) {
        matriks a = new matriks();
        double [] b = new double[a.getBaris()];
        a.baca();
       eliminasiGauss.makeEselonRed(a);
       int x = 0;
      b =  solusiSPL.solusiUnikGaussJordan(a);
       for(int i = 0; i<a.getBaris(); i++){
           x = i+1;
           System.out.print("X"+ x +": ");
           System.out.println(b[i]);
       }
}
}