/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Productos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MProductos {

    private List<Productos> data;
    private org.hibernate.Session hs;
    private Productos productos;

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    
    public MProductos(Session session) {
        this.hs = session.getSession();
    }
    
    public Productos newProductos() {
        return new Productos();
    }

    public List<Productos> newProductosList() {
        return new ArrayList<Productos>();
    }

    public boolean insert(Productos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(Productos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Productos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Productos> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Productos.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
