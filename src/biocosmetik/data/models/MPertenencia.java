/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Pertenencia;
import biocosmetik.data.objects.Pertenencia;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MPertenencia {

    private List<Pertenencia> data;
    private org.hibernate.Session hs;
    private Pertenencia pertenencia;

    public Pertenencia getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(Pertenencia pertenencia) {
        this.pertenencia = pertenencia;
    }
    
    public MPertenencia(Session session) {
        this.hs = session.getSession();
    }
    
    public Pertenencia newPertenencia() {
        return new Pertenencia();
    }

    public List<Pertenencia> newPertenenciaList() {
        return new ArrayList<Pertenencia>();
    }

    public boolean insert(Pertenencia obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(Pertenencia obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Pertenencia obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Pertenencia> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Pertenencia.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
