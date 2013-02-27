/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.LineaProductos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MLineaProductos {

    private List<LineaProductos> data;
    private org.hibernate.Session hs;
    private LineaProductos lineaProducto;

    public LineaProductos getLineaProducto() {
        return lineaProducto;
    }

    public void setLineaProducto(LineaProductos lineaProducto) {
        this.lineaProducto = lineaProducto;
    }
    
    public MLineaProductos(Session session) {
        this.hs = session.getSession();
    }
    
     public LineaProductos newLineaProducto() {
        return new LineaProductos();
    }

    public List<LineaProductos> newLineaProductosList() {
        return new ArrayList<LineaProductos>();
    }

    public boolean insert(LineaProductos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(LineaProductos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(LineaProductos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<LineaProductos> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(LineaProductos.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
