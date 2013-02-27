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
 * SubcategoriaProducto generated by hbm2java
 */
@Entity
@Table(name="subcategoria_producto"
    ,catalog="biocosmetik"
)
public class SubcategoriaProducto  implements java.io.Serializable {


     private Integer id;
     private String nombreSubcategoria;
     private String descripcionSubcategoria;
     private Set<Productos> productoses = new HashSet<Productos>(0);

    public SubcategoriaProducto() {
    }

	
    public SubcategoriaProducto(String nombreSubcategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
    }
    public SubcategoriaProducto(String nombreSubcategoria, String descripcionSubcategoria, Set<Productos> productoses) {
       this.nombreSubcategoria = nombreSubcategoria;
       this.descripcionSubcategoria = descripcionSubcategoria;
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
    
    @Column(name="nombre_subcategoria", nullable=false, length=45)
    public String getNombreSubcategoria() {
        return this.nombreSubcategoria;
    }
    
    public void setNombreSubcategoria(String nombreSubcategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
    }
    
    @Column(name="descripcion_subcategoria", length=90)
    public String getDescripcionSubcategoria() {
        return this.descripcionSubcategoria;
    }
    
    public void setDescripcionSubcategoria(String descripcionSubcategoria) {
        this.descripcionSubcategoria = descripcionSubcategoria;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="subcategoriaProducto")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }




}


