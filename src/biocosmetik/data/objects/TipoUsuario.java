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
 * TipoUsuario generated by hbm2java
 */
@Entity
@Table(name="tipo_usuario"
    ,catalog="biocosmetik"
)
public class TipoUsuario  implements java.io.Serializable {


     private Integer id;
     private String tipo;
     private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

    public TipoUsuario() {
    }

    public TipoUsuario(String tipo, Set<Usuarios> usuarioses) {
       this.tipo = tipo;
       this.usuarioses = usuarioses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="tipo", length=45)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoUsuario")
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }




}

