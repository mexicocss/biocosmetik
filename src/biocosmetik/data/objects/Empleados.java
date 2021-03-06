package biocosmetik.data.objects;
// Generated 26-ene-2013 15:51:06 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Empleados generated by hbm2java
 */
@Entity
@Table(name="empleados"
    ,catalog="biocosmetik"
)
public class Empleados  implements java.io.Serializable {


     private Integer id;
     private Departamentos departamentos;
     private Estados estados;
     private boolean activo;
     private String numero;
     private String nombre;
     private String direccion;
     private String colonia;
     private String ciudad;
     private String codigoPostal;
     private String telefono;
     private String celular;
     private String correo;
     private String nss;
     private String region;
     private Date fechaIngreso;
     private Date fechaNacimiento;
     private BigDecimal salario;
     private String coyuge;
     private String contacto;
     private String telefonoContacto;
     private String cargo;
     private String nota;
     private byte[] fotografia;
     private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);
     private Set<Pedidos> pedidoses = new HashSet<Pedidos>(0);

    public Empleados() {
    }

	
    public Empleados(Departamentos departamentos, Estados estados) {
        this.departamentos = departamentos;
        this.estados = estados;
    }
    public Empleados(Departamentos departamentos, Estados estados, boolean activo, String numero, String nombre, String direccion, String colonia, String ciudad, String codigoPostal, String telefono, String celular, String correo, String nss, String region, Date fechaIngreso, Date fechaNacimiento, BigDecimal salario, String coyuge, String contacto, String telefonoContacto, String cargo, String nota, byte[] fotografia, Set<Usuarios> usuarioses, Set<Pedidos> pedidoses) {
       this.departamentos = departamentos;
       this.estados = estados;
       this.activo = activo;
       this.numero = numero;
       this.nombre = nombre;
       this.direccion = direccion;
       this.colonia = colonia;
       this.ciudad = ciudad;
       this.codigoPostal = codigoPostal;
       this.telefono = telefono;
       this.celular = celular;
       this.correo = correo;
       this.nss = nss;
       this.region = region;
       this.fechaIngreso = fechaIngreso;
       this.fechaNacimiento = fechaNacimiento;
       this.salario = salario;
       this.coyuge = coyuge;
       this.contacto = contacto;
       this.telefonoContacto = telefonoContacto;
       this.cargo = cargo;
       this.nota = nota;
       this.fotografia = fotografia;
       this.usuarioses = usuarioses;
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
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="departamento", nullable=false)
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="estado", nullable=false)
    public Estados getEstados() {
        return this.estados;
    }
    
    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    
    @Column(name="activo")
    public boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    @Column(name="numero", length=15)
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Column(name="nombre", length=85)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    @Column(name="ciudad", length=45)
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Column(name="codigo_postal", length=5)
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @Column(name="telefono", length=12)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="celular", length=12)
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    @Column(name="correo", length=85)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Column(name="nss", length=12)
    public String getNss() {
        return this.nss;
    }
    
    public void setNss(String nss) {
        this.nss = nss;
    }
    
    @Column(name="region", length=45)
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_ingreso", length=10)
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_nacimiento", length=10)
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Column(name="salario", precision=8)
    public BigDecimal getSalario() {
        return this.salario;
    }
    
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
    @Column(name="coyuge", length=90)
    public String getCoyuge() {
        return this.coyuge;
    }
    
    public void setCoyuge(String coyuge) {
        this.coyuge = coyuge;
    }
    
    @Column(name="contacto", length=90)
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    @Column(name="telefono_contacto", length=12)
    public String getTelefonoContacto() {
        return this.telefonoContacto;
    }
    
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
    @Column(name="cargo", length=45)
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Column(name="nota", length=65535)
    public String getNota() {
        return this.nota;
    }
    
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    @Column(name="fotografia")
    public byte[] getFotografia() {
        return this.fotografia;
    }
    
    public void setFotografia(byte[] fotografia) {
        this.fotografia = fotografia;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="empleados")
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="empleados")
    public Set<Pedidos> getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set<Pedidos> pedidoses) {
        this.pedidoses = pedidoses;
    }




}


