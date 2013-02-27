/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Departamentos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MDepartamentos {

    private List<Departamentos> data;
    private org.hibernate.Session hs;
    private Departamentos departamento;

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public MDepartamentos(Session session) {
        this.hs = session.getSession();
    }
    public Departamentos newDepartamento() {
        return new Departamentos();
    }

    public List<Departamentos> newDepartamentosList() {
        return new ArrayList<Departamentos>();
    }

    public boolean insert(Departamentos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(Departamentos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Departamentos obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Departamentos> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Departamentos.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
