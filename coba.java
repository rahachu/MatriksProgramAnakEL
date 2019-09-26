public class coba{

    public static void main(String[] args){
        matriks a = new matriks();
        a.baca();
       /* a = eliminasiGauss.buatMatAugmen(a);
        /*eliminasiGauss.makeEselon(a);
        a.tulis();
        eliminasiGauss.makeEselonRed(a);
        a.tulis();*/
        eliminasiGauss.inversGaussJordan(a).tulis();
    }
}