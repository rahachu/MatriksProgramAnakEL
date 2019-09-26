import java.util.*;

public class point {
	//Struktur tipe data point
    Scanner scan = new Scanner(System.in);

    double x;
    double y;

    public  void baca() {
    	//Input
        System.out.print("Masukan nilai x: ");
        x = scan.nextDouble();
        System.out.print("Masukan nilai y: ");
        y = scan.nextDouble();

    }
}