/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.EdicionProducto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MEdicionProducto {

    private List<EdicionProducto> data;
    private org.hibernate.Session hs;
    private EdicionProducto edicionProducto;

    public EdicionProducto getEdicionProducto() {
        return edicionProducto;
    }

    public void setEdicionProducto(EdicionProducto edicionProducto) {
        this.edicionProducto = edicionProducto;
    }
    
    public MEdicionProducto(Session session) {
        this.hs = session.getSession();
    }
    
     public EdicionProducto newLineaProducto() {
        return new EdicionProducto();
    }

    public List<EdicionProducto> newEdicionProductoList() {
        return new ArrayList<EdicionProducto>();
    }

    public boolean insert(EdicionProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(EdicionProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(EdicionProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<EdicionProducto> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(EdicionProducto.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
