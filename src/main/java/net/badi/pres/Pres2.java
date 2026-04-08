package net.badi.pres;

import net.badi.dao.IDAO;
import net.badi.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[] args) throws Exception{

            Scanner scanner =new Scanner(new File("config.txt"));
            String DAOClassName =scanner .nextLine();
            Class cDAO= Class.forName(DAOClassName);
            IDAO d=(IDAO) cDAO.newInstance();


        String MetierClassName =scanner.nextLine();
        Class cMetier= Class.forName(MetierClassName);
       IMetier metier= (IMetier) cMetier.getConstructor(IDAO.class).newInstance(d);
       // IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
       // Method setDao = cMetier.getDeclaredMethod("setDao",IDAO.class);
        //setDao.invoke(metier,d);

        System.out.println("RES=" +metier.calcul());









    }
}
