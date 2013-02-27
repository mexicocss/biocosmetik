/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.MaterialesAcondicionamiento;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MMaterialesAcondicionamiento {

    private List<MaterialesAcondicionamiento> data;
    private org.hibernate.Session hs;
    private MaterialesAcondicionamiento materialAcondicionamiento;

    public MaterialesAcondicionamiento getMaterialesAcondicionamiento() {
        return materialAcondicionamiento;
    }

    public void setMaterialesAcondicionamiento(MaterialesAcondicionamiento materialAcondicionamiento) {
        this.materialAcondicionamiento = materialAcondicionamiento;
    }
    
    public MMaterialesAcondicionamiento(Session session) {
        this.hs = session.getSession();
    }
    
    public MaterialesAcondicionamiento newMaterialesAcondicionamiento() {
        return new MaterialesAcondicionamiento();
    }

    public List<MaterialesAcondicionamiento> newMaterialesAcondicionamientoList() {
        return new ArrayList<MaterialesAcondicionamiento>();
    }

    public boolean insert(MaterialesAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(MaterialesAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.saveOrUpdate(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(MaterialesAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<MaterialesAcondicionamiento> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(MaterialesAcondicionamiento.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
