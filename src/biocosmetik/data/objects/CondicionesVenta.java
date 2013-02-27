package biocosmetik.data.objects;
// Generated 26-ene-2013 15:51:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CondicionesVenta generated by hbm2java
 */
@Entity
@Table(name="condiciones_venta"
    ,catalog="biocosmetik"
)
public class CondicionesVenta  implements java.io.Serializable {


     private Integer id;
     private String condicionesVenta;
     private Set<Pedidos> pedidoses = new HashSet<Pedidos>(0);

    public CondicionesVenta() {
    }

    public CondicionesVenta(String condicionesVenta, Set<Pedidos> pedidoses) {
       this.condicionesVenta = condicionesVenta;
       this.pedidoses = pedidoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="condiciones_venta", length=45)
    public String getCondicionesVenta() {
        return this.condicionesVenta;
    }
    
    public void setCondicionesVenta(String condicionesVenta) {
        this.condicionesVenta = condicionesVenta;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="condicionesVenta")
    public Set<Pedidos> getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set<Pedidos> pedidoses) {
        this.pedidoses = pedidoses;
    }




}


