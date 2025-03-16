package ma.enset.Dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        return Math.random()*10;
    }
}
