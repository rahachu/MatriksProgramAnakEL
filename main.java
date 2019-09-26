public class main {
    public static void main(String[] args) {
        matriks a = new matriks();
        matriks b = new matriks();
        double c;
        a.baca();
        c=eliminasiGauss.determinaneselon(a);
        System.out.println(c);
        System.out.println(kofaktor.detK(a));
    }
}