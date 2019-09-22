import java.util.*;
public class menu {
	

  static void pilihmatriks (matriks a){
  	 Scanner scan = new Scanner(System.in);
	System.out.println("Pilih jenis inputan");
	System.out.println("1. Keyboard");
	System.out.println("2. File");
	int me;
	me=scan.nextInt();
	switch(me){
		case 1: a.baca();
		break;
		case 2: fileRead.matriks(a);
		break;
	 }
  }
 static void pilihinterv (arrayPoint p){
  	 Scanner scan = new Scanner(System.in);
	System.out.println("Pilih jenis inputan");
	System.out.println("1. Keyboard");
	System.out.println("2. File");
	int me;
	me=scan.nextInt();
	switch(me){
		case 1: p.bacaPoint();
		break;
		case 2: fileRead.interpolasi(p);
		break;
	 }
  }
  public static void main(String[] args) {
  	Scanner scan = new Scanner(System.in);
  	int x;
  	int y;
  	matriks a = new matriks();
  	arrayPoint p = new arrayPoint();
  System.out.println("Menu:");
  System.out.println("1. Sistem Persamaaan Linier");
  System.out.println("2. Determinan");
  System.out.println("3. Matriks balikan");
  System.out.println("4. Matriks kofaktor");
  System.out.println("5. Adjoin");
  System.out.println("6. Interpolasi Polinom");
  System.out.println("7. Keluar");
  int men;
  men=scan.nextInt();
  switch(men) {
  case 1:
  	System.out.println("Metode:");
  	System.out.println("1. Metode eliminasi Gauss");
  	System.out.println("2. Metode eliminasi Gass-Jordan");
  	System.out.println("3. Metode matriks balikan");
  	System.out.println("4. Kaidah Cramer");
  	int mene;
  		mene=scan.nextInt();
  		switch(mene) {
  			case 1:

  			break;

  			case 2:
       		pilihmatriks(a);

  			break;

  			case 3:
  			pilihmatriks(a);
       		kofaktor.inverspl(a).tulis();

  			break;
  			case 4:
  			pilihmatriks(a);
  			cramer.result(a).tulis();

  			break;
  		}

    break;

  case 2:
  pilihmatriks(a);
  System.out.println(kofaktor.detK(a));
   
    break;

  case 3:
  pilihmatriks(a);
  kofaktor.invers(a).tulis();

    break;

  case 4:
  pilihmatriks(a);
  kofaktor.coffactor(a).tulis();
    break;

  case 5:
  pilihmatriks(a);
  kofaktor.adjoint(a).tulis();
    break;

  case 6:
  pilihinterv(p);

    break;
   
  case 7:
  System.exit(0);
    break;
  
  default:
    // code block
}
  }

}