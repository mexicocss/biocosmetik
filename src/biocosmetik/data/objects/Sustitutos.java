package biocosmetik.data.objects;
// Generated 26-ene-2013 15:51:06 by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Sustitutos generated by hbm2java
 */
@Entity
@Table(name = "sustitutos", catalog = "biocosmetik")
public class Sustitutos implements java.io.Serializable {

    private Integer id;
    private MateriaPrima materiaPrima;
    private MateriaPrima sustituto;
    private String observaciones;

    public Sustitutos() {
    }

    public Sustitutos(MateriaPrima materiaPrima, MateriaPrima sustituto) {
        this.materiaPrima = materiaPrima;
        this.sustituto = sustituto;
    }

    public Sustitutos(MateriaPrima materiaPrima, MateriaPrima sustituto, String observaciones) {
        this.materiaPrima = materiaPrima;
        this.sustituto = sustituto;
        this.observaciones = observaciones;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_prima", nullable = false)
    public MateriaPrima getMateriaPrima() {
        return this.materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sustituto", nullable = false)
    public MateriaPrima getSustituto() {
        return this.sustituto;
    }

    public void setSustituto(MateriaPrima sustituto) {
        this.sustituto = sustituto;
    }

    @Column(name = "observaciones", length = 65535)
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
