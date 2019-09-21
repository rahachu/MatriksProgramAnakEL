public class cramer {
	public static matriks cramy(matriks a,int c) {
		//Mengembalikan matriks yang elemen-elemen kolom ke c nya sudah diubah dengan elemen kolom terakhir dan jumlah kolomnya dikurangu
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
    	//Mengembalikan matriks yang sudah dihilangkan kolom terakhirnya
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
    	//Mengembalikan hasil tunggal
    	return (kofaktor.detK(a))/(kofaktor.detK(b));
   	 }
   	 public static matriks result(matriks a){
   	 	//Mengembalikan hasil dalam bentuk matriks
   	 	matriks temp = new matriks();
        temp.setBaris(a.getKolom()-1);
        temp.setKolom(1);
        temp.setMatriks();
        	for (int j = 0; j < a.getKolom()-1; j++) {
        		temp.setElmt(j, 0, como(cramy(a,j),ori(a)));
   		}
   		return temp;
   	}

 }
