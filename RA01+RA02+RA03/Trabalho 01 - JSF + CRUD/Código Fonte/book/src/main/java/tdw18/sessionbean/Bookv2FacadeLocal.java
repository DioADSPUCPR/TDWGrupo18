/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdw18.sessionbean;

import java.util.List;
import javax.ejb.Local;
import tdw18.entities.Bookv2;

/**
 *
 * @author ocimi
 */
@Local
public interface Bookv2FacadeLocal {

    void create(Bookv2 bookv2);

    void edit(Bookv2 bookv2);

    void remove(Bookv2 bookv2);

    Bookv2 find(Object id);

    List<Bookv2> findAll();

    List<Bookv2> findRange(int[] range);

    int count();
    
}
