/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.StatusInventario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MStatusInventario {

    private List<StatusInventario> data;
    private org.hibernate.Session hs;
    private StatusInventario statusInventario;

    public StatusInventario getStatusInventario() {
        return statusInventario;
    }

    public void setStatusInventario(StatusInventario statusInventario) {
        this.statusInventario = statusInventario;
    }
    
    public MStatusInventario(Session session) {
        this.hs = session.getSession();
    }
    
    public StatusInventario newStatusInventario() {
        return new StatusInventario();
    }

    public List<StatusInventario> newStatusInventarioList() {
        return new ArrayList<StatusInventario>();
    }

    public boolean insert(StatusInventario obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(StatusInventario obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(StatusInventario obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<StatusInventario> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(StatusInventario.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
