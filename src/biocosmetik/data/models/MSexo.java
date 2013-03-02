/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Sexo;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 * @author 43699891
 */
public class MSexo {

    private List<Sexo> data;
    private org.hibernate.Session hs;
    private Sexo sexo;

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    public MSexo(Session session) {
        this.hs = session.getSession();
    }

    public List<Sexo> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Sexo.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
}
