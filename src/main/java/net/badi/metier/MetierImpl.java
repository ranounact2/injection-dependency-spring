package net.badi.metier;

import net.badi.dao.DAOImpl;
import net.badi.dao.IDAO;
import net.badi.ext.DAOImplV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier  {
    @Autowired
    @Qualifier("d")
    private IDAO dao; // couplage faible





    public MetierImpl(IDAO dao) {
        this.dao=dao;
    }


   public MetierImpl(){
   }

    /**
    * pour injecter dans l'attribut dao
            * un objet d'une classe qui implemente l'interface
   */
    @Override
    public double calcul() {
       double t = dao.getData();
       double res = t *12 *Math.PI/2 *Math.cos(t);
       return res;
    }

    /**
     * pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente l'interface
     *au moment de instantiation
     *
     */
    public void setDao(IDAO dao) {
       this.dao=dao;
    }
}
