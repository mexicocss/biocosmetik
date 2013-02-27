/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.TipoEntradaInventario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MTipoEntradaInventario {

    private List<TipoEntradaInventario> data;
    private org.hibernate.Session hs;
    private TipoEntradaInventario tipoEntradaInventario;

    public TipoEntradaInventario getTipoEntradaInventario() {
        return tipoEntradaInventario;
    }

    public void setTipoEntradaInventario(TipoEntradaInventario tipoEntradaInventario) {
        this.tipoEntradaInventario = tipoEntradaInventario;
    }
    
    public MTipoEntradaInventario(Session session) {
        this.hs = session.getSession();
    }
    
    public TipoEntradaInventario newTipoEntradaInventario() {
        return new TipoEntradaInventario();
    }

    public List<TipoEntradaInventario> newTipoEntradaInventarioList() {
        return new ArrayList<TipoEntradaInventario>();
    }

    public boolean insert(TipoEntradaInventario obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(TipoEntradaInventario obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(TipoEntradaInventario obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<TipoEntradaInventario> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(TipoEntradaInventario.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
