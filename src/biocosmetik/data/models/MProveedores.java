/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Proveedores;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MProveedores {

    private List<Proveedores> data;
    private org.hibernate.Session hs;
    private Proveedores proveedor;

    public Proveedores getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

   

    public MProveedores(Session session) {
        this.hs = session.getSession();
    }
    public Proveedores newProveedor() {
        return new Proveedores();
    }

    public List<Proveedores> newProveedoresList() {
        return new ArrayList<Proveedores>();
    }

    public boolean save(Proveedores obj) throws HibernateException{
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }
    public boolean remove(Proveedores obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Proveedores> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Proveedores.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
