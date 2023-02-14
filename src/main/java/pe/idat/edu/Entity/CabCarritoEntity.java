package pe.idat.edu.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder           
@AllArgsConstructor 
@NoArgsConstructor  
@Data        
@Entity(name = "CabCarritoEntity")
@Table(name = "cabcarrito")
public class CabCarritoEntity implements Serializable{
    private final static long serialVersionUID = 1L;
    
    @Id
    @Column(name = "idcabcarrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcabcarrito;     
    
    @ManyToOne
    @JoinColumn(name="idusuario", nullable = false)
    private UsuarioEntity idusuario;
    
    @Column(name = "estado")
    private boolean estado;    
}
