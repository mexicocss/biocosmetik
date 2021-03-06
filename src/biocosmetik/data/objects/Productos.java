package biocosmetik.data.objects;
// Generated 28-ene-2013 11:26:33 by Hibernate Tools 3.2.1.GA


import java.util.Date;
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
 * Productos generated by hbm2java
 */
@Entity
@Table(name="productos"
    ,catalog="biocosmetik"
)
public class Productos implements java.io.Serializable {


     private Integer id;
     private EdicionProducto edicionProducto;
     private SubcategoriaProducto subcategoriaProducto;
     private TipoProducto tipoProducto;
     private Publico publico;
     private UnidadMedida unidadMedida;
     private EstadoProducto estadoProducto;
     private Clientes clientes;
     private CategoriaProducto categoriaProducto;
     private LineaProductos lineaProductos;
     private int consecutivo;
     private String nombre;
     private String descripcion;
     private int contenidoNeto;
     private Float equivalenteKg;
     private String ubicacionPt;
     private String ubicacionGranel;
     private int claveAsignadaCliente;
     private int precio;
     private Date fecha;
     private EspecificacionesProducto especificacionesProductos;

    public Productos() {
    }

	
    public Productos(EdicionProducto edicionProducto, SubcategoriaProducto subcategoriaProducto, TipoProducto tipoProducto, Publico publico, UnidadMedida unidadMedida, EstadoProducto estadoProducto, Clientes clientes, CategoriaProducto categoriaProducto, LineaProductos lineaProductos, int consecutivo, String nombre, int contenidoNeto, int claveAsignadaCliente, int precio) {
        this.edicionProducto = edicionProducto;
        this.subcategoriaProducto = subcategoriaProducto;
        this.tipoProducto = tipoProducto;
        this.publico = publico;
        this.unidadMedida = unidadMedida;
        this.estadoProducto = estadoProducto;
        this.clientes = clientes;
        this.categoriaProducto = categoriaProducto;
        this.lineaProductos = lineaProductos;
        this.consecutivo = consecutivo;
        this.nombre = nombre;
        this.contenidoNeto = contenidoNeto;
        this.claveAsignadaCliente = claveAsignadaCliente;
        this.precio = precio;
    }
    public Productos(EdicionProducto edicionProducto, SubcategoriaProducto subcategoriaProducto, TipoProducto tipoProducto, Publico publico, UnidadMedida unidadMedida, EstadoProducto estadoProducto, Clientes clientes, CategoriaProducto categoriaProducto, LineaProductos lineaProductos, int consecutivo, String nombre, String descripcion, int contenidoNeto, Float equivalenteKg, String ubicacionPt, String ubicacionGranel, int claveAsignadaCliente, int precio, Date fecha, EspecificacionesProducto especificacionesProductos) {
       this.edicionProducto = edicionProducto;
       this.subcategoriaProducto = subcategoriaProducto;
       this.tipoProducto = tipoProducto;
       this.publico = publico;
       this.unidadMedida = unidadMedida;
       this.estadoProducto = estadoProducto;
       this.clientes = clientes;
       this.categoriaProducto = categoriaProducto;
       this.lineaProductos = lineaProductos;
       this.consecutivo = consecutivo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.contenidoNeto = contenidoNeto;
       this.equivalenteKg = equivalenteKg;
       this.ubicacionPt = ubicacionPt;
       this.ubicacionGranel = ubicacionGranel;
       this.claveAsignadaCliente = claveAsignadaCliente;
       this.precio = precio;
       this.fecha = fecha;
       this.especificacionesProductos = especificacionesProductos;
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
    @JoinColumn(name="edicion_producto", nullable=false)
    public EdicionProducto getEdicionProducto() {
        return this.edicionProducto;
    }
    
    public void setEdicionProducto(EdicionProducto edicionProducto) {
        this.edicionProducto = edicionProducto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="subcategoria", nullable=false)
    public SubcategoriaProducto getSubcategoriaProducto() {
        return this.subcategoriaProducto;
    }
    
    public void setSubcategoriaProducto(SubcategoriaProducto subcategoriaProducto) {
        this.subcategoriaProducto = subcategoriaProducto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_producto", nullable=false)
    public TipoProducto getTipoProducto() {
        return this.tipoProducto;
    }
    
    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="publico", nullable=false)
    public Publico getPublico() {
        return this.publico;
    }
    
    public void setPublico(Publico publico) {
        this.publico = publico;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="unidad_medida", nullable=false)
    public UnidadMedida getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="estado_producto", nullable=false)
    public EstadoProducto getEstadoProducto() {
        return this.estadoProducto;
    }
    
    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cliente", nullable=false)
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="categoria", nullable=false)
    public CategoriaProducto getCategoriaProducto() {
        return this.categoriaProducto;
    }
    
    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="linea_productos", nullable=false)
    public LineaProductos getLineaProductos() {
        return this.lineaProductos;
    }
    
    public void setLineaProductos(LineaProductos lineaProductos) {
        this.lineaProductos = lineaProductos;
    }
    
    @Column(name="consecutivo", nullable=false)
    public int getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }
    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="descripcion", length=90)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="contenido_neto", nullable=false)
    public int getContenidoNeto() {
        return this.contenidoNeto;
    }
    
    public void setContenidoNeto(int contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }
    
    @Column(name="equivalente_kg", precision=12, scale=0)
    public Float getEquivalenteKg() {
        return this.equivalenteKg;
    }
    
    public void setEquivalenteKg(Float equivalenteKg) {
        this.equivalenteKg = equivalenteKg;
    }
    
    @Column(name="ubicacion_pt", length=45)
    public String getUbicacionPt() {
        return this.ubicacionPt;
    }
    
    public void setUbicacionPt(String ubicacionPt) {
        this.ubicacionPt = ubicacionPt;
    }
    
    @Column(name="ubicacion_granel", length=45)
    public String getUbicacionGranel() {
        return this.ubicacionGranel;
    }
    
    public void setUbicacionGranel(String ubicacionGranel) {
        this.ubicacionGranel = ubicacionGranel;
    }
    
    @Column(name="clave_asignada_cliente", nullable=false)
    public int getClaveAsignadaCliente() {
        return this.claveAsignadaCliente;
    }
    
    public void setClaveAsignadaCliente(int claveAsignadaCliente) {
        this.claveAsignadaCliente = claveAsignadaCliente;
    }
    
    @Column(name="precio", nullable=false)
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fecha", length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="productos")
    public EspecificacionesProducto getEspecificacionesProductos() {
        return this.especificacionesProductos;
    }
    
    public void setEspecificacionesProductos(EspecificacionesProducto especificacionesProductos) {
        this.especificacionesProductos = especificacionesProductos;
    }




}


