package net.badi.dao;

import org.springframework.stereotype.Repository;

@Repository("d")
public class DAOImpl  implements IDAO {

    @Override
    public double getData() {
        System.out.println("version base de données");
        double t=34;
        return t;
    }
}
