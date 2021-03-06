package biocosmetik.data.objects;
// Generated 29-ene-2013 12:16:42 by Hibernate Tools 3.2.1.GA


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
 * UnidadMedida generated by hbm2java
 */
@Entity
@Table(name="unidad_medida"
    ,catalog="biocosmetik"
)
public class UnidadMedida  implements java.io.Serializable {


     private Integer id;
     private String nomenclatura;
     private String unidad;
     private Set<MateriaPrima> materiaPrimas = new HashSet<MateriaPrima>(0);

    public UnidadMedida() {
    }

	
    public UnidadMedida(String nomenclatura, String unidad) {
        this.nomenclatura = nomenclatura;
        this.unidad = unidad;
    }
    public UnidadMedida(String nomenclatura, String unidad, Set<MateriaPrima> materiaPrimas) {
       this.nomenclatura = nomenclatura;
       this.unidad = unidad;
       this.materiaPrimas = materiaPrimas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="nomenclatura", nullable=false, length=45)
    public String getNomenclatura() {
        return this.nomenclatura;
    }
    
    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }
    
    @Column(name="unidad", nullable=false, length=45)
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="unidadMedida")
    public Set<MateriaPrima> getMateriaPrimas() {
        return this.materiaPrimas;
    }
    
    public void setMateriaPrimas(Set<MateriaPrima> materiaPrimas) {
        this.materiaPrimas = materiaPrimas;
    }




}


