public class solusiSPL{
    private static final double epsilon = 1e-8;
    
    static double[] getCopyKolomY(matriks a){
        double[] kolomY = new double[a.getBaris()];
        for(int i = 0; i < a.getBaris(); i++){
            kolomY[i] = a.getELmt(i, a.getKolom()-1);
        }
        return kolomY;

    }
    static double [] solusiUnikGauss(matriks a){
        
        double [] kolomY = getCopyKolomY(a);
        double[] result = new double[a.getKolom()];
        for (int i = a.getBaris() -1; i>=0; i--){
            double sum = 0;
            for(int j = i+1; j<a.getBaris(); j++){
                sum += a.getELmt(i, j)*result[j];
            }
            result[i] = (kolomY[i] - sum)/a.getELmt(i, i);
        }
        return result;
    }
    static double [] solusiUnikGaussJordan(matriks a){

        double [] result = new double[a.getBaris()];
        double[] kolomY = getCopyKolomY(a);
        for(int i = 0; i < a.getBaris(); i++){
            if(Math.abs(a.getELmt(i, i))> epsilon){
                result[i] = kolomY[i]/a.getELmt(i,i);
            }
            else if(Math.abs(a.getELmt(i, i))< epsilon){
                return null;
            }
        }
        return result;

    }

    public static void BanyakGauss(matriks a) {
        //manulis hasil spl solusi banyak dengan metode gauss
        matriks b = a;
        matriks c = new matriks();
        int count=0;
        int j;
        c.setBaris(a.getBaris());
        c.setKolom(a.getKolom());
        c.setMatriks();
        eliminasiGauss.makeEselonRed(b);
        for (int i = 0; i < b.getBaris(); i++) {
            j=0;
            while (!b.baris0(i) && b.getELmt(i, j)==0){
                j++;
            }
            if (!b.baris0(i)) {
                for (int k = 0; k < c.getKolom(); k++) {
                    c.setElmt(j, k, b.getELmt(i, k));
                }
            }
        }
        for (int i = 0; i < c.getBaris(); i++) {
            System.out.print("X"+(i+1)+": ");
            if (!c.baris0(i)) {
                System.out.print(c.getELmt(i, c.getKolom()-1));
                for (j = i+1; j < c.getKolom()-1; j++) {
                    if (c.getELmt(i, j)!=0) {
                        if (c.getELmt(i, j)<0) {
                            System.out.print('+');
                        }
                        System.out.print(-c.getELmt(i, j));
                        System.out.print((char)(118-j));
                    }
                }
                System.out.println();
            }
            else{
                System.out.println((char)(118-i));
                count++;
            }
        }
    }

    static boolean isAda(matriks a){
        int i = 0;
        while(i<a.getKolom() && a.getELmt(a.getBaris()-1,i)==0){
            i++;
        }
        return !(i==a.getKolom()-1);
    }

    static boolean isUnik(matriks a){
        int i=0;
        while(i<a.getBaris() && !a.baris0(i)){
            i++;
        }
        return i == a.getBaris();
    }

}