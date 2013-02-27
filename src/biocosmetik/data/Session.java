/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data;

/**
 *
 * @author 43699891
 */
public class Session {

    private org.hibernate.Session session;

    public org.hibernate.Session getSession() {
        return session;
    }

    public void setSession(org.hibernate.Session session) {
        this.session = session;
    }

    public Session() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void close() {
        this.session.clear();
        this.session.flush();
        this.session.disconnect();
        this.session.close();
    }
}
