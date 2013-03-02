/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.InventarioMaterialesAcondicionamiento;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MInventarioMaterialesAcondicionamiento {

    private List<InventarioMaterialesAcondicionamiento> data;
    private org.hibernate.Session hs;
    private InventarioMaterialesAcondicionamiento inventarioMaterialesAcondicionamiento;

    public InventarioMaterialesAcondicionamiento getInventarioMaterialesAcondicionamiento() {
        return inventarioMaterialesAcondicionamiento;
    }

    public void setInventarioMaterialesAcondicionamiento(InventarioMaterialesAcondicionamiento inventarioMaterialesAcondicionamiento) {
        this.inventarioMaterialesAcondicionamiento = inventarioMaterialesAcondicionamiento;
    }
    
    public MInventarioMaterialesAcondicionamiento(Session session) {
        this.hs = session.getSession();
    }
    
    public InventarioMaterialesAcondicionamiento newInventarioMaterialesAcondicionamiento() {
        return new InventarioMaterialesAcondicionamiento();
    }

    public List<InventarioMaterialesAcondicionamiento> newInventarioMaterialesAcondicionamientoList() {
        return new ArrayList<InventarioMaterialesAcondicionamiento>();
    }

    public boolean save(InventarioMaterialesAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(InventarioMaterialesAcondicionamiento obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<InventarioMaterialesAcondicionamiento> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(InventarioMaterialesAcondicionamiento.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
