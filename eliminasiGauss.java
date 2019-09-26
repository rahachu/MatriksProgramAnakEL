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
        int kk;
        kk=Integer.min(a.getKolom()-1, a.getBaris());
        for (int i = 0; i < kk; i++) {
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

    static matriks buatMatAugmen(matriks a){
    matriks math = new matriks();
    int col = a.getKolom();
    math.setBaris(a.getBaris());
    math.setKolom(col+col);
    math.setMatriks();
    for(int i = 0; i < a.getBaris(); i++){
        for(int j = 0; j< a.getKolom(); j++){
            math.setElmt(i, j, a.getELmt(i, j));
            if(col+i == col+j){
                math.setElmt(i, col+j, 1);
            }
            else if(col+i != col+j){
                math.setElmt(i, col+j, 0);
            }
        }

    }
    return math;
}
static matriks inversGaussJordan(matriks a){
    matriks b = buatMatAugmen(a);
    makeEselonRed(b);
    matriks result = new matriks();
    result.setBaris(a.getBaris());
    result.setKolom(a.getBaris());
    result.setMatriks();
    int count =0;
    for(int i = 0; i < b.getBaris(); i++){
            if(b.getELmt(i,i) == 0){
                count++;
            }
        
    }
    if(count != a.getBaris()){
        int col = a.getBaris();
        for(int i = 0; i<b.getBaris(); i++){
            for(int j = 0; j<b.getBaris();j++){
                result.setElmt(i, j,b.getELmt(i, j+col) );
            }
        }
    }
    return result;
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
