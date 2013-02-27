/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Clasificacion;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MClasificacion {

    private List<Clasificacion> data;
    private org.hibernate.Session hs;
    private Clasificacion clasificacion;

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    public MClasificacion(Session session) {
        this.hs = session.getSession();
    }

    public List<Clasificacion> newClasificacionList() {
        return new ArrayList<Clasificacion>();
    }

    public boolean insert(Clasificacion obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(Clasificacion obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Clasificacion obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Clasificacion> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Clasificacion.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
