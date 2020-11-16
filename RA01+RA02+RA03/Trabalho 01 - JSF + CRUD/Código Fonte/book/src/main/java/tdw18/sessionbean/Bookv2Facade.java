/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdw18.sessionbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tdw18.entities.Bookv2;

/**
 *
 * @author ocimi
 */
@Stateless
public class Bookv2Facade extends AbstractFacade<Bookv2> implements Bookv2FacadeLocal {

    @PersistenceContext(unitName = "tdw18_book_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Bookv2Facade() {
        super(Bookv2.class);
    }
    
}
