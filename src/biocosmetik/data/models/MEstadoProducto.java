/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.EstadoProducto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MEstadoProducto {

    private List<EstadoProducto> data;
    private org.hibernate.Session hs;
    private EstadoProducto estadoProducto;

    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
    
    public MEstadoProducto(Session session) {
        this.hs = session.getSession();
    }
    
     public EstadoProducto newLineaProducto() {
        return new EstadoProducto();
    }

    public List<EstadoProducto> newEstadoProductoList() {
        return new ArrayList<EstadoProducto>();
    }

    public boolean insert(EstadoProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(EstadoProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(EstadoProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<EstadoProducto> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(EstadoProducto.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
