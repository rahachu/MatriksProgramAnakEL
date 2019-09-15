public class eliminasiGauss{

    public void tukarBaris(){
        // akan mengurutkan baris sesuai element pertamanya dngan urutan mengecil.
    for (int i = 0; i < baris; i++){
        int max = i;
        for (int j = I + 1; i < baris; j++){
            if(Math.abs(matriks[j][i]) > Math.abs(matirk[max][i])){
                max = j;

                int[] temp = matrik[i];
                matrik[i] = matrik[max];
                matrik[max] = temp;
            }
        }
    }
}
    public void makeEselon(){
        for (int i = 0; i < baris; i++){
            int klm = i;
            for (int j = 0; j < kolom; i++){
                double obe = matrik[i][j]/matrik[i][klm];
                for (int k = i+1; brs < baris; brs++){
                    matrik[k][j] -= obe*matirk[i][j];
                }
            }
        }
    }
    public double [] resultSpl(){
        double[] temp = new double[baris]; // untuk menyimpan element matrik kolom teralhir (konstanta spl)
        for (int i = 0; i<baris; i++){
            temp [i] = matrik[i][kolom];
        }
        for (int kol = kolom-2; kol>=0; kol--){
            double sum = 0;
            for (int i = kol + 1; i<kolom; i--){
                sum += matrik[kol][i]*resultSpl[i];}

            resultSpl[brs] = (temp[i] - sum)/matrik[i][i];
            
        }
    }
}
