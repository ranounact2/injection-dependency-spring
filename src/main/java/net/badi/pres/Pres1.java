package net.badi.pres;

import net.badi.dao.DAOImpl;
import net.badi.ext.DAOImplV2;
import net.badi.metier.MetierImpl;


public class Pres1 {
    public static void main(String[] args) {
        DAOImplV2 d = new DAOImplV2();
        MetierImpl metier = new MetierImpl(d);
        /* metier.setDao(d);//injection via le setters */
        System.out. println("RES= " + metier.calcul());

    }
}
