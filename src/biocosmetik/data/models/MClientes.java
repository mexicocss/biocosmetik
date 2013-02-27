/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Clientes;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MClientes {

    private List<Clientes> data;
    private org.hibernate.Session hs;
    private Clientes cliente;

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

   

    public MClientes(Session session) {
        this.hs = session.getSession();
    }
    public Clientes newCliente() {
        return new Clientes();
    }

    public List<Clientes> newClientesList() {
        return new ArrayList<Clientes>();
    }

    public boolean save(Clientes obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Clientes obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Clientes> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Clientes.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
