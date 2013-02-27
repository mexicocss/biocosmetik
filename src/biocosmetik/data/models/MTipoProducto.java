/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.TipoProducto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MTipoProducto {

    private List<TipoProducto> data;
    private org.hibernate.Session hs;
    private TipoProducto tipoProducto;

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    public MTipoProducto(Session session) {
        this.hs = session.getSession();
    }
    
     public TipoProducto newLineaProducto() {
        return new TipoProducto();
    }

    public List<TipoProducto> newTipoProductoList() {
        return new ArrayList<TipoProducto>();
    }

    public boolean insert(TipoProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(TipoProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(TipoProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<TipoProducto> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(TipoProducto.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
