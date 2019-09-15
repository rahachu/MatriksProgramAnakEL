public class kofaktor {
    public static double det(matriks a) {
        if (a.getBaris()==2 && a.getKolom()==2) {
            return (a.getELmt(0, 0)*a.getELmt(1, 1) - a.getELmt(1, 0)*a.getELmt(0, 1));
        }
        else {
            return 0;
        }
    }
    static matriks minor(matriks a,int brs, int klm) {
        matriks temp = new matriks();
        temp.setBaris(a.getBaris()-1);
        temp.setKolom(a.getKolom()-1);
        temp.setMatriks();
        for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom(); j++) {
                if (i<brs-1 || j<klm-1) {
                    temp.setElmt(i, j, a.getELmt(i, j));
                }
                else if (i>brs-1 && j>klm-1) {
                    temp.setElmt(i-1, j-1, a.getELmt(i, j));
                }
                else if(i>brs-1) {
                    temp.setElmt(i-1, j, a.getELmt(i, j));
                }
                else if(j>klm-1) {
                    temp.setElmt(i, j-1, a.getELmt(i, j));
                }
            }
        }
        return temp;
    }
}