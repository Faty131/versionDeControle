package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao {

    @Override
    public double getData() {
        System.out.println("Version base de donnés");
        double temp=Math.random()*40;
        return temp;
    }
}
