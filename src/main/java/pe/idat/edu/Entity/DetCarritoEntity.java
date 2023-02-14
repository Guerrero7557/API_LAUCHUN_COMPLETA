package pe.idat.edu.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="DetCarritoEntity")
@Table(name="detcarrito")
public class DetCarritoEntity implements Serializable{
    
    private final static long serialVersionUID = 1L;
    
    @Id
    @Column(name = "iddetcarrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddetcarrito;     
    
    @ManyToOne
    @JoinColumn(name="idcabcarrito", nullable = false)
    private CabCarritoEntity idcabcarrito;
    
    @ManyToOne
    @JoinColumn(name="idproducto", nullable = false)
    private ProductoEntity idproducto;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "montoprod")
    private double montoprod;
    
}
