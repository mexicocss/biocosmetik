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
 * Publico generated by hbm2java
 */
@Entity
@Table(name="publico"
    ,catalog="biocosmetik"
)
public class Publico  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private char abreviatura;
     private Set<Productos> productoses = new HashSet<Productos>(0);

    public Publico() {
    }

	
    public Publico(String nombre, char abreviatura) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }
    public Publico(String nombre, char abreviatura, Set<Productos> productoses) {
       this.nombre = nombre;
       this.abreviatura = abreviatura;
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
    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="abreviatura", nullable=false, length=1)
    public char getAbreviatura() {
        return this.abreviatura;
    }
    
    public void setAbreviatura(char abreviatura) {
        this.abreviatura = abreviatura;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="publico")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }




}


