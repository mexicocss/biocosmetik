/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.SubcategoriaProducto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MSubcategoriaProducto {

    private List<SubcategoriaProducto> data;
    private org.hibernate.Session hs;
    private SubcategoriaProducto subcategoriaProducto;

    public SubcategoriaProducto getSubcategoriaProducto() {
        return subcategoriaProducto;
    }

    public void setSubcategoriaProducto(SubcategoriaProducto subcategoriaProducto) {
        this.subcategoriaProducto = subcategoriaProducto;
    }
    
    public MSubcategoriaProducto(Session session) {
        this.hs = session.getSession();
    }
    
    public SubcategoriaProducto newSubcategoriaProducto() {
        return new SubcategoriaProducto();
    }

    public List<SubcategoriaProducto> newSubcategoriaProductoList() {
        return new ArrayList<SubcategoriaProducto>();
    }

    public boolean insert(SubcategoriaProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(SubcategoriaProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(SubcategoriaProducto obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<SubcategoriaProducto> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(SubcategoriaProducto.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
