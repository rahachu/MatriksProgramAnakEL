public class main {
    public static void main(String[] args) {
        matriks a = new matriks();
        a.baca();
        eliminasiGauss.makeEselon(a);
        a.tulis();
    }
}