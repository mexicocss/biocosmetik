/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.CategoriaProducto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MCategoriaProducto {

    private List<CategoriaProducto> data;
    private org.hibernate.Session hs;
    private CategoriaProducto categoriaProducto;

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
    
    public MCategoriaProducto(Session session) {
        this.hs = session.getSession();
    }
    
    public CategoriaProducto newCategoriaProducto() {
        return new CategoriaProducto();
    }

    public List<CategoriaProducto> newCategoriaProductoList() {
        return new ArrayList<CategoriaProducto>();
    }

    public boolean insert(CategoriaProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(CategoriaProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(CategoriaProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<CategoriaProducto> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(CategoriaProducto.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
