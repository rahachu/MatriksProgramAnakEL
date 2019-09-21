public class main {
    public static void main(String[] args) {
        matriks a = new matriks();
        a.baca();
        a.tulis();
        cramer.cramy(a, 0).tulis();
        cramer.cramy(a, 1).tulis();
        cramer.cramy(a, 2).tulis();
        cramer.ori(a).tulis();
    }
}