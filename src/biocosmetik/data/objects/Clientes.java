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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clientes generated by hbm2java
 */
@Entity
@Table(name="clientes"
    ,catalog="biocosmetik"
)
public class Clientes  implements java.io.Serializable {


     private Integer id;
     private Estados estados;
     private String razonSocial;
     private String nombreCorto;
     private String rfc;
     private String direccion;
     private String colonia;
     private String delegacion;
     private String codigoPostal;
     private String telefono1;
     private String ext1;
     private String telefono2;
     private String ext2;
     private String fax;
     private String nextel;
     private String idNextel;
     private String celular;
     private String correo1;
     private String correo2;
     private String paginaWeb;
     private String instrucciones;
     private String horarioAtencion;
     private Set<Productos> productoses = new HashSet<Productos>(0);
     private Set<LineaProductos> lineaProductoses = new HashSet<LineaProductos>(0);

    public Clientes() {
    }

	
    public Clientes(Estados estados, String razonSocial, String nombreCorto, String rfc) {
        this.estados = estados;
        this.razonSocial = razonSocial;
        this.nombreCorto = nombreCorto;
        this.rfc = rfc;
    }
    public Clientes(Estados estados, String razonSocial, String nombreCorto, String rfc, String direccion, String colonia, String delegacion, String codigoPostal, String telefono1, String ext1, String telefono2, String ext2, String fax, String nextel, String idNextel, String celular, String correo1, String correo2, String paginaWeb, String instrucciones, String horarioAtencion, Set<Productos> productoses, Set<LineaProductos> lineaProductoses) {
       this.estados = estados;
       this.razonSocial = razonSocial;
       this.nombreCorto = nombreCorto;
       this.rfc = rfc;
       this.direccion = direccion;
       this.colonia = colonia;
       this.delegacion = delegacion;
       this.codigoPostal = codigoPostal;
       this.telefono1 = telefono1;
       this.ext1 = ext1;
       this.telefono2 = telefono2;
       this.ext2 = ext2;
       this.fax = fax;
       this.nextel = nextel;
       this.idNextel = idNextel;
       this.celular = celular;
       this.correo1 = correo1;
       this.correo2 = correo2;
       this.paginaWeb = paginaWeb;
       this.instrucciones = instrucciones;
       this.horarioAtencion = horarioAtencion;
       this.productoses = productoses;
       this.lineaProductoses = lineaProductoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="estado", nullable=false)
    public Estados getEstados() {
        return this.estados;
    }
    
    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    
    @Column(name="razon_social", nullable=false, length=90)
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    @Column(name="nombre_corto", nullable=false, length=90)
    public String getNombreCorto() {
        return this.nombreCorto;
    }
    
    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }
    
    @Column(name="RFC", nullable=false, length=13)
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    @Column(name="direccion", length=65535)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="colonia", length=90)
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
    @Column(name="delegacion", length=45)
    public String getDelegacion() {
        return this.delegacion;
    }
    
    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }
    
    @Column(name="codigo_postal", length=5)
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @Column(name="telefono1", length=10)
    public String getTelefono1() {
        return this.telefono1;
    }
    
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }
    
    @Column(name="ext1", length=3)
    public String getExt1() {
        return this.ext1;
    }
    
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }
    
    @Column(name="telefono2", length=10)
    public String getTelefono2() {
        return this.telefono2;
    }
    
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    @Column(name="ext2", length=3)
    public String getExt2() {
        return this.ext2;
    }
    
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }
    
    @Column(name="fax", length=10)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    @Column(name="nextel", length=10)
    public String getNextel() {
        return this.nextel;
    }
    
    public void setNextel(String nextel) {
        this.nextel = nextel;
    }
    
    @Column(name="id_nextel", length=15)
    public String getIdNextel() {
        return this.idNextel;
    }
    
    public void setIdNextel(String idNextel) {
        this.idNextel = idNextel;
    }
    
    @Column(name="celular", length=12)
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    @Column(name="correo1", length=85)
    public String getCorreo1() {
        return this.correo1;
    }
    
    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }
    
    @Column(name="correo2", length=85)
    public String getCorreo2() {
        return this.correo2;
    }
    
    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }
    
    @Column(name="pagina_web", length=80)
    public String getPaginaWeb() {
        return this.paginaWeb;
    }
    
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    
    @Column(name="instrucciones", length=65535)
    public String getInstrucciones() {
        return this.instrucciones;
    }
    
    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }
    
    @Column(name="horario_atencion", length=90)
    public String getHorarioAtencion() {
        return this.horarioAtencion;
    }
    
    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<LineaProductos> getLineaProductoses() {
        return this.lineaProductoses;
    }
    
    public void setLineaProductoses(Set<LineaProductos> lineaProductoses) {
        this.lineaProductoses = lineaProductoses;
    }




}


