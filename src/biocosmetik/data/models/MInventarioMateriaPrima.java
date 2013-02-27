/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.InventarioMateriaPrima;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MInventarioMateriaPrima {

    private List<InventarioMateriaPrima> data;
    private org.hibernate.Session hs;
    private InventarioMateriaPrima inventarioMateriaPrima;

    public InventarioMateriaPrima getInventarioMateriaPrima() {
        return inventarioMateriaPrima;
    }

    public void setInventarioMateriaPrima(InventarioMateriaPrima inventarioMateriaPrima) {
        this.inventarioMateriaPrima = inventarioMateriaPrima;
    }
    
    public MInventarioMateriaPrima(Session session) {
        this.hs = session.getSession();
    }
    
    public InventarioMateriaPrima newMateriaPrima() {
        return new InventarioMateriaPrima();
    }

    public List<InventarioMateriaPrima> newMateriaPrimaList() {
        return new ArrayList<InventarioMateriaPrima>();
    }

    public boolean insert(InventarioMateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(InventarioMateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.saveOrUpdate(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(InventarioMateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<InventarioMateriaPrima> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(InventarioMateriaPrima.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
