public class eliminasiGauss{

    public static void tukarBaris(matriks a,int b1,int b2){
    // akan mengurutkan baris sesuai element pertamanya dngan urutan mengecil.
    double sementara;
    if (b1!=b2){
        for (int i = 0 ; i < a.getKolom() ; i++){
            sementara=a.getELmt(b1, i);
            a.setElmt(b1, i, a.getELmt(b2, i));
            a.setElmt(b2, i, sementara);
        }}
    }
    static void makeEselon(matriks a){
        int stateEselon=0;
        for (int i = 0; i < a.getKolom()-1; i++) {
            if (!a.baris0(stateEselon)){
                if (!a.kolom0(stateEselon,i)) {
                    int n0 = a.firstn0(stateEselon,i);
                    if (n0>stateEselon) {
                        tukarBaris(a, stateEselon, n0);
                    }
                    a.bagiBaris(stateEselon, a.getELmt(stateEselon, i));
                    for (int j = stateEselon+1 ; j < a.getBaris(); j++) {
                        a.tambahBaris(-a.getELmt(j, i), j, stateEselon);
                    }
                    if (stateEselon<a.getBaris()) {
                        stateEselon++;
                    }
                }
            }
        }
    }
    static double determinaneselon(matriks a){
        matriks b = a;
        double temp;
        for (int i = 0; i < a.getKolom()-1; i++) {
            for (int j = i+1; j < a.getKolom(); j++) {
                temp = b.getELmt(j, i)/b.getELmt(i, i);
                for (int k = 0; k < a.getKolom(); k++) {
                    b.setElmt(j, k, b.getELmt(j, k)-b.getELmt(i, k)*temp);
                }
            }
        }      
        double result=1;
            for (int i = 0; i < a.getKolom(); i++) {
                result*=b.getELmt(i, i);
            }
        return result;
        }

    

    static void makeEselonRed(matriks a) {
        makeEselon(a);
        for (int i = a.getBaris()-1; i > 0; i--) {
            for (int j = 0; j < a.getKolom()-1; j++) {
                if (a.getELmt(i, j)==1) {
                    for (int k = i-1; k >= 0; k--) {
                        a.tambahBaris(-a.getELmt(k, j), k, i);
                    }
                    j=a.getKolom();
                }
            }
        }
    }
   /* public void resultSpl(matriks a){
        double[] temp = new double[a.getBaris()]; // untuk menyimpan element matrik kolom teralhir (konstanta spl)
        for (int i = 0; i<a.getBaris(); i++){
            temp[i] = matrik[i][a.getKolom()];
        }
        double [] resultSpl = new double[a.getKolom()];
        for (int kol = a.getKolom()-2; kol>=0; kol--){
            double sum = 0;
            for (int i = kol + 1; i<a.getKolom(); i--){
                sum += a.getELmt(kol, i)*resultSpl[i];}
            resultSpl[brs] = (temp[i] - sum)/a.getELmt(i, i);
            
        }
    }*/
    }