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
  System.out.println("5. Adjoint");
  System.out.println("6. Interpolasi Polinom");
  System.out.println("7. Keluar");
  int men;
  men=scan.nextInt();
  switch(men) {
  case 1:
  	System.out.println("Metode:");
  	System.out.println("1. Metode eliminasi Gauss");
  	System.out.println("2. Metode eliminasi Gauss-Jordan");
  	System.out.println("3. Metode matriks balikan");
  	System.out.println("4. Kaidah Cramer");
  	int mene;
  		mene=scan.nextInt();
  		switch(mene) {
  			case 1:
  			pilihmatriks(a);
       		double[] h = new double[a.getBaris()];
       		eliminasiGauss.makeEselonRed(a);
       		int k= 0;

       		h= solusiSPL.solusiUnikGauss(a);
       		for(int i= 0; i<a.getBaris(); i++){
       			k=i+1;
       			System.out.print("x"+k+": ");
       			System.out.println(h[i]);
       		}


  			break;

  			case 2:
       		pilihmatriks(a);
       		double[] b = new double[a.getBaris()];
       		eliminasiGauss.makeEselonRed(a);
       		int m= 0;

       		b= solusiSPL.solusiUnikGaussJordan(a);
       		for(int i= 0; i<a.getBaris(); i++){
       			m=i+1;
       			System.out.print("x"+m+": ");
       			System.out.println(b[i]);
       		}
       	

  			break;

  			case 3:

  			break;
  			case 4:
  			pilihmatriks(a);
  			cramer.result(a).tulis();

  			break;
  		}
  	

    break;

  case 2:
  	System.out.println("Metode:");
  	System.out.println("1. Metode eliminasi Gauss-Jordan");
  	System.out.println("2. Metode Ekspansi");
 
  	int mence;
  		mence=scan.nextInt();
  		switch(mence) {
  			case 1:
  			pilihmatriks(a);
  			System.out.println(eliminasiGauss.determinaneselon(a));

  			break;

  			case 2:
  			pilihmatriks(a);
  			System.out.println(kofaktor.detK(a));
       		

  			break;  			
  			
  		}

    break;
  

  case 3:
  	System.out.println("Metode:");
  	System.out.println("1. Metode eliminasi Gauss-Jordan");
  	System.out.println("2. Metode Adjoint");
  	int mente;
  		mente=scan.nextInt();
  		switch(mente) {
  			case 1:
  			pilihmatriks(a);

  			break;

  			case 2:
  			pilihmatriks(a);
       		kofaktor.invers(a).tulis();

  			break;
  			
  			
  		}
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