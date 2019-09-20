public class cramer {
	public static matriks cramy(matriks a,int c) {
	matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(a.getKolom()-1);
        temp.setMatriks();
      	for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom(); j++) {
                if (c==j){
                    temp.setElmt(i, j, a.getELmt(i, a.getKolom()));
                }
                else {
                    temp.setElmt(i, j, a.getELmt(i, j));
                }
            }
        }
        return temp;
    }
    public static double como (matriks a,matriks b){
    	return (kofaktor.detK(a))/(kofaktor.detK(b));
   	 }

 }
