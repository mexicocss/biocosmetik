package biocosmetik.data.objects;
// Generated 28-ene-2013 11:26:33 by Hibernate Tools 3.2.1.GA


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
 * EstadoProducto generated by hbm2java
 */
@Entity
@Table(name="estado_producto"
    ,catalog="biocosmetik"
)
public class EstadoProducto  implements java.io.Serializable {


     private Integer id;
     private String tipoEstado;
     private Set<Productos> productoses = new HashSet<Productos>(0);

    public EstadoProducto() {
    }

	
    public EstadoProducto(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }
    public EstadoProducto(String tipoEstado, Set<Productos> productoses) {
       this.tipoEstado = tipoEstado;
       this.productoses = productoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="tipo_estado", nullable=false, length=45)
    public String getTipoEstado() {
        return this.tipoEstado;
    }
    
    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoProducto")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }




}

