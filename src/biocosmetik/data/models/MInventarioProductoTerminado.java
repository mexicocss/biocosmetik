/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.InventarioProductoTerminado;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MInventarioProductoTerminado {

    private List<InventarioProductoTerminado> data;
    private org.hibernate.Session hs;
    private InventarioProductoTerminado inventarioProductoTerminado;

    public InventarioProductoTerminado getInventarioProductoTerminado() {
        return inventarioProductoTerminado;
    }

    public void setInventarioProductoTerminado(InventarioProductoTerminado inventarioProductoTerminado) {
        this.inventarioProductoTerminado = inventarioProductoTerminado;
    }
    
    public MInventarioProductoTerminado(Session session) {
        this.hs = session.getSession();
    }
    
    public InventarioProductoTerminado newInventarioProductoTerminado() {
        return new InventarioProductoTerminado();
    }

    public List<InventarioProductoTerminado> newInventarioProductoTerminadoList() {
        return new ArrayList<InventarioProductoTerminado>();
    }

    public boolean save(InventarioProductoTerminado obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(InventarioProductoTerminado obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<InventarioProductoTerminado> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(InventarioProductoTerminado.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
