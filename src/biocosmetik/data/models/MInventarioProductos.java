/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.InventarioProductos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MInventarioProductos {

    private List<InventarioProductos> data;
    private org.hibernate.Session hs;
    private InventarioProductos inventarioProductos;

    public InventarioProductos getInventarioProductos() {
        return inventarioProductos;
    }

    public void setInventarioProductos(InventarioProductos inventarioProductos) {
        this.inventarioProductos = inventarioProductos;
    }
    
    public MInventarioProductos(Session session) {
        this.hs = session.getSession();
    }
    
    public InventarioProductos newInventarioProductos() {
        return new InventarioProductos();
    }

    public List<InventarioProductos> newInventarioProductosList() {
        return new ArrayList<InventarioProductos>();
    }

    public boolean save(InventarioProductos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(InventarioProductos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<InventarioProductos> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(InventarioProductos.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
