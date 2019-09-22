public class kofaktor {
    static double matriks(matriks a,int brs, int klm) {
        return detK(minor(a,brs,klm));
    }

    static double detK(matriks a) {
        if (a.getBaris()==2 && a.getKolom()==2) {
            return (a.getELmt(0, 0)*a.getELmt(1, 1) - a.getELmt(1, 0)*a.getELmt(0, 1));
        }
        else if (a.getBaris()==1 && a.getKolom()==1) {
            return a.getELmt(0,0);
        }
        else {
            int result;
            result=0;
            for (int i = 0; i < a.getKolom(); i++) {
                result += a.getELmt(0, i)*Math.pow(-1, i) * detK(minor(a, 0, i));
            }
            return result;
        }
    }

    static matriks minor(matriks a,int brs, int klm) {
        //mengembalikan matriks berupa minor
        matriks temp = new matriks();
        temp.setBaris(a.getBaris()-1);
        temp.setKolom(a.getKolom()-1);
        temp.setMatriks();
        for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom(); j++) {
                if (i<brs && j<klm) {
                    temp.setElmt(i, j, a.getELmt(i, j));
                }
                else if (i>brs && j>klm) {
                    temp.setElmt(i-1, j-1, a.getELmt(i, j));
                }
                else if(j>klm && i!=brs) {
                    temp.setElmt(i, j-1, a.getELmt(i, j));
                }
                else if(i>brs && j!=klm) {
                    temp.setElmt(i-1, j, a.getELmt(i, j));
                }
            }
        }
        return temp;
    }
    static matriks coffactor(matriks a){
        //mengembalikan matriks berupa kofaktor
        matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(a.getKolom());
        temp.setMatriks();
        for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom(); j++){
                temp.setElmt(i,j, Math.pow(-1,i+j)*detK(minor(a,i,j)));
            }
        }
        return temp;
    }
    static matriks adjoint(matriks a){
        //mengembalikan tranpose dari kofaktor
        matriks temp = new matriks();
        matriks result = new matriks();
        temp = coffactor(a);
        result = temp.tranpos();
        return result;
    }
    static matriks invers(matriks a){
        //mengembalikan matriks yang berisi pembagian adjoint dengan determinan
        matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(a.getKolom());
        temp.setMatriks();
        for (int i = 0; i < a.getBaris(); i++) {
            for (int j = 0; j < a.getKolom(); j++){
                temp.setElmt(i,j, (adjoint(a).getELmt(i,j)/detK(a)));
            }
        }
        return temp;
    }
    static matriks inverspl(matriks a){
        //mengembalikan matriks berupa jawaban dari spl dengan cara invers
        matriks temp = new matriks();
        temp.setBaris(a.getBaris());
        temp.setKolom(1);
        temp.setMatriks();
        for (int i = 0; i < a.getBaris(); i++) {
                temp.setElmt(i,0, (a.getELmt(i,a.getKolom()-1)));
            }
    return(matriks.kali(invers(cramer.ori(a)),temp));
    }
}