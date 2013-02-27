/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.MateriaPrima;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MMateriaPrima {

    private List<MateriaPrima> data;
    private org.hibernate.Session hs;
    private MateriaPrima materiaPrima;

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
    
    public MMateriaPrima(Session session) {
        this.hs = session.getSession();
    }
    
    public MateriaPrima newMateriaPrima() {
        return new MateriaPrima();
    }

    public List<MateriaPrima> newMateriaPrimaList() {
        return new ArrayList<MateriaPrima>();
    }

    public boolean insert(MateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(MateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.saveOrUpdate(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(MateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<MateriaPrima> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(MateriaPrima.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
