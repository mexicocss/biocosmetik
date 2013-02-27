/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.UnidadMedida;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MUnidadMedida {

    private List<UnidadMedida> data;
    private org.hibernate.Session hs;
    private UnidadMedida unidadMedida;

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    public MUnidadMedida(Session session) {
        this.hs = session.getSession();
    }
    
    public UnidadMedida newUnidadMedida() {
        return new UnidadMedida();
    }

    public List<UnidadMedida> newUnidadMedidaList() {
        return new ArrayList<UnidadMedida>();
    }

    public boolean insert(UnidadMedida obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(UnidadMedida obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(UnidadMedida obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<UnidadMedida> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(UnidadMedida.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
