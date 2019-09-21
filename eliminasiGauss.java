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
                if (!a.kolom(stateEselon,i)) {
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
