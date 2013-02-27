package biocosmetik.data.objects;
// Generated 26-feb-2013 23:07:31 by Hibernate Tools 3.2.1.GA


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
 * StatusInventario generated by hbm2java
 */
@Entity
@Table(name="status_inventario"
    ,catalog="biocosmetik"
)
public class StatusInventario  implements java.io.Serializable {


     private Integer id;
     private String status;
     private Set<InventarioMateriaPrima> inventarioMateriaPrimas = new HashSet<InventarioMateriaPrima>(0);

    public StatusInventario() {
    }

    public StatusInventario(String status, Set<InventarioMateriaPrima> inventarioMateriaPrimas) {
       this.status = status;
       this.inventarioMateriaPrimas = inventarioMateriaPrimas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="status", length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="statusInventario")
    public Set<InventarioMateriaPrima> getInventarioMateriaPrimas() {
        return this.inventarioMateriaPrimas;
    }
    
    public void setInventarioMateriaPrimas(Set<InventarioMateriaPrima> inventarioMateriaPrimas) {
        this.inventarioMateriaPrimas = inventarioMateriaPrimas;
    }




}


