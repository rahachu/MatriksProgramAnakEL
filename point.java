import java.util.Scanner;

public class point {
    Scanner scan = new Scanner(System.in);
    int x;
    int y;

    public point() {
        System.out.print("Masukan nilai x: ");
        x = scan.nextInt();
        System.out.print("Masukan nilai y: ");
        y = scan.nextInt();
    }
}