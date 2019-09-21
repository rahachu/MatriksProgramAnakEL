public class main {
    public static void main(String[] args) {
        matriks a = new matriks();
        matriks b = new matriks();
        a.baca();
        b.baca();
        kofaktor.adjoint(a).tulis();
            kofaktor.inverspl(a,b).tulis();
    }
}