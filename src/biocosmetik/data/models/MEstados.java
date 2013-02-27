/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Estados;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MEstados {

    private List<Estados> data;
    private org.hibernate.Session hs;
    private Estados estado;

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    public MEstados(Session session) {
        this.hs = session.getSession();
    }

    public List<Estados> newEstadosList() {
        return new ArrayList<Estados>();
    }

    public boolean insert(Estados obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(Estados obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Estados obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Estados> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Estados.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
