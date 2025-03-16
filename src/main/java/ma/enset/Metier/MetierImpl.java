package ma.enset.Metier;

import ma.enset.Dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; // couplage faible

    // injection de depandance
    public void setDao(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        return 0;
    }
}
