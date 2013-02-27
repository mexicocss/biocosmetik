/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.CategoriaMateriaPrima;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MCategoriaMateriaPrima {

    private List<CategoriaMateriaPrima> data;
    private org.hibernate.Session hs;
    private CategoriaMateriaPrima categoriaMateriaPrima;

    public CategoriaMateriaPrima getCategoriaMateriaPrima() {
        return categoriaMateriaPrima;
    }

    public void setCategoriaMateriaPrima(CategoriaMateriaPrima categoriaMateriaPrima) {
        this.categoriaMateriaPrima = categoriaMateriaPrima;
    }
    
    public MCategoriaMateriaPrima(Session session) {
        this.hs = session.getSession();
    }
    
    public CategoriaMateriaPrima newCategoriaMateriaPrima() {
        return new CategoriaMateriaPrima();
    }

    public List<CategoriaMateriaPrima> newCategoriaMateriaPrimaList() {
        return new ArrayList<CategoriaMateriaPrima>();
    }

    public boolean insert(CategoriaMateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(CategoriaMateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(CategoriaMateriaPrima obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<CategoriaMateriaPrima> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(CategoriaMateriaPrima.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
