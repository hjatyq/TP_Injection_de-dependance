package ma.enset.Pres;

import ma.enset.Dao.DaoImpl;
import ma.enset.Main;
import ma.enset.Metier.IMetier;
import ma.enset.Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl(); // couplage fort
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);//injection de dependance
        System.out.println("Resultat :"+metier.calcul());
    }
}
