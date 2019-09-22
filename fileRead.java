import java.util.*;
import java.io.*;

public class fileRead {
    public static void matriks(matriks a) {
        try {
            Scanner scan = new Scanner(System.in);
            String filename=scan.nextLine();
            Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
            String count = sc.nextLine();
            Scanner counts = new Scanner(count);
            sc.close();
            sc=null;
            sc= new Scanner(new BufferedReader(new FileReader(filename)));
            while (sc.hasNextLine()) {
                a.setBaris(a.getBaris()+1);
                sc.nextLine();
            }
            while (counts.hasNextDouble()) {
                a.setKolom(a.getKolom()+1);
                counts.nextDouble();
            }
            a.setMatriks();
            sc.close();
            sc=null;
            sc= new Scanner(new BufferedReader(new FileReader(filename)));
            for (int i=0; i<a.getBaris(); i++) {
                for (int j=0; j<a.getKolom(); j++) {
                    a.setElmt(i, j, sc.nextDouble());
                }
            }
            sc.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public static void interpolasi(arrayPoint a) {
        try {
            Scanner scan = new Scanner(System.in);
            String namafile = scan.nextLine();
            Scanner scn = new Scanner(new BufferedReader(new FileReader(namafile)));
            point poy= new point();
            int i = 0;
            while (scn.hasNextLine()) {
                poy.x=scn.nextDouble();
                poy.y=scn.nextDouble();
                a.setElmtArr(poy,i);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}