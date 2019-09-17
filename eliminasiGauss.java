public class eliminasiGauss{

    public static void tukarBaris(matriks a){
        // akan mengurutkan baris sesuai element pertamanya dngan urutan mengecil.
    for (int i = 0; i < a.getBaris(); i++){
        int max = i;
        for (int j = i + 1; i < a.getBaris(); j++){
            if(Math.abs(a.getELmt(j,i)) > Math.abs(a.getElmt(max,i))){
                max = j;

                double[] temp =a.getElmtBaris(i) ;
                a.setBaris(i,a.getElmtBaris(max));
                a.setBaris(max, temp);
                
                
            }
        }
    }
}
    public void makeEselon(matriks a){
        for (int i = 0; i < a.getBaris(); i++){
            int klm = i;
            for (int j = 0; j < a.getKolom(); j++){
                double obe = a.getELmt(i, j)/a.getElmt(i,klm);
                for (int brs= i+1; brs< a.getBaris(); brs++){
                    setElmt(brs,j,(a.getElmt(brs,j) - obe*a.getElmt(i,j)));
                }
            }
        }
    }
    public void resultSpl(matriks a){
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
    }
}
