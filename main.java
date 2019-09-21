public class main {
    public static void main() {
        matriks a = new matriks();
        matriks b = new matriks();
        a.baca();
        b.baca();
        kofaktor.adjoint(a).tulis();
            kofaktor.inverspl(a,b).tulis();
    }
}