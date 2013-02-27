/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.CategoriaMaterialAcondicionamiento;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MCategoriaMaterialAcondicionamiento {

    private List<CategoriaMaterialAcondicionamiento> data;
    private org.hibernate.Session hs;
    private CategoriaMaterialAcondicionamiento categoriaMaterialAcondicionamiento;

    public CategoriaMaterialAcondicionamiento getCategoriaMaterialAcondicionamiento() {
        return categoriaMaterialAcondicionamiento;
    }

    public void setCategoriaMaterialAcondicionamiento(CategoriaMaterialAcondicionamiento categoriaMaterialAcondicionamiento) {
        this.categoriaMaterialAcondicionamiento = categoriaMaterialAcondicionamiento;
    }
    
    public MCategoriaMaterialAcondicionamiento(Session session) {
        this.hs = session.getSession();
    }
    
    public CategoriaMaterialAcondicionamiento newCategoriaMaterialAcondicionamiento() {
        return new CategoriaMaterialAcondicionamiento();
    }

    public List<CategoriaMaterialAcondicionamiento> newCategoriaMaterialAcondicionamientoList() {
        return new ArrayList<CategoriaMaterialAcondicionamiento>();
    }

    public boolean insert(CategoriaMaterialAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(CategoriaMaterialAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(CategoriaMaterialAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<CategoriaMaterialAcondicionamiento> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(CategoriaMaterialAcondicionamiento.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
