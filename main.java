public class main {
    public static void main(String[] args) {
        matriks a = new matriks();
<<<<<<< HEAD
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
=======
        matriks b = new matriks();
        double c;
        a.baca();
        c=eliminasiGauss.determinaneselon(a);
        System.out.println(c);
        System.out.println(kofaktor.detK(a));
    }
>>>>>>> d6eb12d2ee28448b04826de475683ae6428c4abd
}