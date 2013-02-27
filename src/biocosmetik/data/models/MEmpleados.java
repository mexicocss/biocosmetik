/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik.data.models;

import biocosmetik.data.Session;
import biocosmetik.data.objects.Empleados;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author 43699891
 */
public class MEmpleados {

    private List<Empleados> data;
    private org.hibernate.Session hs;
    private Empleados empleado;

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public MEmpleados(Session session) {
        this.hs = session.getSession();
    }

    private void executeHQLQuery(String hql) {
        try {
            this.hs.beginTransaction();
            Query q = this.hs.createQuery(hql);
            this.hs.createCriteria(Empleados.class);
            this.hs.getTransaction().commit();
            this.data = q.list();
        } catch (HibernateException he) {
        }
    }

    public Empleados newEmpleado() {
        return new Empleados();
    }

    public List<Empleados> newEmpleadosList() {
        return new ArrayList<Empleados>();
    }

    public boolean insert(Empleados obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.save(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean edit(Empleados obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.update(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public boolean remove(Empleados obj) {
        if (this.hs.isOpen() && this.hs.isConnected()) {
            Transaction tx = this.hs.beginTransaction();
            this.hs.delete(obj);
            tx.commit();
            return true;
        }
        return false;
    }

    public List<Empleados> getList() {
        this.hs.beginTransaction();
        Criteria criteria = this.hs.createCriteria(Empleados.class);
        this.data = criteria.list();
        this.hs.getTransaction().commit();
        return this.data;
    }
//    public List<Empleados> getList(Date fechaInicial, Date fechaFinal, Tiendas tienda) {
//        this.hs.beginTransaction();
//        Criteria criteria = this.hs.createCriteria(Ventas.class, "v")
//                .createCriteria("v.usuarios", "u")
//                .createCriteria("v.clientes", "c")
//                .createCriteria("u.tiendas", "t")
//                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
//        criteria.add(Restrictions.between("v.fecha", fechaInicial, fechaFinal));
//        criteria.add(Restrictions.eq("u.tiendas", tienda));
//        return criteria.list();
//    }
//    
//    public List<Ventas> getList(Date fechaInicial, Date fechaFinal, Clientes cliente) {
//        this.hs.beginTransaction();
//        Criteria criteria = this.hs.createCriteria(Ventas.class, "v")
//                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
//        criteria.add(Restrictions.between("v.fecha", fechaInicial, fechaFinal));
//        criteria.add(Restrictions.eq("v.clientes", cliente));
//        return criteria.list();
//    }
//
//    public Ventas getVentaDevolucion(String codigo) throws NumberFormatException {
//        Integer code = Integer.valueOf(codigo);
//        Integer dias_devolucion = 365;
//        try {
//            dias_devolucion = new Configuracion().getDias_devolucion();
//        } catch (IOException ex) {
//            Logger.getLogger(Ventas_model.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Date fecha = new Date();
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(fecha);
//        cal.add(Calendar.DATE, -(dias_devolucion));
//        fecha = cal.getTime();
//        SimpleDateFormat fechaf = new SimpleDateFormat("yyyy/MM/dd");
//        this.executeHQLQuery(QUERY_VENTA_DEVOLUCION.replaceFirst("@CODIGO", code.toString()).replaceFirst("@FECHA", fechaf.format(fecha)));
//        if (this.ListData.size() >= 1) {
//            return this.ListData.get(0);
//        }
//        return null;
//    }
//
//    public BigDecimal sumVentas(Date fechaInicial, Date fechaFinal, Clientes cliente) {
//        SimpleDateFormat fechaf = new SimpleDateFormat("yyyy/MM/dd");
//        return this.executeHQLSUMQuery(fechaInicial, fechaFinal, cliente);
//    }
//
//    public BigDecimal sumVentas(Date fechaInicial, Date fechaFinal, Tiendas tienda) {
//        SimpleDateFormat fechaf = new SimpleDateFormat("yyyy/MM/dd");
//        return this.executeHQLSUMQuery(fechaInicial, fechaFinal, tienda);
//    }
}
