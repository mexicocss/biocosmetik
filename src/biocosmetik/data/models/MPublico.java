/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Publico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MPublico {

    private List<Publico> data;
    private org.hibernate.Session hs;
    private Publico publico;

    public Publico getPublico() {
        return publico;
    }

    public void setPublico(Publico publico) {
        this.publico = publico;
    }
    
    public MPublico(Session session) {
        this.hs = session.getSession();
    }
    
    public Publico newPublico() {
        return new Publico();
    }

    public List<Publico> newPublicoList() {
        return new ArrayList<Publico>();
    }

    public boolean insert(Publico obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(Publico obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Publico obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Publico> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Publico.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
