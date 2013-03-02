/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.ProductoTerminado;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MProductoTerminado {

    private List<ProductoTerminado> data;
    private org.hibernate.Session hs;
    private ProductoTerminado productoTerminado;
   

    public ProductoTerminado getProductoTerminado() {
        return productoTerminado;
    }

    public void setProductoTerminado(ProductoTerminado productoTerminado) {
        this.productoTerminado = productoTerminado;
    }
    
    public MProductoTerminado(Session session) {
        this.hs = session.getSession();
    }

    public List<ProductoTerminado> newProductoTerminadoList() {
        return new ArrayList<ProductoTerminado>();
    }

    public boolean save(ProductoTerminado obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(ProductoTerminado obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<ProductoTerminado> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(ProductoTerminado.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }

    public ProductoTerminado newProductoTerminado() {
        return new ProductoTerminado();
    }
}
