public class solusiSPL{
    private static final double epsilon = 1e-8;
    
    static double[] getCopyKolomY(matriks a){
        double[] kolomY = new double[a.getBaris()];
        for(int i = 0; i < a.getBaris(); i++){
            kolomY[i] = a.getELmt(i, a.getKolom()-1);
        }
        return kolomY;

    }
    static void solusiUnikGauss(matriks a){
        double sum;
        double [] kolomY = getCopyKolomY(a);
        double[] result = new double[a.getKolom()];
        for(int i = 0; i < a.getKolom(); i++){
            for(int j = a.getBaris() -1; j>= 0; j++){

            }

        }
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
    public void solusiBanyak(){

    }

    public void solusiTidakAda(){

    }
}