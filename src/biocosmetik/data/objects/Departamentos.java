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
 * Departamentos generated by hbm2java
 */
@Entity
@Table(name="departamentos"
    ,catalog="biocosmetik"
)
public class Departamentos  implements java.io.Serializable {


     private Integer id;
     private String departamento;
     private Set<Empleados> empleadoses = new HashSet<Empleados>(0);

    public Departamentos() {
    }

    public Departamentos(String departamento, Set<Empleados> empleadoses) {
       this.departamento = departamento;
       this.empleadoses = empleadoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="departamento", length=45)
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="departamentos")
    public Set<Empleados> getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set<Empleados> empleadoses) {
        this.empleadoses = empleadoses;
    }




}


