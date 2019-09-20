public class cramer {
	public static matriks cramy(matriks a,int c) {
		//Mengembalikan matriks yang elemen-elemen kolom ke c nya sudah diubah dengan elemen kolom terakhir dan jumlah kolomnya dikurangu
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
    public static matriks ori(matriks a){
    	//Mengembalikan matriks yang sudah dihilangkan kolom terakhirnya
    	matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(a.getKolom()-1);
        temp.setMatriks();
      	for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom(); j++) {
                    temp.setElmt(i, j, a.getELmt(i, a.getKolom()));
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
