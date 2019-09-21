public class cramer {
	public static matriks cramy(matriks a,int c) {
	matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(a.getKolom()-1);
        temp.setMatriks();
      	for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom()-1; j++) {
                if (c==j){
                    temp.setElmt(i, j, a.getELmt(i, a.getKolom()-1));
                }
                else {
                    temp.setElmt(i, j, a.getELmt(i, j));
                }
            }
        }
        return temp;
    }
    public static matriks ori(matriks a){
    	matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(a.getKolom()-1);
        temp.setMatriks();
      	for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom()-1; j++) {
                    temp.setElmt(i, j, a.getELmt(i, j));
                }
             }
        return temp;
    }
    
    public static double como (matriks a,matriks b){
    	return (kofaktor.detK(a))/(kofaktor.detK(b));
   	 }
   	 public static matriks result(matriks a){
   	 	matriks temp = new matriks();
        temp.setBaris(1);
        temp.setKolom(a.getKolom());
        temp.setMatriks();
        	for (int j = 0; j < a.getKolom(); j++) {
        		for(int c=0; c<a.getKolom();c++){
        		temp.setElmt(0, j, como(cramy(a,c),ori(a)));
        	}
   		}
   		return temp;
   	}

 }
