package biocosmetik.data.objects;
// Generated 28-feb-2013 22:05:42 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * InventarioProductos generated by hbm2java
 */
@Entity
@Table(name = "inventario_productos", catalog = "biocosmetik")
public class InventarioProductos implements java.io.Serializable {

    private int id;
    private Productos producto;
    private StatusInventario statusInventario;
    private TipoEntradaInventario tipoEntradaInventario;
    private String lote;
    private BigDecimal cantidad;

    public InventarioProductos() {
    }

    public InventarioProductos(int id, Productos producto, StatusInventario statusInventario, TipoEntradaInventario tipoEntradaInventario) {
        this.id = id;
        this.producto = producto;
        this.statusInventario = statusInventario;
        this.tipoEntradaInventario = tipoEntradaInventario;
    }

    public InventarioProductos(int id, Productos producto, StatusInventario statusInventario, TipoEntradaInventario tipoEntradaInventario, String lote, BigDecimal cantidad) {
        this.id = id;
        this.producto = producto;
        this.statusInventario = statusInventario;
        this.tipoEntradaInventario = tipoEntradaInventario;
        this.lote = lote;
        this.cantidad = cantidad;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto", nullable = false)
    public Productos getProducto() {
        return this.producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_inventario", nullable = false)
    public StatusInventario getStatusInventario() {
        return this.statusInventario;
    }

    public void setStatusInventario(StatusInventario statusInventario) {
        this.statusInventario = statusInventario;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_entrada_inventario", nullable = false)
    public TipoEntradaInventario getTipoEntradaInventario() {
        return this.tipoEntradaInventario;
    }

    public void setTipoEntradaInventario(TipoEntradaInventario tipoEntradaInventario) {
        this.tipoEntradaInventario = tipoEntradaInventario;
    }

    @Column(name = "lote", length = 45)
    public String getLote() {
        return this.lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Column(name = "cantidad", precision = 8)
    public BigDecimal getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
}
