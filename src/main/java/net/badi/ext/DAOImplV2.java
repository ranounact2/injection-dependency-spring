package net.badi.ext;

import net.badi.dao.IDAO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d2")
public class DAOImplV2 implements IDAO {
    @Override
    public double getData(){
        System.out.println("version capteurs.....");
        double t=12;
        return t;
    }
}
